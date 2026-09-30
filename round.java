import java.util.Scanner;

public class round {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int num = sc.nextInt();

            int place = 1;
            int count = 0;

            
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit != 0) {
                    count++;
                }

                temp = temp / 10;
                place = place * 10;
            }

            System.out.println(count);

            place = 1;

            while (num > 0) {

                int digit = num % 10;

                if (digit != 0) {
                    System.out.print(digit * place + " ");
                }

                num = num / 10;
                place = place * 10;
            }

            System.out.println();

            t--;
        }

        sc.close();
    }
}