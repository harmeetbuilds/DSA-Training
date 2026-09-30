import java.util.Scanner;

public class LuckyDigitCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;

        do{
            int digit = n%10;
            if(digit == 7){
                count ++;
            }
            n= n/10;
        }while(n!=0);

        System.out.println(count);
        sc.close();

    }
}