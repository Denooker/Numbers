package LambdaArgument;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaArgumentDemo {

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная cтрока: " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("Обращенная строка: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Строка с замененными пробелами: " + outStr);

        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);

        System.out.println("Строка с обращенным регистром букв: " + outStr);

//        outStr = changeStr((str) -> {
//            String result="";
//            Pattern pattern = Pattern.compile("\\s*");
//            Matcher matcher = pattern.matcher(str);
//            while (matcher.find()){
//               result = str.substring(matcher.start(),matcher.end());
//            }
//            return result;
//        }, inStr);
//
//        System.out.println(outStr);

        outStr = changeStr((str) -> str.replaceAll("\\s", "")
        ,inStr);

        System.out.println(outStr);
    }
}
