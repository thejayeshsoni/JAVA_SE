import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/I-O Streams/JAVA.txt");

            String str = "#Learning_JAVA_by_doing";
            byte b[] = str.getBytes();

            for (byte x : b) {
                fos.write(x);
            }
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}