package GenericQueue;

public interface IgenQ<T> {

    void put (T ch) throws QueueFullException;

    T get () throws QueueEmptyException;
}
