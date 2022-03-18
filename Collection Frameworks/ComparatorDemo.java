import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2) {
            return 1;
        }
        if (i1 > i2) {
            return -1;
        }
        return 0;
    }

}

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        int b[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

        System.out.println(Arrays.compare(a, b)); // If 'a' and 'b' are same then it will return 0;

        System.out.println("\n\nCopying the values of array 'a' into 'c'");
        int c[] = Arrays.copyOf(a, a.length);
        for (int i : c) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nARRAY 'c' after filling it with 10");
        Arrays.fill(c, 10);
        for (int i : c) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nSORTING the array 'a' ");
        Arrays.parallelSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nIndex of 2 is : " + Arrays.binarySearch(a, 2));

        System.out.println("\n\nSorting the Array of Integer objects using our own implementation of Comparator...");
        Integer z[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        Arrays.sort(z, new My()); // we can sort the Integer objects by defining our own comparator...
        for (Integer integer : z) {
            System.out.print(integer + " ");
        }
    }
}
