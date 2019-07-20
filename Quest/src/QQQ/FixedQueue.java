package QQQ;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if (putloc == q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
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

}
