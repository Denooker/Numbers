package DZ1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DZclass {
    public static void main(String[] args) {
        //1. чему равно среднее число букв в слове;
//        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
//            String str = vhod.readLine();
//            int avr = 0;
//            int kolvo = 0;
//            do{
//                kolvo++;
//                avr += str.length();
//                System.out.println(str);
//                System.out.print(kolvo + "\t");
//                System.out.println(avr);
//                str = vhod.readLine();
//            } while (str!=null);
//            System.out.println("Средняя длиина слов : " + avr/kolvo);
//        } catch (IOException exc){
//          System.out.println("Error");
//        }


        //2. во сколько раз самая короткая строка короче самой длинной (в смысле количества слов в строке);
//        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
//            String str = vhod.readLine();
//            int kolvoslov = 0;
//            for (int i=0; i<str.length(); i++){
//                if (str.charAt(i)==' ') kolvoslov++;
//            }
//            int Wmin = kolvoslov;
//            int Wmax = kolvoslov;
//            do{
//                System.out.println(str);
//                System.out.println(Wmin + "\t" + Wmax);
//                kolvoslov = 0;
//                for (int i=0; i<str.length(); i++){
//                    if (str.charAt(i)==' ') kolvoslov++;
//                }
//                if (kolvoslov<Wmin) {
//                    Wmin = kolvoslov;
//                }
//                if (kolvoslov>Wmax) {
//                    Wmax = kolvoslov;
//                }
//                str = vhod.readLine();
//            } while (str!=null);
//            System.out.println("Самая короткая строка меньше самой длинной в : " + (Wmax+1)/(Wmin+1) + " раза.");
//        } catch (IOException exc){
//            System.out.println("Error");
//        }

        //3. во сколько раз слов длины 3 больше, чем слов длины 1 (если слов длины 1 нет вообще, программа должна об этом сообщить);
//        int k = 0;//кол-во пробелов в строке
//        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
//            String str = vhod.readLine();
//            do{
//                //вычисляем кол-во пробелов в строке
//                for (int i=0; i<str.length(); i++){
//                    if (str.charAt(i)==' ') k++;
//                }
//                k++;//получем кол-во слов в строке
//                System.out.println(str);
//                str = vhod.readLine();//проход каждой строки
//            } while (str!=null);
//        } catch (IOException exc){
//          System.out.println("Error");
//        }
//        System.out.println(k);
//        String StrArr[] = new String[k];//создаем массив для хранения слов
//
//        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
//            String str = vhod.readLine();
//            int klw = 0;//кол-во пробелов в строке
//            int p = 0;//индекс массива
//            do{
//                //присваем элементам массива слова
//                    int j = 0;
//                    String V = "";
//                    //цикл перебирает все символы в строке
//                    for (int i = 0; i < str.length(); i++) {
//                        //если символ равен знаку препинания то создается слово
//                        if (str.charAt(i) == '-' | str.charAt(i) == ' ' | str.charAt(i) == ',' | str.charAt(i) == '.' | str.charAt(i) == '"' | str.charAt(i) == ';' | str.charAt(i) == '(' | str.charAt(i) == ')' | str.charAt(i) == ':' | str.charAt(i) == '!' | str.charAt(i) == '?') {
//                            V = str.substring(j, i);//создание слова
//                            j = i + 1;//итерация для создания следующего слова
//                            if ((p < k) & (V.length() > 0)) {
//                                StrArr[p] = V;//занесение слова в массив
//                                p++;
//                            } else continue;
//                        }
//                    }
////                }
//                klw = 0;//сбрасываем счетчик пробелов
//                str = vhod.readLine();//пробегаемся по всем строкам
//            } while (str!=null);
//        } catch (IOException exc){
//            System.out.println("Error");
//        }
//        int three = 0;
//        int one = 0;
//        for (int i=0; i<StrArr.length;i++){
//            switch (StrArr[i].length()){
//                case 1: one++;
//                break;
//                case 3: three++;
//                break;
//            }
//        }
//        if (one > 0) System.out.println(three/one);
//        else System.out.println("Слов длиной 1 нет");

        //4. какой процент от общего количества слов не оканчивается знаком препинания (можно взять только запятую и точку);

        int k = 0;//кол-во пробелов в строке
        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
            String str = vhod.readLine();
            do {
                //вычисляем кол-во пробелов в строке
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ' ') k++;
                }
                k++;//получем кол-во слов в строке
                System.out.println(str);
                str = vhod.readLine();//проход каждой строки
            } while (str != null);
        } catch (IOException exc) {
            System.out.println("Error");
        }
        System.out.println("Количество пробелов " + k);
        String StrArr[] = new String[k];//создаем массив для хранения слов

        try (BufferedReader vhod = new BufferedReader(new FileReader("Abc.txt"))) {
            String str = vhod.readLine();
            int p = 0;//индекс массива
            do {
                //присваем элементам массива слова
                String V = "";
                //цикл перебирает все символы в строке
                for (int i = 0; i < str.length(); i++) {
                    if (((str.charAt(i) >= 'a') & (str.charAt(i) <= 'z')) | ((str.charAt(i) >= 'A') & (str.charAt(i) <= 'Z')) | ((str.charAt(i) >= '0') & (str.charAt(i) <= '9')) | str.charAt(i) == '.' | str.charAt(i) == ',') {
                        V = V.concat(str.substring(i, i + 1));
                        if (i + 1 == str.length()) {
                            StrArr[p] = V;
                            p++;
                        }
//                        System.out.println(V);
                    } else {
                        if (V.length() != 0) {
                            StrArr[p] = V;
                            p++;
                        }
                        V = "";
                    }
                }
                str = vhod.readLine();//пробегаемся по всем строкам
            } while (str != null);

            double i = 0;
            double j = 0;
            for (int c=0; c<92;c++) {
                if (!StrArr[c].equals("")) j++;
                if (((StrArr[c].charAt(StrArr[c].length() - 1) == '.' | StrArr[c].charAt(StrArr[c].length() - 1) == ','))&!(StrArr[c].equals(""))) i++;
            }
            System.out.println("Кол-во слов, оканчивающихся на з.п. " + i + "\t" + " Кол-во слов всего " + j);
            double proc = ((j - i) / j) * 100;
            System.out.print("Процент слов, не оканчивающихся на запятую или точку:" + Math.ceil(proc));

        } catch (IOException exc) {
            System.out.println("Error");
        }
        catch (NullPointerException exc1){
            System.out.println("ErrorNull");
        }
    }
}