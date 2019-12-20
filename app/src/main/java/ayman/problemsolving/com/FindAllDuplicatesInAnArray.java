package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    // https://leetcode.com/problems/reshape-the-matrix

    public static void main(String... args) {

        for (int i : findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1})) {
            System.out.print(i + ", ");
        }

    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > 1)
                duplicates.add(key);
        }
        map.clear();

        return duplicates;
    }


}
