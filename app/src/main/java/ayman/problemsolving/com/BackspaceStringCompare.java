package ayman.problemsolving.com;

public class BackspaceStringCompare {

    // https://leetcode.com/problems/backspace-string-compare

    public static void main(String... args) {
        System.out.println(backspaceCompare("a##c","#a#c"));
    }

    // S = "ab#c", T = "ad#c"
    public static boolean backspaceCompare(String S, String T) {
        return clearText(S).equals(clearText(T));
    }

    public static String clearText(String text) {
        int backSpaceIndex = text.indexOf("#");
        if (backSpaceIndex == -1)
            return text;

        System.out.println(text);
        if (backSpaceIndex == 0)
            return clearText(text.substring(1));

        return clearText(text.substring(0, backSpaceIndex - 1) + text.substring(backSpaceIndex + 1));
    }

}
