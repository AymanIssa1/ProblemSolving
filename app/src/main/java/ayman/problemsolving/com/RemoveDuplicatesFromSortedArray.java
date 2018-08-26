package ayman.problemsolving.com;

public class RemoveDuplicatesFromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

    public static void main(String... args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i])
                nums[++index] = nums[i];
        }
        return index + 1;
    }

}
