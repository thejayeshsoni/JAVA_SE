import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap takes O(1) time for basic operations.
 * LinkedHashMap preserves the order in which the elements have been inserted...
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5, .75f, true) {
            protected boolean removeEldestEntry(Map.Entry entry) { // this function is used to make LinkedHashMap's size
                                                                   // Limited to 5. So that is you add more than 5
                                                                   // elements into it, it'll delete elements first then
                                                                   // only insert new one.
                return size() > 5;
            }
        }; // the 'true' parameter is
           // used here for accessing
           // the element in their
           // accessed order... -->means
           // least recently used key
           // will be shown first
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3, "C");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(5, "E");

        String s = linkedHashMap.get(2);
        s = linkedHashMap.get(5);
        s = linkedHashMap.get(1);

        linkedHashMap.put(6, "F");

        // System.out.println(linkedHashMap);
        linkedHashMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
