package ayman.problemsolving.com;

import java.util.Arrays;

public class RotateArray {
//[5,6,7,1,2,3,4]
    public static void main(String... args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int lastIndex = nums.length - 1;
        int counter = 0;
        int startIndex = 0;

        while (counter != k) {
            for (int i = lastIndex; i > startIndex; i--) {
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }

            System.out.println("Round 1: " + Arrays.toString(nums));
            counter++;
        }

    }

}
