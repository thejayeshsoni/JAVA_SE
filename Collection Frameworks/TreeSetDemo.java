import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(10, 20, 10, 5, 35));
        treeSet.add(15);
        System.out.println(treeSet.ceiling(6)); // ceiling function will give either the number itself (only if it is
                                                // present in treeSet) or the nearest value (if the parameter is not
                                                // present in TreeSet)
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
    }
}
