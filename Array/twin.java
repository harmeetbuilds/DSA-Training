package Array;
import java.util.*;

public class twin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of coins
        int n = sc.nextInt();

        int[] coins = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            total = total + coins[i];
        }
        System.out.println(Arrays.toString(coins));
        System.out.println(total);
        Arrays.sort(coins);
        

        

        int mysum = 0;
        int count = 0;

        for(int i = n-1; i>=0; i--){
            mysum = mysum + coins[i];
            count++;

            if(mysum > total-mysum){
                break;
            }
        }
        System.out.println(count);
    }

}