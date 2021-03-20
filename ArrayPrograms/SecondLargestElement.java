import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeOfArray;
        System.out.print("Enter Size of Array : ");
        sizeOfArray = input.nextInt();

        int A[] = new int[sizeOfArray];

        System.out.println("Enter Array elements : ");
        for (int i = 0; i < sizeOfArray; i++) {
            A[i] = input.nextInt();
        }

        System.out.print("\nArray is = ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(A[i] + "  ");
        }

        int max1;
        int max2;
        max1 = max2 = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];

            } else if (A[i] > max2) {
                max2 = A[i];
            }
        }

        System.out.println("\nSecond Largest is " + max2);

        input.close();
    }
}
