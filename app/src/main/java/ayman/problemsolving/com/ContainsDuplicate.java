package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // https://leetcode.com/problems/contains-duplicate/

    public static void main(String... args){
        int[] num1 = new int[]{1,2,3,1};
        int[] num2 = new int[]{1,2,3,4};

        System.out.println(containsDuplicate(num1));
        System.out.println(containsDuplicate(num2));

        System.out.println(containsDuplicate2(num1));
        System.out.println(containsDuplicate2(num2));

        System.out.println(containsDuplicate3(num1));
        System.out.println(containsDuplicate3(num2));
    }

    // Limit Exceed
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // Limit Exceed
    public static boolean containsDuplicate2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num))
                return true;

            list.add(num);
        }
        return false;
    }


    public static boolean containsDuplicate3(int[] nums) {
        Set<Integer> integers = new HashSet<>(nums.length);
        for (int num : nums){
            if (integers.contains(num))
                return true;
            integers.add(num);
        }
        return false;
    }

}
