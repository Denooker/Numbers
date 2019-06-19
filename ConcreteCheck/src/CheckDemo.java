import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckDemo {
    public static void main(String[] args) {
        Uni name = new Uni();
        name.fname();
        for (int j = 0; j < name.UniList.size()-1; j++) {
            String headfile = name.UniList.get(j);
            char Pik3 = headfile.charAt(3);
            char Pik2 = headfile.charAt(0);
            System.out.println(headfile);

            try (BufferedReader f = new BufferedReader(new FileReader(headfile))) {
                int i = 0;
                do {
                    String str = f.readLine();
                    i++;
                    if (headfile.charAt(0) == 'В') {
                        switch (Pik3) {
                            case '3':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;

                            case '2':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;

                            case '1':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;
                        }
                    } else {
                        switch (Pik2) {
                            case '3':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;

                            case '2':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;

                            case '1':

                                if (str.length() > 13 && (str.charAt(12) == '2' & str.charAt(13) == '5')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '3' & str.charAt(13) == '0')) {
                                    System.out.println("........Файл не в порядке " + "класс бетона " + str.substring(12, 14));
                                } else if (str.length() > 13 && (str.charAt(12) == '4' & str.charAt(13) == '0')) {
                                    System.out.println("Файл в порядке " + "класс бетона " + str.substring(12, 14));
                                }
                                break;
                        }
                    }

                } while (i < 26);
            } catch (IOException exc) {
                System.out.println("Error");
            } catch (NullPointerException e) {
            }
        }
    }
}
