class Solution {
    public int countOperations(int num1, int num2) {
        int steps = 0;
        while(num1!=0 && num2!=0){
            if (num1>num2){
                num1 = num1-num2;
            }
            else{
                num2 = num2-num1;
            }
            steps++;
        }
        return steps;
        
    }
}
public class one {
    public static void main(String[] args) {
        Solution Hi = new Solution();
        int result = Hi.countOperations(45,50);
        System.out.println(result);
    }
}
