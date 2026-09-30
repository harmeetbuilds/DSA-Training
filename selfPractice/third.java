// Add only positive numbers
package selfPractice;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n = sc.nextInt();

        int sumOfPositive = 0;

        System.out.println("Enter the " + n + " number");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                sumOfPositive = sumOfPositive + num;
            }
        }
        System.out.println(sumOfPositive);
        sc.close();
    }
}
