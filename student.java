import java.util.Scanner;

class student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int productive_days = 0;

        for (int i = 0; i < n; i++) {
            int nq = sc.nextInt();

            if (nq >= 10 && nq % 2 == 0) {
                productive_days++;
            }
        }

        System.out.println(productive_days);
        sc.close();
    }
}