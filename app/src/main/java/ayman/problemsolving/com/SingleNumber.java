package ayman.problemsolving.com;

import java.util.HashMap;

public class SingleNumber {

    // https://leetcode.com/problems/single-number/description/

    public static void main(String... args) {
        int[] nums = new int[]{2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                Integer val = hashMap.get(num);
                hashMap.put(num, ++val);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 1)
                return key;
        }
        return 0;
    }

}
