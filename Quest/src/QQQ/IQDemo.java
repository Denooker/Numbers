package QQQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
//        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ThreadQueue mt1 = ThreadQueue.createAndStart("Fixed", q1, q3);
        ThreadQueue mt2 = ThreadQueue.createAndStart("Circle", q1, q3);

//        ICharQ iQ;
//
//        char ch;
//        int i;
//
//        iQ = q1;
//        for (i=0; i < 10; i++)
//            iQ.put((char)('A'+i));
//
//        System.out.println("Содержимое фиксированной очереди:");
//        for (i=0; i < 10; i++){
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q2;
//        for (i=0; i < 10; i++)
//            iQ.put((char)('Z'-i));
//
//
//
//        System.out.println("Содержимое динамической очереди:");
//        for (i=0; i < 10; i++){
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q3;
//        for (i=0; i < 10; i++)
//            iQ.put((char)('A'+i));
//
//
//
//        System.out.println("Содержимое кольцевой очереди:");
//        for (i=0; i < 10; i++){
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();

    }
}
