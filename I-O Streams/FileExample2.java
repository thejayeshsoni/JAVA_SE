import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/JAVA.txt");

            byte b[] = new byte[fis.available()];

            fis.read(b);

            String str = new String(b);

            System.out.println(str);

            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
