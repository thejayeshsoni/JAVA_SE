
/** 
 * TreeMap takes O(log n) time for basic operations. And It stores elements in Sorted order...
*/

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        treeMap.put(4, "E");
        // treeMap.put(5, "F");
        treeMap.put(6, "G");

        System.out.println(treeMap.ceilingEntry(5).getValue());

        Entry<Integer, String> entry = treeMap.firstEntry();
        System.out.println(entry.getKey() + " " + entry.getValue());

        // System.out.println(treeMap);
        treeMap.forEach((x, y) -> System.out.println(x + " " + y));
    }
}
