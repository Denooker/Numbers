package Svetofor;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(tl);
        thrd.start();

        for (int i=0; i<3; i++){
            System.out.println(tl.getColor());
            tl.waitForChanged();
        }
        tl.cancel();
    }
}
