package QQQ;

public class ThreadQueue implements Runnable {
    Thread thrd;
    FixedQueue fq;
    CircularQueue cq;

    ThreadQueue (String name, FixedQueue ff, CircularQueue cc){
        thrd = new Thread (this, name);
        fq = ff;
        cq = cc;
    }

    public static ThreadQueue createAndStart (String name, FixedQueue ff, CircularQueue cc) {
        ThreadQueue myThrd = new ThreadQueue(name, ff, cc);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
//            System.out.println("Содержимое фиксированной очереди:");
            for (int i=0; i < 10; i++){
                System.out.print(fq.get());
            }
//        System.out.println("Содержимое кольцевой очереди:");
            for (int i=0; i < 10; i++){
                System.out.print(cq.get());
            }
    }

}
