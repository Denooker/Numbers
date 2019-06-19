package QQQ;

public class FixedQueue implements ICharQ {
    public char q[];
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

    public char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

    public void reset(){
        putloc = getloc = 0;
        char r[] = new char[q.length];
        q = r;
    }

    public void copy(char v[]){
        for (int i=0; i<q.length;i++){
            q[i]=v[i];
        }
    }
}
