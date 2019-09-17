package randomNumberFromArray;

public class RandomNumber_Demo {
    public static void main(String[] args) {
        int[] a = {10,25,39};
        int[] b = {3,5,7};

        RandomNumber first = new RandomNumber(a, b);

        System.out.println(first.getNumber());
    }
}
