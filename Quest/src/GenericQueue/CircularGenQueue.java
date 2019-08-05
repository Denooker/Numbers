package GenericQueue;

public class CircularGenQueue<T> implements IgenQ<T> {

    private T q[];
    private int putloc, getloc;

    public CircularGenQueue (T[] aRef){
        q = aRef;

    }
}
