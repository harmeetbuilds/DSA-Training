//finding the number greater than 50
package selfPractice;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = sc.nextLong();

        int count = 0;
        while(num>0){
            long last_digit = num%10;
            if(last_digit>5){
                count++;
            }
            num = num/10;
        }
        System.out.println("Number Greater than 5 is "+ count);
        sc.close();
        
    }
}
