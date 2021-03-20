import java.lang.*;
import java.util.*;

public class ArrayTraversing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sizeOfArray;
        System.out.print("Enter Size of Array : ");
        sizeOfArray = input.nextInt();

        // Array
        int A[] = new int[sizeOfArray];

        System.out.println("Enter Array elements : ");
        for (int i = 0; i < sizeOfArray; i++) {
            A[i] = input.nextInt();
        }

        // Printing an Array
        System.out.print("\nArray is = ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(A[i] + "  ");
        }

        input.close();
    }
}