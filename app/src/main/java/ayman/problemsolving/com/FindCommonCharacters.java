package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {
        List<String> commonCharsList = new ArrayList<>();
        for (char a : A[0].toCharArray()) {
            for (int i = 1; i < A.length; i++) {
                if (A[i].contains(String.valueOf(a))) {
                    if (i == A.length -1) {
                        commonCharsList.add(String.valueOf(a));

                        for (int j = 1; j < A.length; j++)
                            A[j] = A[j].substring(0, A[j].indexOf(a)) + A[j].substring(A[j].indexOf(a) + 1);
                    }
                } else {
                    break;
                }
            }
        }
        return commonCharsList;
    }

}