//https://codingbat.com/java/Recursion-1
package Recursion_1;

public class Recursion_1_Demo {

    public static int factorial (int n){
        if (n==1) return 1;
        return factorial(n-1)*n;
    }

    public static int fibonacci (int n) throws StackOverflowError{
        if (n<0) throw new StackOverflowError("n should be not negative");

        if (n==0) return 0;

        if (n==1|n==2) return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int bunnyEars (int n){
        if (n==1) return 2;
        return bunnyEars(n-1)+2;
    }

//    public static int bunnyEars2 (int n) {
//        if (n == 1) return 2;
//        return bunnyEars2(n-)
//
//    }





}
