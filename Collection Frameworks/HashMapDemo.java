
/** 
 * HashMap takes O(1) time for basic operations.
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        hashMap.put(4, "E");
        // hashMap.put(5, "F");
        hashMap.put(6, "G");

        // System.out.println(hashMap);
        hashMap.forEach((x, y) -> System.out.println(x + " " + y));
    }
}
