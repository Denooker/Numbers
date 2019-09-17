package Warmup_2;

public class Warmup_2_Demo {

    static int binarySearch(int[] m, int key){
        int left = -1;
        int right = m.length;
        while (right - 1 > left){
            int center = (right + left) / 2;
            if (m[center] > key){
                right = center;
            }
            else {
                left = center;
            }
        }
        return right;
    }

    public static void main(String[] args) {

//        System.out.println(Warm_2.stringTimes("ab",3));
//        System.out.println(Warm_2.doubleX("abcvvxtx"));
//        System.out.println(Warm_2.last2("ababcvvxab"));
//        System.out.println(Warm_2.array123(3,5,1,1,2,4,4));
//        System.out.println(Warm_2.altPairs("AbcDefDhiDklMnJ"));
//        System.out.println(Warm_2.noTriples(3,5,1,1,2,4,4,4));
//        System.out.println(Warm_2.frontTimes("Ab",3));
//        System.out.println(Warm_2.stringBits("0123456789"));
//        System.out.println(Warm_2.arrayCount9(3,9,9,1,9,4,4,4));
//        System.out.println(Warm_2.stringMatch("a11b111c1","111y111j111"));
//        System.out.println(Warm_2.stringYak("0123456789yak"));
//        System.out.println(Warm_2.has271(1,1,1,10,15,8,5,1));
//        System.out.println(Warm_2.countXX("asxxxcdvxxx"));
//        System.out.println(Warm_2.stringSplosion("1234"));
//        System.out.println(Warm_2.arrayFront9(1,2,9,5,6));
//        System.out.println(Warm_2.stringX("xaxxabx"));
//        System.out.println(Warm_2.array667(1,6,6,6,7,6,7));

        //двоичный поиск

        int[] massive = new int[10];

        for(int i = 0; i < massive.length; i++){
            massive[i] = i+5;
        }
        for (int x : massive) System.out.print(x + " ");

        System.out.println();

        System.out.println(Warmup_2_Demo.binarySearch(massive, 7));













    }
}
