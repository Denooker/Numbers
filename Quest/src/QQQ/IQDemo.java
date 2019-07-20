package QQQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        for (i=0; i < 10; i++)
            iQ.put((char)('A'+i));

        iQ = q3;
        for (i=0; i < 10; i++)
            iQ.put((char)('A'+i));

        ThreadQueue mt1 = ThreadQueue.createAndStart("Fixed", q1, q3);
        ThreadQueue mt2 = ThreadQueue.createAndStart("Circle", q1, q3);



    }
}
