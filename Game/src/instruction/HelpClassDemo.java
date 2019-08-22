package instruction;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choise, ignore;
        Help hlpjob = new Help();

        for(;;){
            do{
                hlpjob.showmenu();

                choise = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while (!hlpjob.isValid(choise));

            if(choise == 'q') break;

            System.out.println("\n");

            hlpjob.helpon(choise);
        }
    }
}
