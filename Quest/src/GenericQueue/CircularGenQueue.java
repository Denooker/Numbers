package GenericQueue;

public class CircularGenQueue<T> implements IgenQ<T> {

    private T q[];
    private int putloc, getloc;

    public CircularGenQueue (T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    public void put (T obj) throws QueueFullException {
        if (putloc+1==getloc |
                ((putloc==q.length-1)&(getloc==0))){
            throw new QueueFullException(q.length);
        }

        q[putloc++] = obj;
        if (putloc == q.length) putloc = 0;
    }

    public T get() throws QueueEmptyException{
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }

        T ch = q[getloc++];
        if(getloc == q.length) getloc = 0;
        return ch;
    }
}
