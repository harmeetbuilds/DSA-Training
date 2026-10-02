package Array;
import java.util.Scanner;

public class spydetected {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];      

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int unique;

            // Find the different number
            if ((arr[0] ^ arr[1]) != 0) {

                if ((arr[0] ^ arr[2]) == 0) {
                    unique = arr[1];
                } else {
                    unique = arr[0];
                }

            } else {

                unique = arr[0];

                for (int i = 2; i < n; i++) {
                    if ((arr[i] ^ unique) != 0) {
                        unique = arr[i];
                        break;
                    }
                }
            }

            // Find the position
            for (int i = 0; i < n; i++) {

                if ((arr[i] ^ unique) == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}
