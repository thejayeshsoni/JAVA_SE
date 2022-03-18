import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(10);
        linkedHashSet.add("J");
        linkedHashSet.add("A");
        linkedHashSet.add("Y");
        linkedHashSet.add("E");
        linkedHashSet.add("S");
        linkedHashSet.add("H");

        linkedHashSet.add("S"); // as we are using set so we can't add duplicate elements

        linkedHashSet.forEach(System.out::println);
    }
}
