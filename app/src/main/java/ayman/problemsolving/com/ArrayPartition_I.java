package ayman.problemsolving.com;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPartition_I {

    // https://leetcode.com/problems/sort-array-by-parity/

    public static void main(String... args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i] < nums[i+1])
                sum += nums[i];
            else
                sum += nums[i+1];
        }
        return sum;
    }

}
