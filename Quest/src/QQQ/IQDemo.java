package QQQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        CircularDynQueue q4 = new CircularDynQueue(5);

        ICharQ iQ;

        char ch; int i;

        iQ = q4;

        for (i=0; i < 10; i++)
            iQ.put((char)('А'+i));

        System.out.println("Содержимое кольцевой динамической очереди:");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q1;
        for (i=0; i < 10; i++)
            iQ.put((char)('A'+i));

        iQ.copy(q4.q);

//        iQ.reset();

        System.out.println("Содержимое фиксированной очереди:");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q2;
        for (i=0; i < 10; i++)
            iQ.put((char)('Z'-i));

//        iQ.reset();

        System.out.println("Содержимое динамической очереди:");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;
        for (i=0; i < 10; i++)
            iQ.put((char)('A'+i));

//        iQ.reset();

        System.out.println("Содержимое кольцевой очереди:");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        for (i=10; i < 20; i++)
            iQ.put((char)('A'+i));

        iQ.copy(q2.q);

        System.out.println("Содержимое кольцевой очереди:");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных" + " кольцевой очереди.");

        for (i=0; i < 20; i++) {
            iQ.put((char)('A'+i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
