package Array;

import java.util.Scanner;

class ArraySearch {

    int[] arr = {1, 2, 3, 4, 5};

    public void search(int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Element found at index " + i);
                return; 
            }
        }

        System.out.println("Element not found");
    }
}

public class search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArraySearch obj = new ArraySearch();

        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        obj.search(num);
    }
}