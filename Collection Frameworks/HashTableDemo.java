import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // Hashtable<Integer, String> hashtable = new Hashtable<>();
        Hashtable hashtable = new Hashtable();/*
                                               * This class is not a generic class so we don't need
                                               * to explicitly say
                                               * what to store. It takes keys and values both of
                                               * them as objects...
                                               */
        hashtable.put(1, "Jayesh");
        hashtable.put(2, "Sam");
        hashtable.put(3, "Tom");
        hashtable.put(4, "Jerry");
        hashtable.put(5, "Ban");

        String s = (String) hashtable.get(1);
        System.out.println(s);

        hashtable.compute(1, (k, v) -> v + " Soni"); // For computing a new value to the previous one...
        hashtable.computeIfAbsent(7, (k) -> "Z" + k);

        /*
         * As this class is not a generic class so there is no iterator is available for
         * this class...
         * So we have to use Enumeration class for iterating through Hashtable
         */
        Enumeration enumerationForValues = hashtable.elements();
        Enumeration enumerationForKeys = hashtable.keys();
        while (enumerationForValues.hasMoreElements() || enumerationForKeys.hasMoreElements()) {
            System.out.println(enumerationForKeys.nextElement() + " " + enumerationForValues.nextElement());
        }

        // System.out.println(hashtable);
    }
}
