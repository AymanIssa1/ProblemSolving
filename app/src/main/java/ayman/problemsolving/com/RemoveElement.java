package ayman.problemsolving.com;

import java.util.Arrays;

public class RemoveElement {

    // https://leetcode.com/problems/remove-element/description/

    public static void main(String... args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {

        int valPos = -1;
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i])
                size++;

            if (val == nums[i] && valPos == -1) {
                valPos = i;
            } else if (val != nums[i] && valPos != -1) {
                nums[valPos] = nums[i];
                nums[i] = val;
                i = valPos;
                valPos = -1;
            }
        }
        return size;
    }

}
