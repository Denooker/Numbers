import java.util.Scanner;

public class Klass {

    public String str[];
    private static String word;

    Klass (String s[]){
        str = s;
    }

    //Ввод слов
    public static String Consol(){
        Scanner a = new Scanner(System.in);
        return word = a.nextLine();
    }

    //Ввод кол-ва слов
    public static int kolvo(){
        System.out.println("Введите кол-во строк");
        Scanner N = new Scanner(System.in);
        int k = N.nextInt();
        return k;
    }

//    //1. Нахождение самой длиной и самой короткой строк и вывод их с длиной.
//    public void SearchLongestAndShortestStrings (){
//        for(int i = 0; i < str.length; i++){
//            for(int j = i; j < str.length; j++) {
//                if (str[i].length() > str[j].length()){
//                    String t = str[j];
//                    str[j]=str[i];
//                    str[i] = t;
//                }
//            }
//        }
//        System.out.println("Самая длинная строка: " + str[str.length-1] + " Ее длина " + str[str.length-1].length());
//        System.out.println("Самая короткая строка: " + str[0] + " Ее длина " + str[0].length());
//    }

//    //2. Вывести строки в порядке возрастания их длины
//    public void SortString (){
//        for(int i = 0; i < str.length; i++){
//            for(int j = i; j < str.length; j++) {
//                if (str[i].length() > str[j].length()){
//                    String t = str[j];
//                    str[j]=str[i];
//                    str[i] = t;
//                }
//            }
//        }
//        for(String x : str){
//            System.out.println(x);
//        }
//    }

//    //3. вывести строки длина которых больше средней длины введеных строк, а также их длину
//    public void StringAverage (){
//        int sum = 0;
//        for(String x : str){
//            sum += x.length();
//        }
//        int average = sum/str.length;
//        System.out.println("Средняя длина строк " + average);
//        for(String y : str){
//            if(y.length()>average) System.out.println(y + " " + y.length());
//        }
//    }

//    //4. Нахождение слов, с минимальным кол-вом одинковых символов(НЕ ЗАКОНЧЕНО)
//    public void MinChar(){
//        int N; String line = "";
//        for (int i = 0; i < str.length; i++){
//            int M = 0;
//            for (int j = 0; j < str[i].length(); j++){
//                for (int t = 1+j; t < str[i].length();t++){
//                    if (str[i].charAt(t) == str[i].charAt(j)) M++;
//                }
//            }
//            N = M; line = str[i];
//        }
//        System.out.println(N + " " + line);
//    }

//    //5.Нахождение слов, состоящих только из букв лат. алф., а также с равным числом гласных и согласных букв
//    public void LatLetter (){
//        for(String X : str){
//
//            int V = 0;
//            int A = 0;
//            int B = 0;
//
//            for (int i = 0; i < X.length(); i++){
//                if (X.charAt(i) >= 'a' & X.charAt(i) <= 'z') V++;
//            }
//
//            for (int i = 0; i < X.length(); i++){
//                if (X.charAt(i) == 'e' | X.charAt(i) == 'y' | X.charAt(i) == 'u' | X.charAt(i) == 'i' | X.charAt(i) == 'o' | X.charAt(i) == 'a' | X.charAt(i) == 'a') A++;
//                else B++;
//            }
//
//                if (V == X.length() & A == B) System.out.println(X);
//        }
//    }

//    //6. Нахождение слов, символы в котором идут в порядке возрастания, вывести первое из них
//    public void FindSortWords (){
//        for(String X : str){
//
//            int V = 1;
//
//            for (int i = 0; i < X.length()-1; i++){
//                if (X.charAt(i+1)>X.charAt(i)) V++;
//            }
//
//            if (V == X.length()){
//                System.out.println(X);
//                break;
//            }
//        }
//    }

//    //7. Нахождение первого слова, состоящего из различных символов
//    public void FindWordWithDifferentChar (){
//        for(String X : str){
//            int V = 0;
//            for (int i = 0; i < X.length(); i++){
//                for(int j = i + 1; j < X.length(); j++){
//                    if (X.charAt(i) == X.charAt(j)) V++;
//                }
//            }
//            if (V == 0) {
//                System.out.println(X);
//                break;
//            }
//        }
//    }

//    //8. Найти второй палиндром из слов, состоящих из цифр(НЕ ЗАКОНЧЕНО)
//    public void Palindrom (){
//        String []q = new String[str.length];
//        for(int X = 0; X < str.length; X++){
//
//            int A = 0;
//            int V = 0;
//            //Нахождение слова из цифр
//            for (int a = 0; a < str[X].length(); a++){
//                if (str[X].charAt(a) > '0' & str[X].charAt(a) < '9') A++;
//            }
////            System.out.println(A);
//
//            //Нахождение палиндрома из слов из цифр
//            if (A == str[X].length()) {
//                for (int i = 0; i < str[X].length() / 2; i++) {
//                    if ((str[X].charAt(i) - str[X].charAt(str[X].length() - (i + 1))) == 0) V++;
//                }
//            }
////            System.out.println(V);
//
//            //Присвоение новому массиву искомых слов
//            if (V == str[X].length()/2) q[X] = str[X];
//        }
//
//        for (int j = 0; j < q.length; j++) {
//            if (q[j].equals("")) continue;
//                System.out.println(q[j]);
//            }
//        }

//        if (q[1].equals("null")) System.out.println(q[0]);
//        else System.out.println(q[1]);


//    //9. Матрица
//    public static void Matrix(){
//        for (int i = 1; i < 26; i ++){
//            if (i%5 == 0) System.out.print(i + "\n");
//            else System.out.print(i + "\t");
//        }
//    }

}

