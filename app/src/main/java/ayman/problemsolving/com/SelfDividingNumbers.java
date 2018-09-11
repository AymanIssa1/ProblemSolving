package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    // https://leetcode.com/problems/self-dividing-numbers/description/

    public static void main(String... args) {
        System.out.println(Arrays.toString(selfDividingNumbers(1, 22).toArray()));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();

        for (int i = left; i <= right;i++) {
            int remainVal = i;
            while (remainVal > 0){
                int divider = remainVal % 10;
                remainVal = remainVal / 10;

                if (divider == 0 || i % divider > 0)
                    break;

                if (remainVal == 0)
                    nums.add(i);
            }

        }
        return nums;
    }

}
// [1,2,3,4,5,6,7,8,9,11,12,15,22]
