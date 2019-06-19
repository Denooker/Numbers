package FindWordClassPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class FindWordClass {
    private String Fname;

    public FindWordClass(String Fn) {
        Fname = Fn;
    }

    ArrayList<String> StrArr = new ArrayList<>();

    //Заносим слова в список
    public void putEng() {
        try (BufferedReader vhod = new BufferedReader(new FileReader(Fname))) {
            String str = vhod.readLine();
            do {
                String V = "";
                int k;
                //цикл перебирает все символы в строке
                for (int i = 0; i < str.length(); i++) {
                    if (i>0) k = i-1;
                    else k = str.length()-1;

                    if (((str.charAt(i) >= 'a') & (str.charAt(i) <= 'z')) |
                            ((str.charAt(i) >= 'A') & (str.charAt(i) <= 'z')) |
                            ((str.charAt(i) >= '0') & (str.charAt(i) <= '9'))) {
                        V = V.concat(str.substring(i, i + 1));

                        if (i + 1 == str.length()) {
                            StrArr.add(V);
                        }
                        //Наблюдение образования слова
//                        System.out.println(V);
                    }
                    else if ((((str.charAt(k) >= 'a') & (str.charAt(k) <= 'z')) |
                            ((str.charAt(k) >= 'A') & (str.charAt(k) <= 'Z')) |
                            ((str.charAt(k) >= '0') & (str.charAt(k) <= '9')))&
                            (str.charAt(i) == '-')){
                        V = V.concat(str.substring(i, i + 1));
                    }
                    else
                          if (V.length() != 0) {
                            StrArr.add(V);
                            V = "";
                    }
                }
                str = vhod.readLine();//пробегаемся по всем строкам
            } while (str != null);

            //Вывод элементов списка
            for (String X: StrArr) System.out.println(X);

        } catch (IOException exc) {
            System.out.println("Error");
        }
        catch (StringIndexOutOfBoundsException exc1){
            System.out.println("Error1");
        }
    }

    private int ch;
    public void putRus() {
        try (BufferedReader sym = new BufferedReader(new FileReader(Fname))) {
            int e=0;
            int ces=0;

            ArrayList<Integer> indList = new ArrayList<>();

                do {
                ch = sym.read();//пробегаемся по всем символам
                if (ch == 'а' || ch == 'е' || ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'о' || ch == 'я' || ch == 'и' || ch == 'ю' ||
                        ch == 'А' || ch == 'Е' || ch == 'У' || ch == 'Ы' || ch == 'Э' || ch == 'О' || ch == 'Я' || ch == 'И' || ch == 'Ю') {
                    e++;
                }
                if (ch == ' ') {
                    indList.add(e);
                }
                if (ch == '\n') {
                    e=0;
                }
            }while (ch != '\n');
                System.out.println(indList.size());

                for(int i=0;i<indList.size();i++) {
                    do {
                        ch = sym.read();//пробегаемся по всем символам
                        if (ch == 'а' || ch == 'е' || ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'о' || ch == 'я' || ch == 'и' || ch == 'ю' ||
                                ch == 'А' || ch == 'Е' || ch == 'У' || ch == 'Ы' || ch == 'Э' || ch == 'О' || ch == 'Я' || ch == 'И' || ch == 'Ю') {
                            e++;
                            System.out.print("["+e+"]"+"\t");
                        }
                        if ((ch == ' ')&(indList.get(i)==e)) {
                            ces++;
                            System.out.print(ces+"\t");
                        }
                        if ((ch == '\n')|(ch==-1)) {
                            if (ces==0) {
                                e=0;
                                System.out.println();
                                break;
                            }
                            else {
                                e = 0;
                                ces = 0;
                                System.out.println("("+indList.get(i)+")"+"\t");
                            }
                        }
                        if (ch==-1) System.out.println();
                    } while (ch != -1);
                }



        } catch (IOException exc) {
            System.out.println("Error");
        }
    }
}
