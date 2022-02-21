import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Author: Bryan Burns
Date: 2/20/2022
Purpose: To sort an ArrayList of Numbers.
*/

public class Sorting {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            Number num = keyboard.nextInt();
            list.add(num);
        }

        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Number num = list.get(i);
            nums[i] = num.intValue();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            list.set(i, nums[i]);
        }
    }
}
