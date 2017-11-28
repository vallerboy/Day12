import java.io.*;

public class FileTasks {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\text.txt");

        // ODCZYT
        try {
            FileInputStream fileInputStream =
                    new FileInputStream(file);

            int someByte;
            while ((someByte = fileInputStream.read()) != -1){
                System.out.print((char)someByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ZAPIS
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(file,true);

            fileOutputStream.write("Oskar\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
