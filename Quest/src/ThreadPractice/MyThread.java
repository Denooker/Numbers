package ThreadPractice;

public class MyThread implements Runnable {
    Thread thrd;

    MyThread (String name){
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart (String name){
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc){
            System.out.println("Error");
        }
    }
}
