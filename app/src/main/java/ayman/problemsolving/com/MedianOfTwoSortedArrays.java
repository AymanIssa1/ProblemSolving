package ayman.problemsolving.com;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;

        for(int num: nums1){
            nums[index++] = num;
        }

        for(int num: nums2){
            nums[index++] = num;
        }

        Arrays.sort(nums);

        if (nums.length % 2 == 1)
            return nums[(nums.length / 2)];


        return (nums[nums.length / 2 - 1] + nums[(nums.length / 2)]) / 2.0;
    }

}
