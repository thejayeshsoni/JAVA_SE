import java.util.*;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeOfArray;
        System.out.print("Enter Size of Array : ");
        sizeOfArray = input.nextInt();

        int A[] = new int[sizeOfArray];

        System.out.println("Enter Elements of Array : ");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        System.out.print("\n\nArray is = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
        }

        // MAXIMUM of Array
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.print("\n\nMAX is = " + max);
        input.close();
    }
}
