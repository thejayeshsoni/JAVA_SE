import java.util.*;

public class ArrayListAndIterator {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(20); // The size of this Array list will vary when we add or delete
        // elements in or from this ArrayList.

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90, 100));

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);

        /*
         * contains methods is used for finding elements in ArrayList. It is a boolean
         * method.
         */
        System.out.println("30 is present in ArrayList : " + al1.contains(30));
        System.out.println("50 is present in ArrayList : " + al1.contains(50));

        System.out.println(al1);

        al1.addAll(4, al2); // addAll method is used for adding second ArrayList in first ArrayList.

        System.out.println(al1);

        al1.set(7, 200); // set method is used for replace any element, at perticular index
        System.out.println("Array List after changing value at index 7 : " + al1);

        /*
         * printing elements of this ArrayList using for loop
         */
        System.out.println("\n\nPrinting ArrayList using for Loop : ");
        for (int i = 0; i < al1.size(); i++) {
            /*
             * System.out.print(al1[i]); this line can't be used for printing elements of
             * ArrayList because it is an Object of generic class
             */
            System.out.print(al1.get(i) + ", ");
        }

        System.out.println("\n\nPrinting ArrayList using for-each Loop : ");
        for (var integer : al1) { // <<<<---- we can use "Integer" class name instead of var
            System.out.print(integer + ", ");
        }

        System.out.println("\n\nPrinting ArrayList using for iterator Loop : ");
        for (Iterator<Integer> iterator = al1.iterator(); iterator.hasNext();) { // Here, we can use listIterator
                                                                                 // instead of only Iterator. Because
            java.lang.Integer x = iterator.next();
            System.out.print(x + ", ");
        }

        System.out.println("\n\nPrinting ArrayList using lambda expression : ");
        al1.forEach((x) -> {
            System.out.print(x + ", ");
        });

    }
}
