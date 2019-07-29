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

    }

