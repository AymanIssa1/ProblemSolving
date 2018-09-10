package ayman.problemsolving.com;

public class JewelsAndStones {

    // https://leetcode.com/problems/jewels-and-stones/description/

    public static int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (char j : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (j == s)
                    counter++;
            }
        }
        return counter;
    }

}
