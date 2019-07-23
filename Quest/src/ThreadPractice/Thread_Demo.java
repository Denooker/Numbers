package ThreadPractice;

public class Thread_Demo {
    public static void main(String[] args) {

        MyThread.createAndStart("Thread1");

        for (int i=0; i<50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.print("Errrrrrr");
            }
        }
    }
}
