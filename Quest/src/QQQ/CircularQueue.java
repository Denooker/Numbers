package QQQ;

public class CircularQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public synchronized void put(char ch){
        if(putloc+1 == getloc|
                ((putloc == q.length-1)&(getloc == 0))){
            System.out.println(" - Очередь заполнена");
            notifyAll();
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length) putloc = 0;
        try {
            wait();
        }
        catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }

    public synchronized char get(){
        if(getloc == putloc){
            System.out.println(" - Очередь пуста");
            notifyAll();
            return (char) 0;
        }
        char ch = q[getloc++];
        try {
            wait();
            if(getloc == q.length) getloc = 0;
            return q[getloc];
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
//        for (int i=0; i<v.length;i++){
//            q[i]=v[i];
//        }
//    }
}
