package QQQ;

public class CircularDynQueue implements ICharQ {

    public char q[];
    private int putloc, getloc;

    public CircularDynQueue(int size){
        q = new char[size];
        putloc = getloc = 0;

    }

    public void reset(){
        putloc = getloc = 0;
        char r[] = new char[q.length];
        q = r;
    }

    public void put(char ch){
        if (putloc == q.length){
            char t[] = new char[q.length*2];
            for (int i = q.length; i < t.length; i++)
                t[i] = q[i-q.length];
            q = t;
            putloc = 0;
        }
        q[putloc++] = ch;
    }

    public char get(){
        if (getloc == q.length) getloc = 0;
        return q[getloc++];
    }

    public void copy(char v[]){
        for (int i=0; i<q.length;i++){
            q[i]=v[i];
        }
    }
}
