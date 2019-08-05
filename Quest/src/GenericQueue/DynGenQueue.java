package GenericQueue;

public class DynGenQueue<T> implements IgenQ<T> {
    private T q[];
    private int putloc, getloc;

    public DynGenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj) {
        if (putloc==q.length) {
            T t[] = (T[]) new Object[q.length*2];
            for (int i=0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }
        q[putloc++] = obj;
    }

    public T get() throws QueueEmptyException{
        if (getloc==putloc) throw new QueueEmptyException();
        return q[getloc++];
    }
}
