package ayman.problemsolving.com;

import android.util.SparseIntArray;

import java.util.HashMap;

public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int repeatedNum = 0;
        int counter = 0;

        for (int num : A) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        for (int key : map.keySet()){
            if (map.get(key) > counter) {
                repeatedNum = key;
                counter = map.get(key);
            }
        }
        return repeatedNum;
    }

}
