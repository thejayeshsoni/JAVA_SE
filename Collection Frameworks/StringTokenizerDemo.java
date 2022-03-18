import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(
                "C:/Users/Jayesh/Documents/JAVA PROGRAMS/Collection Frameworks/NumbersData.txt");
        byte b[] = new byte[fileInputStream.available()];
        fileInputStream.read(b);

        String data = new String(b);

        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");

        String s;

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()) {
            s = stringTokenizer.nextToken();
            arrayList.add(Integer.valueOf(s));
        }

        System.out.println(arrayList);
    }
}