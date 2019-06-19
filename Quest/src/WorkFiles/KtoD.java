package WorkFiles;

import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("If you want finish enter stop");

        try (FileWriter fw = new FileWriter("Test.txt"))
        {
            do{
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc){
            System.out.println("Error: " + exc);
        }
    }
}
