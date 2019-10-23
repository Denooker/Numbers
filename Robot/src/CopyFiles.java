import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class CopyFiles {
    public static void main(String[] args) {
        String instruction = "";
        String status = "";
        Path pathSourceOn = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\On.txt");
        Path pathSourceOff = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\Off.txt");
        Path pathDestination = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\RequiredFolder\\Status.txt");

        System.out.println("Set instruction");

        for(;;){
        Scanner vvod = new Scanner(System.in);
        instruction = vvod.nextLine();

        switch (instruction) {
            case "on":
                if (status.equals("on")) {
                    System.out.println("Rec is on already");
                    break;
                }
                try {
                    Files.copy(pathSourceOn, pathDestination, StandardCopyOption.REPLACE_EXISTING);
                    status = instruction;
                    System.out.println("Rec is on");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case "off":
                if (status.equals("off")) {
                    System.out.println("Rec is off already");
                    break;
                }
                try {
                    Files.copy(pathSourceOff, pathDestination, StandardCopyOption.REPLACE_EXISTING);
                    status = instruction;
                    System.out.println("Rec is off");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Set instruction");
        }

    }
    }
}
