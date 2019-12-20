package ayman.problemsolving.com;

import java.util.Arrays;

public class SortArrayByParityII {

    public static void main(String... args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }

    public static int[] sortArrayByParityII(int[] A) {
        int evenIndex = 0;
        int oddIndex = 1;
        int[] nums = new int[A.length];

        for (int a : A) {
            if (a % 2 == 0) {
                nums[evenIndex] = a;
                evenIndex +=2;
            } else {
                nums[oddIndex] = a;
                oddIndex += 2;
            }
        }

        return nums;
    }

}
