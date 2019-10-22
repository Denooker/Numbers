import java.io.IOException;
import java.nio.file.*;

public class CopyFiles {
    public static void main(String[] args) {
        String instruction = "off";
        Path pathSourceOn = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\On.txt");
        Path pathSourceOff = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\Off.txt");
        Path pathDestination = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\RequiredFolder\\Status.txt");
        switch (instruction) {
            case "on":
                try {
                    Files.copy(pathSourceOn, pathDestination, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            case "off":
                try {
                    Files.copy(pathSourceOff, pathDestination, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e){
                    e.printStackTrace();
                }
    }
    }
}
