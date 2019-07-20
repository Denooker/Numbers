package String_3;

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
        int first = a.indexOf(b);
        System.out.println(first);
        int last = a.lastIndexOf(b);
        System.out.println(last);
        String before = a.substring(0,first);
        System.out.println(before);
        String after = a.substring(last);
        System.out.println(after);
        String answer = before.concat(after);
        System.out.println(answer);
    }
}
