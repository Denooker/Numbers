import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Learn {
    public static void main(String[] args) {

//        String p[] = new String[Klass.kolvo()];
//
//        //Заполнение массива
//        System.out.println("Вводите строки");
//        for (int i = 0; i < p.length; i++){
//            p[i] = Klass.Consol();
//        }
//
//        Klass stk1 = new Klass(p);

//        //Вывод элементов массива
//        for (int a = 0; a < stk1.str.length; a++)
//            System.out.println(stk1.str[a]);


//        stk1.SearchLongestAndShortestStrings();
//        stk1.SortString();
//        stk1.StringAverage();
//        stk1.LatLetter();
//        stk1.FindSortWords();
//        stk1.FindWordWithDifferentChar();
//        stk1.Palindrom();
//        Klass.Matrix();

//        try {
//        String str = " -Example. It, measures-your: \"typing\" - speed? for! (each) individual key, and uses this data to generate random";
//        int klw = 1;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)==' ') klw++;
//        }
//        String StrArr[] = new String[klw];
//        System.out.println(klw);
//        int j = 0;
//        String V = "";
//        for (int i = 0; i < str.length(); i++) {
//            if ((str.charAt(i)>='a')&(str.charAt(i)<='z')|(str.charAt(i)>='A')&(str.charAt(i)<='Z')){
//                V = V.concat(str.substring(i,i+1));
//                if (i+1==str.length()) StrArr[j] = V;
////                System.out.println(V);
//            }
//            else {
//                if (V.length()!=0) {
//                    StrArr[j]=V;
//                    j++;
//                }
//                V = "";
//            }
//        }
//            for (String i : StrArr) System.out.println(i);
//        } catch (ArrayIndexOutOfBoundsException exc) {
//            System.out.println("Error");
//        }
//        catch (StringIndexOutOfBoundsException exc){
//           System.out.println("Oups");
//        }

        int Arr[] = {1, 3, 5, 9, 25, 6, 95, 4, 5};

        for (int i=0; i<Arr.length; i++){
            for (int j = 1; j<Arr.length;j++){
                if (i<j)
            }
        }

        for (int i=0; i<Arr.length; i++){
            System.out.print(Arr[i] + "\t");
        }


    }
}
