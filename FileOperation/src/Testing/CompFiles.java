package Testing;
import java.io.*;

public class CompFiles {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0, k = 0;

//        if(args.length!=2) {
//            System.out.println("Использование: CompFiles");
//            return;
//        }
//
//        try (FileInputStream f1 = new FileInputStream("Abc.txt");
//             FileInputStream f2 = new FileInputStream("Dcd.txt"))
//        {
//            do {
//                i = f1.read();
//                j = f2.read();
//                if(i != j) break;
//            } while(i !=-1 && j!=-1);
//
//            if (i!=j)
//                System.out.println("Файлы разные");
//            else
//                System.out.println("Файлы одинаковые");
//        } catch (IOException exc){
//            System.out.println("Ошибка" + exc);
//        }

//        try (FileInputStream F1 = new FileInputStream("Abc.txt");
//             FileOutputStream F2 = new FileOutputStream("TEST.txt")) {
//            k = F1.read();
//            while (k!=-1) {
//                if (k==' ') k = '_';
//                F2.write(k);
//                k = F1.read();
//            }
//        } catch (IOException exc) {
//            System.out.println("Ошибка" + exc);
//        }

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("Abc.txt");
            outputStream = new FileWriter("TEST.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                if (c==' ') c = '_';
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

