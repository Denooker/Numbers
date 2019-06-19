import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Uni {

     String str;
     ArrayList<String> UniList = new ArrayList<>();
    public void fname() {
        try (BufferedReader sym = new BufferedReader(new FileReader("List.txt"))) {
            str = sym.readLine();
            str = str.substring(1);
            UniList.add(str);
            do {
                str = sym.readLine();
                UniList.add(str);
            }while (str!=null);
        } catch (IOException exc) {
            System.out.println("Error");
        }
    }
}
