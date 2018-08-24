package ayman.problemsolving.com;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null)
            return "";

        if(strs.length == 0)
            return "";

        String prefix = "";
        int length = strs[0].length();

        A:
        for (int i = 0; i < length; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                int currentStrLength = strs[j].length();
                if (i > currentStrLength -1)
                    break A;

                if (currentChar != strs[j].charAt(i))
                    break A;

            }
            prefix += currentChar;
        }

        return prefix;
    }

}
