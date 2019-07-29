package Svetofor;

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
    }

    public void run() {
        while(!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify();
    }

    synchronized void waitForChanged(){
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel(){
        stop = true;
    }
}
