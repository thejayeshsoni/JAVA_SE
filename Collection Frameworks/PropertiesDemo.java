import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Each key and value is typeof "String" only...
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // properties.setProperty("Brand", "DELL");
        // properties.setProperty("Processor", "i9");
        // properties.setProperty("OS", "Windows 11");
        // properties.setProperty("Price", "80,000");

        try {
            // properties.store(
            // new FileOutputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/Collection
            // Frameworks/MyData.txt"),
            // "Laptop");
            // properties.storeToXML(
            // new FileOutputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/Collection
            // Frameworks/MyData.xml"),
            // "Laptop");
            properties.loadFromXML(
                    new FileInputStream("C:/Users/Jayesh/Documents/JAVA PROGRAMS/Collection Frameworks/User.xml"));
            System.out.println(properties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
