package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String... args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disapperedNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }

            System.out.println("val: " + val + ", nums: " + Arrays.toString(nums));
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0)
                disapperedNums.add(i+1);
        }

        return disapperedNums;
    }

}
