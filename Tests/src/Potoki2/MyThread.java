package Potoki2;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }


    public void run() {
        System.out.println(getName() + " - start.");
        try{
            for (int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", state: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " crush.");
        }
    }
}
