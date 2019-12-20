package ayman.problemsolving.com;

public class MaxConsecutiveOnes {

    // https://leetcode.com/problems/max-consecutive-ones/

    public static void main(String... args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{
                1,1,0,1,1,1,0,1,1
        }));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                counter++;
            } else {
                if (max < counter)
                    max = counter;

                counter = 0;
            }
        }

        if (max < counter)
            max = counter;

        return max;
    }

}

