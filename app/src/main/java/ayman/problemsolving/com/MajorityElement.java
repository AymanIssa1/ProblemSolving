package ayman.problemsolving.com;

import java.util.HashMap;

public class MajorityElement {

    // 169. Majority Element
    // https://leetcode.com/problems/majority-element/

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxValueKey = 0;
        int maxValue = 0;

        for (int num : nums){
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxValueKey = key;
            }
        }
        return maxValueKey;
    }

}
