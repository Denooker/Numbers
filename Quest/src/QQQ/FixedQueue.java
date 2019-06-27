package QQQ;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    public synchronized void put(char ch){
        if (putloc == q.length){
            System.out.println(" - Очередь заполнена");
            notifyAll();
            return;
        }
        q[putloc++] = ch;
        notifyAll();
        try {
                wait();
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }

    public synchronized char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            notifyAll();
            return (char) 0;
        }
        notifyAll();
        try {
            wait();
            return q[getloc++];
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание потока");
            return (char) 0;
        }
    }

//    public void reset(){
//        putloc = getloc = 0;
//        char r[] = new char[q.length];
//        q = r;
//    }
//
//    public void copy(char v[]){
//        for (int i=0; i<q.length;i++){
//            q[i]=v[i];
//        }
//    }
}
