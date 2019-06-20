package FindWordClassPackage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    /**
     * Вам нужно написать программу, которая открывала бы файл, считывала из него стихотворение на русском языке
     * (для тестирования можно использовать приложенный файл vers.txt) и определяла, есть ли в этом стихотворении цезура,
     * то есть словораздел, регулярно приходящийся на одну и ту же позицию во всех строках. Позицией считается номер слога,
     * предшествующего слогоразделу.
     *
     * Если цезура находится, то нужно вывести на экран номер её позиции. Например, в стихотворении "Я памятник себе воздвиг нерукотворный..."
     * словораздел регулярно приходится на позицию после 6-го слога:
     *
     * Я памятник себе | воздвиг нерукотворный,
     * К нему не зарастёт | народная тропа.
     *
     * Соответственно, программа должна вывести "6".
     *
     * Помните, что теоретически цезура может быть в строке не одна
     * (если Вы хотите получить 9 или 10, нужно предусмотреть возможность существования нескольких цезур)
     * и что в записи стихотворений обычно используются пробельные строки между строфами (программа не должна их учитывать при расчёте).
     */
    private int ch;
    public void putRus() {
        try (BufferedReader sym = new BufferedReader(new FileReader(Fname))) {
            int e=0;//счетчик слогов

            ArrayList<Integer> indList = new ArrayList<>();//храним словоразделы первой строки

                do {
                ch = sym.read();
                //считаем слоги
                if (ch == 'а' || ch == 'е' || ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'о' || ch == 'я' || ch == 'и' || ch == 'ю' ||
                        ch == 'А' || ch == 'Е' || ch == 'У' || ch == 'Ы' || ch == 'Э' || ch == 'О' || ch == 'Я' || ch == 'И' || ch == 'Ю') {
                    e++;
                }
                //добавляем словораздел в список
                if (ch == ' ') {
                    indList.add(e);
                }
                //обнуляем счетчик слогов
                if (ch == '\n') {
                    e=0;
                }
                //смотрим первую строку
                    System.out.print((char) ch);
            }while (ch != '\n');

                System.out.println();

            ArrayList<Integer> AnswList = new ArrayList<>();//счетчик совпадений словоразделов

            //смотрим имеющиеся словоразделы и заполняем счетчик словоразделов
            for(int i=0;i<indList.size();i++) {
                System.out.print(indList.get(i)+"\t");
                AnswList.add(0);
            }

            System.out.println();

            //смотрим счетчик словоразделов
            for(int i=0;i<AnswList.size();i++) {
                System.out.print(AnswList.get(i)+"\t");
            }

            System.out.println();

                    do {
                        ch = sym.read();
                        //считаем слоги
                        if (ch == 'а' || ch == 'е' || ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'о' || ch == 'я' || ch == 'и' || ch == 'ю' ||
                                ch == 'А' || ch == 'Е' || ch == 'У' || ch == 'Ы' || ch == 'Э' || ch == 'О' || ch == 'Я' || ch == 'И' || ch == 'Ю') {
                            e++;
//                            System.out.print("["+e+"]"+"\t");
                        }
                        //считаем совпадения словоразделов
                        for(int i=0;i<indList.size();i++) {
                            if ((ch == ' ') & (indList.get(i) == e)) {
                                AnswList.set(i,(AnswList.get(i)+1));
                            System.out.print("|"+AnswList.get(i)+"|"+"\t");
                            }
                        }

                        //обнуляем счетчик слогов для новой строки
                        if ((ch == '\n')|(ch==-1)) {
                            e=0;
                            System.out.println();
                        }

                    } while (ch != -1);

                    //смотрим счетчик словоразделов после алгоритма
            for(int i=0;i<AnswList.size();i++) {
                System.out.print(AnswList.get(i)+"\t");
            }

            System.out.println();

            int ces=0;
            for(int i=0;i<AnswList.size();i++) {
               if (AnswList.get(i)>ces) ces = indList.get(i);
            }

            System.out.println("Цезура для данного стиха: " + ces);

        } catch (IOException exc) {
            System.out.println("Error");
        }
    }
}
