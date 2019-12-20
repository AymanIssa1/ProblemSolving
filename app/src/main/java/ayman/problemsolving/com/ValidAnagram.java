package ayman.problemsolving.com;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (char c : sChars){
            for (int i = 0; i < tChars.length; i++) {
                if (c == tChars[i]) {
                    tChars[i] = '#';
                    break;
                }
            }
        }

        for (char c : tChars){
            if (c != '#')
                return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

}
