package Logic_2;
//https://codingbat.com/java/Logic-2
public class Log_1 {
    public static boolean makeBricks(int a, int b, int c){
        if (c>=5&((c%5)==0)&((c-5*b)<=a)) return true;
        else if (c>5&((c%5)>0)&((c%5)<=a)) return true;
        else if (b==0&c<=a) return true;
        else return false;
    }

    public static int fixTeen(int n){
        if ((n>12&n<15)|(n>16)&(n<20)) return 0;
        else return n;
    }
    public static int noTeenSum (int a, int b, int c){
        return Log_1.fixTeen(a)+Log_1.fixTeen(b)+Log_1.fixTeen(c);
    }

    public static int blackjack(int a, int b){
        if (a>0&b>0&(a<22|b<22)){
            if (Math.abs(21-a)>Math.abs(21-b)) return b;
            else return a;
        }
        else return 0;
    }

    public static int loneSum(int ...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    a[j] = 0;
                    a[i]
                }
            }
        }
        for (int x : a) {
            sum += x;
        }
        return sum;
    }
}
