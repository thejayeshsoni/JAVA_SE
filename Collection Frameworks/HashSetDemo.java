import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);
        System.out.print(hashSet);
        System.out.println();
        hashSet.forEach(x -> System.out.print(x + " "));
        /*
         * Iterator<Integer> it;
         * it = hashSet.iterator();
         * while (it.hasNext()) {
         * System.out.print(it.next() + " ");
         * }
         */

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("J");
        hashSet2.add("A");
        hashSet2.add("Y");
        hashSet2.add("E");
        hashSet2.add("S");
        hashSet2.add("H");
        hashSet2.forEach(x -> System.out.println(x));
    }
}
