//https://codingbat.com/java/Warmup-2
package Warmup_2;

public class Warm_2 {

    public static String stringTimes (String v, int n){
        String V = "";
        for (int i=0; i<n; i++){
            V = V.concat(v);
        }
        return V;
    }

    public static boolean doubleX (String v){
        if (v.indexOf("xx")>0) return true;
        else return false;
    }

    public static int last2 (String v){
        String okonch = v.substring(v.length()-2);
        int kolvo = 0;
        for (int i=0; i<v.length()-3;i++){
            if (v.startsWith(okonch,i)) kolvo++;
        }
        return kolvo;
    }

    public static boolean array123 (int ...n){
        boolean A = false;
        boolean B = false;
        boolean C = false;
        for (int X:n){
            switch (X){
                case 1: A = true;
                break;
                case 2: B = true;
                break;
                case 3: C = true;
                break;
            }
        }
        return A&B&C;
    }

    public static String altPairs (String v){
        String V = "";
        for (int i = 0; i < v.length(); i+=3) {
            V = V.concat(v.substring(0 + i, 2 + i));
        }
        return V;
    }

    public static boolean noTriples (int ...n){
        int V = 0;
        for(int i=0;i<n.length-2;i++){
            if ((n[i]==n[i+1])&(n[i]==n[i+2])) {
                V = 1;
                break;
            }
        }
        if (V==0) return false;
        else return true;
    }

    public static String frontTimes (String v, int n){
        String V = "";
        if (v.length()<3) v = v.concat("1");
        for (int i=0; i<n;i++){
            V=V.concat(v.substring(0,3));
        }
        return V;
    }

    public static String stringBits (String v){
        String V = v.substring(0,1);
        for (int i=2; i<v.length();i=2+i){
            V = V.concat(v.substring(i,i+1));
        }
        return V;
    }

    public static int arrayCount9 (int ...n){
        int V = 0;
        for (int i:n){
            if (i==9) V++;
        }
        return V;
    }

    public static int stringMatch (String v1, String v2){
        int V = 0;
        v1 = v1.concat(" ");
        v2 = v2.concat(" ");
        if (v1.length()>v2.length()) {
            for (int i = 0; i<=v2.length()-1;i++){
                if ((v1.charAt(i)==v2.charAt(i))&(v1.charAt(i+1)!=v2.charAt(i+1))) V++;
            }
        }
        else {
            for (int i = 0; i < v1.length()-1; i++) {
                if ((v1.charAt(i)==v2.charAt(i))&(v1.charAt(i+1)!= v2.charAt(i+1))) V++;
            }
        }
        return V;
    }

    public static String stringYak (String v){
        for (int i=0; i<v.length(); i++){
            if (v.startsWith("yak",i)) {
                v = v.substring(0,i).concat(v.substring(i+3));
                break;
            }
        }
        return v;
    }

    public static boolean has271 (int ...n){
        boolean V = false;
        for (int i=0; i<n.length-3;i++){
            if ((n[i+1]-n[i]==5)&(n[i]-n[i+2]>1)) V = true;
        }
        return V;
    }

    public static int countXX (String v){
        int n=0;
        for (int i=0; i<v.length()-1; i++){
            if (v.startsWith("xx",i)) n++;
        }
        return n;
    }

    public static String stringSplosion (String v){
        String V = v.substring(0,1);
        for (int i=1; i<=v.length()-1; i++){
            V = V.concat(v.substring(0,i+1));
        }
        return V;
    }

    public static boolean arrayFront9 (int ...n){
        boolean N = false;
        if (n.length>4){
            for (int i=0; i<4;i++){
                if (n[i]==9) N = true;
            }
            return N;
        }
        else {
            for (int i=0; i<n.length; i++){
                if (n[i]==9) N =true;
            }
            return N;
        }
    }

    public static String stringX (String v){
        if (v.startsWith("x")|v.endsWith("x")) v = "x".concat(v = v.replace("x","")).concat("x");
        else v = v.replace("x","");
        return v;
    }

    public static int array667 (int ...n){
        int N=0;
        for (int i=0; i<n.length-1; i++){
            if ((n[i+1]==6|n[i+1]==7)&n[i]==6) N++;
        }
        return N;
    }








}
