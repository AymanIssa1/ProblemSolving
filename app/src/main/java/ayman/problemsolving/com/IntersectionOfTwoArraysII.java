package ayman.problemsolving.com;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        int[] shortArray = nums1.length < nums2.length ? nums1 : nums2;
        int[] longArray = nums1.length > nums2.length ? nums1 : nums2;

        int beginningIndex = 0, endingIndex = 0;
        boolean isBeginningIndexFound = false;

        for (int i = 0; i < longArray.length; i++) {
            if (longArray[i] == shortArray[0] && !isBeginningIndexFound){
                beginningIndex = i;
                endingIndex = i;
                isBeginningIndexFound = true;
            } else if (isBeginningIndexFound && longArray[i] == shortArray[endingIndex+1]) {
                endingIndex++;
            }
        }

        int[] result = new int[endingIndex+1];
        for (int i = beginningIndex; i <= endingIndex; i++) {
            result[i] = longArray[i];
        }
        return result;
    }

}
