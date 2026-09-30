//Take N numbers and count how many are even and how many are odd.
package selfPractice;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n = sc.nextInt();

        int even_count = 0;
        int odd_count = 0;

        System.out.println("Enter the "+n+" number");
        for(int i = 1;i<=n;i++){
            int num = sc.nextInt();
            if(num%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Total even Numbers = "+ even_count);
        System.out.println("Total Odd Numbers = " +odd_count);
        sc.close();
    }
}
