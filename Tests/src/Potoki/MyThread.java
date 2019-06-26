package Potoki;

public class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread (String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThread createAndStart (String name, TickTock tt) {
        MyThread myThrd = new MyThread(name, tt);

        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        try {
            if (thrd.getName().compareTo("Tick") == 0) {
                for (int i = 0; i < 5; i++) {
                    ttOb.tick(true);
                    thrd.sleep(500);
                }
                ttOb.tick(false);
            } else {
                for (int i = 0; i < 5; i++) {
                    thrd.sleep(500);
                    ttOb.tock(true);
                }
                ttOb.tock(false);
            }
        }
        catch (InterruptedException exc){
            System.out.println("Error");
        }
    }
}