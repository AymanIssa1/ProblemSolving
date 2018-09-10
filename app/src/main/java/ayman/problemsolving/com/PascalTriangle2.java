package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    // https://leetcode.com/problems/pascals-triangle-ii/description/

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        int currentRow = 0;
        while(currentRow <= rowIndex) {
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
        return triangle.get(triangle.size()-1);
    }

}
