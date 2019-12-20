package ayman.problemsolving.com;

public class MissingNumber {

    // How to Find Missing Number on Integer Array of 1 to 100

    public static void main(String... args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int numsTotal = 0;
        float intendedTotal = (nums.length) * ((nums.length + 1) / 2.0f);

        for (int num : nums)
            numsTotal += num;

        return (int) (intendedTotal - numsTotal);
    }

}
