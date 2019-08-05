package GenericQueue;

public class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

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
    }
}
