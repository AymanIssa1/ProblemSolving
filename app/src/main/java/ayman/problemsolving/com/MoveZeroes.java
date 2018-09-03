package ayman.problemsolving.com;

import java.util.Arrays;

public class MoveZeroes {

    // https://leetcode.com/problems/move-zeroes/description/

    public static void main(String... args) {
        int[] x = new int[]{0,1,0,3,12};
        moveZeroes(x);
        System.out.println(Arrays.toString(x));

    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length - 1;
        while (length != 0) {
            for (int i = 0; i < length; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
            length--;
        }
    }

}
