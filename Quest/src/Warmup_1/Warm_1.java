//https://codingbat.com/java/Warmup-1
package Warmup_1;

public class Warm_1 {

    public static boolean sleepIn (String week, String otpusk){
        boolean weekday, holiday;
        if (otpusk.equals("yes")) holiday = true;
        else holiday = false;
        if (week.equals("monday") | week.equals("tuesday") | week.equals("wednesday") | week.equals("thursday") | week.equals("friday")) weekday = true;
        else weekday = false;
        return  !weekday | holiday;
    }

    public static int diff21 (int n){
        return Math.abs(21 - n);
    }

    public static boolean nearHundred (int n){
        return (n > 89 & n < 111)|(n > 189 & n < 211);
    }

    public static String missingChar (String v, int n){
        return v.substring(0, n-1).concat(v.substring(n, v.length()));
    }

    public static String backAround (String v){
        return v.substring(0,1).concat(v).concat(v.substring(v.length()-1));
    }

    public static boolean startHi (String v){
        return v.startsWith("Hi");
    }

    public static boolean hasTeen (int n1, int n2, int n3){
        return (n1 > 12 & n1 < 20) | (n2 > 12 & n2 < 20) | (n3 > 12 & n3 < 20);
    }

    public static boolean mixStart (String v){
        return (v.charAt(1) == 'i') & (v.charAt(2) == 'x');
    }

    public static int close10 (int n1, int n2){
        if (Math.abs(10-n1) < Math.abs(10-n2)) return n1;
        else if (Math.abs(10-n1) == Math.abs(10-n2)) return 0;
        else return n2;
    }

    public static boolean stringE (String v){
        int V = 0;
        for (int i = 0; i < v.length(); i++){
            if ((v.charAt(i) == 'e')|(v.charAt(i) == 'E')) V++;
        }
        return (V > 0 & V < 4);
    }

    public static String everyNth (String v, int n){
        String V = " ";
        for (int i = 0; i < v.length(); i += n+1){
            V = V.concat(v.substring(i,i+1));
        }
        return V;
    }

    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        return ((aSmile & bSmile)|(!(aSmile | bSmile)));
    }

    public static boolean parrotTrouble (int n){
        return (n>=0 & n<7)|(n>20&n<=23);
    }

    public static boolean posNeg (int n1, int n2, boolean v){
        if (n1*n2<0) return true;
        else if (n1<0 & n2<0 & v) return true;
        else return false;
    }

    public static String frontBack (String v){
        return v.substring(v.length()-1).concat(v.substring(0,v.length()-1));
    }

    public static boolean or35 (int n){
        return (n%3==0 | n%5 == 0);
    }

    public static boolean icyHot (int n1, int n2){
        if (n1<0 & n2>100) return true;
        else if (n1>100 & n2<0) return true;
        else return false;
    }

    public static boolean loneTeen (int n1, int n2){
        if ((n1>12 & n1<20)&(n2>12 & n2<20)) return false;
        else if (n1>12 & n1<20) return true;
        else if (n2>12 & n2<20) return true;
        else return false;
    }

    public static String startOz (String v){
        int a = v.indexOf("o");
        int b = v.indexOf("z");
        if (a==0 & b==1)
            return v.substring(0,2);
        else if (a==0)
            return v.substring(0,1);
        else if (b==1)
            return v.substring(1,2);
        else return "Попробуйте еще";
    }

    public static boolean in3050 (int n1, int n2){
        return ((n1>29 & n1<41)&(n2>29 & n2<41))|((n1>39 & n1<51)&(n2>39 & n2<51));
    }

    public static boolean lastDigit (int n1, int n2){
        return n1%10==n2%10;
    }

    public static int sumDouble (int n1, int n2){
        if (n1==n2) return 2*(n1+n2);
        else return n1+n2;
    }

    public static boolean makes10 (int n1, int n2){
        return (n1==10|n2==10)|(n1+n2==10);
    }

    public static String notString (String v){
        if (v.startsWith("not")) return v;
        else return "not ".concat(v);
    }

    public static String front3 (String v){
        if (v.length()<3) return v;
        else return v.substring(0,3).concat(v.substring(0,3)).concat(v.substring(0,3));
    }

    public static String front22 (String v){
        if (v.length()<2) return "33".concat(v).concat("3");
        else return v.substring(0,2).concat(v.substring(0,2)).concat(v).concat(v.substring(0,2));
    }

    public static boolean in1020 (int n1, int n2){
        return ((n1>9&n1<21)|(n2>9&n2<21));
    }

    public static String delDel (String v){
        if (v.startsWith("del",1)) return v.substring(0,1).concat(v.substring(4));
        else return v;
    }

    public static int intMax (int ...v){
        int Max = 0;
        for (int i=0; i<v.length; i++){
            if (v[i]>Max) Max = v[i];
        }
        return Max;
    }

    public static int max1020 (int n1, int n2){
        int max = 0;
        if (n1>n2)  max = n1;
        else max = n2;
        if ((n1>9&n1<21)|(n2>9&n2<21)) return max;
        else return 0;
    }

    public static String endUp (String v){
        String fh = ""; String LH = "";
        try{
            fh = v.substring(0, v.length() - 3);
            String lh = v.substring(v.length() - 3, v.length());
            LH = lh.toUpperCase();
        }
        catch (StringIndexOutOfBoundsException src){
            return v.toUpperCase();
        }
        return fh.concat(LH);
    }











}
