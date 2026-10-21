//2195A
package codeforces;


import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] * arr[j] == 67) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}