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

    public static int loneSum(int a, int b, int c) {
        int a1 = a;
        int b1 = b;
        int c1 = c;

        if (a == b){
            a1 = 0;
            b1 = 0;
        }
        if (a == c){
            a1 = 0;
            c1 = 0;
        }
        if (b == c){
            b1 = 0;
            c1 = 0;
        }
        return a1+b1+c1;
    }

    public static int round10(int n){
        int ost = n%10;
        if (ost>=5) return n+(10-ost);
        else return n-ost;
    }

    public static int roundSum(int a, int b, int c){
        return round10(a)+round10(b)+round10(c);
    }

    public static boolean evenlySpaced (int a, int b, int c){
        int[] sort = new int[3];
        sort[0] = a;
        sort[1] = b;
        sort[2] = c;
        for(int i=0;i<sort.length;i++){
            for(int j = 0; j<sort.length;j++){
                if (sort[j]>sort[i]){
                    int vr = sort[i];
                    sort[i] = sort[j];
                    sort[j] = vr;
                }
            }
        }
        return ((sort[2]-sort[1])==(sort[1]-sort[0]));
    }

    public static int luckySum (int a, int b, int c){
        if (a==13) return 0;
        else if (b==13) return a;
        else if (c==13) return a+b;
        else return a+b+c;
    }


}
