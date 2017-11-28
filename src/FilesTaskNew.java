import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesTaskNew {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\text.txt");


        String text = "Ala ma kota!";

        try {
            Files.write(file.toPath(),
                    text.getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for (String s : Files.readAllLines(file.toPath())) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
