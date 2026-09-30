import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num = sc.nextInt();
        while(num!=0){
            int reverse = num%10;
            int num2 =+ reverse;
            System.out.print(num2);
            num = num/10;
            sc.close();
        }  
    }
}
