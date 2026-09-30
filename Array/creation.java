package Array;

import java.util.*;

public class creation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Inserting elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        // Printing array
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}