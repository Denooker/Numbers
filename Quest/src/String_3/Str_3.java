package String_3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str_3 {

    public static void countYZ(String s) {
        Pattern pattern;
        Matcher matcher;
        int i = 0;
        pattern = Pattern.compile("\\b([a-z]|[A-Z])*[zyZY]\\b");
        matcher = pattern.matcher(s);
        while (matcher.find()) {
            i += 1;
        }
        System.out.println(i);
    }

    public static void withoutString(String a, String b) {
        ArrayList<String> slova = new ArrayList<>();
        int k = 0;
        int dlina = b.length();
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetter(a.charAt(i))) {
                slova.add(a.substring(k, i + 1));
                k = i + 1;
            } else if (i == a.length() - 1) {
                slova.add(a.substring(k));
            }
        }
        for (int i = 0; i < slova.size(); i++) {
            if (slova.get(i).indexOf(b)>0) {
                slova.set(i, slova.get(i).substring(0, slova.get(i).indexOf(b))
                        .concat(slova.get(i).substring(slova.get(i).indexOf(b) + dlina)));
            }
            else if (slova.get(i).indexOf(b)==0){
                slova.set(i, slova.get(i).substring(b.length()));
            }
        }
        String v = slova.get(0);
        for (int i=0; i<slova.size()-1; i++){
            v = v.concat(slova.get(i+1));
        }
        System.out.println(v);

//        for (String X : slova) System.out.println(X);
        }

        public static void equalsIsNot (String a){
        int counterIs = 0;
        int counterNot = 0;
        boolean answ = false;
        for (int i = 0; i < a.length()-1; i++){
            if (a.charAt(i)=='i'&a.charAt(i+1)=='s') counterIs++;
            if (i<a.length()-2) {
                if (a.charAt(i) == 'n' & a.charAt(i + 1) == 'o' & a.charAt(i + 2) == 't') counterNot++;
            }
        }
        if (counterIs == counterNot) answ = true;
            System.out.println(answ);
        }

        public static void gHappy (String a){
        int counter = 0;
        boolean answ = false;
        if (a.charAt(0)=='g'&a.charAt(1)!='g') counter++;
        if (a.charAt(a.length()-2)!='g'&a.charAt(a.length()-1)=='g') counter++;
        for (int i=1; i<a.length()-1; i++){
            if (a.charAt(i)=='g'&a.charAt(i+1)!='g'&a.charAt(i-1)!='g') counter++;
        }
        if (counter == 0) answ = true;
            System.out.println(answ);
        }

        public static void countTriple (String str){

        }

    }

