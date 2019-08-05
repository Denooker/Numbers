package GenericQueue;

public class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        Character mass[] = new Character[6];
        Integer Dmass[] = new Integer[5];
        GenQueue<Integer> q = new GenQueue<>(iStore);
        CircularGenQueue<Character> w = new CircularGenQueue<>(mass);
        DynGenQueue<Integer> d = new DynGenQueue<>(Dmass);

        Integer iVal;
        Character Mass;
        char ch;

        System.out.println("Демонстрация очереди числа типа Integer");
        try {
            for (int i = 0; i < 5; i ++) {
                System.out.println("Добавление " + i + " в очередь q");
                q.put(i);
            }
        } catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++){
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc);
        }

        System.out.println();


        System.out.println("Демонстрация кольцевой очереди символов типа Character");
        try {
            for (int i = 0; i < 5; i ++) {
                ch = (char)('a'+i);
                System.out.println("Добавление " + ch + " в очередь w");
                w.put(ch);
            }
        } catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 50; i++){
                System.out.print("Получение символа типа Character из очереди w: ");
                Mass = w.get();
                System.out.println(Mass);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc);
        }

        System.out.println();

        iVal = 0;


        System.out.println("Демонстрация динамической очереди числа типа Integer");

            for (int i = 0; i < 10; i ++) {
                System.out.println("Добавление " + i + " в очередь d");
                d.put(i);
            }

        System.out.println();

        try {
            for (int i = 0; i < 10; i++){
                System.out.print("Получение следующего числа типа Integer из очереди d: ");
                iVal = d.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }


}
