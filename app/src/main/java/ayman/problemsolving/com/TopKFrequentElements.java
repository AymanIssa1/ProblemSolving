package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();
        List<Integer> topFrequent = new ArrayList<>();

        for (int num : nums) {
            if (numsHashMap.containsKey(num)) {
                numsHashMap.put(num, numsHashMap.get(num) + 1);
            } else {
                numsHashMap.put(num, 1);
            }
        }

        int counter = 0;
        int topKey = 0;
        while (k != 0) {
            for (int key : numsHashMap.keySet()) {
                if (numsHashMap.get(key) > counter) {
                    topKey = key;
                    counter = numsHashMap.get(key);
                }
            }
            topFrequent.add(topKey);
            numsHashMap.remove(topKey);
            counter = 0;
        }
        return topFrequent;
    }

}
