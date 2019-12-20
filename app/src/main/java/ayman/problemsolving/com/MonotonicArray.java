package ayman.problemsolving.com;

public class MonotonicArray {

    // https://leetcode.com/problems/monotonic-array/

    public static void main(String... args){
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
        System.out.println(isMonotonic(new int[]{1,2,4,5}));
        System.out.println(isMonotonic(new int[]{1,1,1}));
    }


    public static boolean isMonotonic(int[] a) {
        Boolean isIncreasing = null;
        int i;

        for (i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                isIncreasing = false;
                break;
            } else if (a[i-1] < a[i]) {
                isIncreasing = true;
                break;
            }
        }

        // all elements are equal
        if (isIncreasing == null)
            return true;

        for (; i < a.length; i++) {
            if ((!isIncreasing && a[i-1] < a[i]) || (isIncreasing && a[i-1] > a[i]))
                return false;
        }

        return true;
    }

}
