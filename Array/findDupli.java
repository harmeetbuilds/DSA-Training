package Array;

public class findDupli {
    public static void main(String[] args) {

        int nums [] = {2,2,1};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        System.out.println(result);
    }
}