/**
 * Программа из очередного дз должна открывать файл с русским текстом в кодировке UTF-8 и
 * распечатывать из него по одному разу все встретившиеся в нём:
 * 1. формы глагола "открыть"
 * 2. формы глагола "найти"
 * 3. формы глагола "программировать"
 * 4. формы глагола "выпить"
 * 5. формы глагола "съесть"
 * 6. формы глагола "загрузить"
 * 7. формы глагола "сидеть"
 *
 * В формы глагола включаются деепричастия, причастия и формы на -ся и не включаются видовые пары (
 * тем более что не у всех из перечисленных глаголов они имеются). И особое внимание стоит уделить тому,
 * чтобы программа ничего, кроме форм этих глаголов, не распознавала.
 *
 * Повторю ещё раз то, что я говорил про поиск внутри строки.
 * Функции re.search достаточно, чтобы слово совпадало с регулярным выражением не целиком,
 * а хотя бы каким-то фрагментом. Поэтому если, к примеру, написать выражение "дела[юе]т?",
 * слово "сделаю" тоже будет распознано этой функцией. Чтобы избежать такой проблемы,
 * можно предварительно разбивать строки на слова и использовать символы начала и конца строки, т. е. ^ и $ соответственно.
 */
package Regular;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExMain {
    public static void main(String[] args) {

        String str;
        Pattern pattern;
        Matcher matcher;
        try (BufferedReader text = new BufferedReader(new FileReader("49120352.txt"))){
                str = text.readLine();
                do {
                    pattern = Pattern.compile("\\bоткр[а-я]*(с[ья]|л([а-я]|)|в|ющ.*|ь|ем.*)\\b");
                    matcher = pattern.matcher(str);
                    while (matcher.find()) {
                        System.out.println(str.substring(matcher.start(),matcher.end()));
                    }
                    str = text.readLine();
                }while (str!=null);
        }
        catch (IOException e){
            System.out.print("error");
        }

    }
}
