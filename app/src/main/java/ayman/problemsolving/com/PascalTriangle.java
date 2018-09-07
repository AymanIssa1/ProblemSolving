package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // https://leetcode.com/problems/pascals-triangle/description/

    public static void main(String... args){
        List<List<Integer>> triangle =  generate(5);
        for (List<Integer> list : triangle) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int currentRow = 0;
        while(currentRow <= numRows) {
            if (currentRow == 0){
                List<Integer> list = new ArrayList<>();
                list.add(1);
                triangle.add(list);
                currentRow++;
            } else if (currentRow == 1){
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(1);
                triangle.add(list);
                currentRow++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(1);

                List<Integer> previousList = triangle.get(triangle.size()-1);

                for (int i = 1; i < previousList.size(); i++) {
                    int val = previousList.get(i-1) + previousList.get(i);
                    list.add(val);
                }
                list.add(1);
                triangle.add(list);
                currentRow++;
            }
        }
        return triangle;
    }

}
