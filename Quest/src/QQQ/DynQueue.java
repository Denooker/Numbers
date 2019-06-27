package QQQ;

public class DynQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public DynQueue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    public synchronized void put (char ch){
        if (putloc == q.length){
            char t[] = new char[q.length*2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }

    public synchronized char get(){
        if(getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

    //    public void reset(){
//        putloc = getloc = 0;
//        char r[] = new char[q.length];
//        q = r;
//    }

//    public void copy(char v[]){
//        for (int i=0; i<q.length;i++){
//            q[i]=v[i];
//        }
//    }
}
