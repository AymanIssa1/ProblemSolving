package ayman.problemsolving.com;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        boolean isAllCharCapital = true;
        boolean isFirstCharCapital = true;
        boolean isAllCharSmall = true;

        // Checking all chars are Capital
        for (int i = 0; i < word.length(); i++) {
            if (!isCapitalChar(word.charAt(i)))
                isAllCharCapital = false;
        }

        // Checking all char are small
        for (int i = 0; i < word.length(); i++) {
            if (isCapitalChar(word.charAt(i)))
                isAllCharSmall = false;
        }

        // Checking is first char is Capital
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && !isCapitalChar(word.charAt(i)))
                isFirstCharCapital = false;
            else if (i > 0 && isCapitalChar(word.charAt(i)))
                isFirstCharCapital = false;
        }
        return isAllCharCapital || isFirstCharCapital || isAllCharSmall;
    }

    public static boolean isCapitalChar(char c) {
        if (c >= 65 && c <= 90)
            return true;
        return false;
    }

}
