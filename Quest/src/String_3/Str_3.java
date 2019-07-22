package String_3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str_3 {

    public static void countYZ (String s){
        Pattern pattern;
        Matcher matcher;
        int i = 0;
        pattern = Pattern.compile("\\b([a-z]|[A-Z])*[zyZY]\\b");
        matcher = pattern.matcher(s);
        while (matcher.find()){
            i+=1;
        }
        System.out.println(i);
    }

    public static void withoutString (String a, String b){
        ArrayList<String> slova = new ArrayList<>();
        int k = 0;
        for (int i=0; i<a.length();i++){
            if (a.charAt(i)==' ') {
                slova.add(a.substring(k,i));
                k = i+1;
            }
        }
        for (String x: slova) System.out.println(x);
    }
}
