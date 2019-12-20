package ayman.problemsolving.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {

    public static void main(String... args){

        System.out.println(thirdMax(new int[]{1,1,2}));

    }

    public static int thirdMax(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        Integer[] sortedNums = numsSet.toArray(new Integer[numsSet.size()]);
        Arrays.sort(sortedNums);

        if (sortedNums.length < 3)
            return sortedNums[sortedNums.length - 1];

        return sortedNums[sortedNums.length - 3];
    }

}
