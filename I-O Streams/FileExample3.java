import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileExample3 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/Source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/Source1.txt");

        FileOutputStream fos = new FileOutputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/Source3.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
        sis.close();
        fis1.close();
        fis2.close();
    }
}
