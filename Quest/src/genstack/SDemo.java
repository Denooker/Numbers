package genstack;

public class SDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenStack<Integer> stk1 = new GenStack<>(iStore);

        String name[] = {"one", "two", "three"};
        String strStore[] = new String[3];
        GenStack<String> stk2 = new GenStack<>(strStore, name);

        String str;
        int n=0;

        try {
            for (int i = 0; i < 10; i++) {
                stk1.push(i);
            }
        } catch (StackFullException exc){
            System.out.println(exc);
        }

        String strStore2[] = new String[3];
        GenStack<String> stk3 = new GenStack<>(strStore2, stk2);


        try {
        System.out.print("Содержимое стека номер 1: ");
            for (int i = 0; i < 10; i++) {
                n = stk1.pop();
                System.out.print(n + " ");
            }

        System.out.println("\n");

        System.out.print("Содержимое стека номер 2: ");
            for (int i = 0; i < 3; i++) {
                str = stk2.pop();
                System.out.print(str + " ");
            }

        System.out.println("\n");

        System.out.print("Содержимое стека номер 3: ");
            for (int i = 0; i < 3; i++) {
                str = stk3.pop();
                System.out.print(str + " ");
            }
        } catch (StackEmptyException exc){
            System.out.println(exc);
        }
    }
}
