import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyingOfFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/Source1.txt");
            FileOutputStream fos = new FileOutputStream(
                    "C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/Source2.txt");

            int b;
            while ((b = fis.read()) != -1) {
                if (b >= 65 && b <= 120) {
                    fos.write(b + 32);
                } else {
                    fos.write(b);
                }
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
