class Solution {
    public int numberOfSteps(int num) {

        int steps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }
}
    public class zero{
        public static void main(String []args){
            Solution hello = new Solution();
            int result  = hello.numberOfSteps(52);
            System.out.println(result);
        }
    }
