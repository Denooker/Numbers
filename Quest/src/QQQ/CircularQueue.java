package QQQ;

public class CircularQueue implements ICharQ {

    public char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if(putloc+1 == getloc|((putloc == q.length-1)&(getloc == 0))){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length) putloc = 0;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        if(getloc == q.length) getloc = 0;
        return q[getloc++];
    }

    public void reset(){
        putloc = getloc = 0;
        char r[] = new char[q.length];
        q = r;
    }

    public void copy(char v[]){
        for (int i=0; i<v.length;i++){
            q[i]=v[i];
        }
    }
}
