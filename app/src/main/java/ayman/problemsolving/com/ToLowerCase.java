package ayman.problemsolving.com;

public class ToLowerCase {

    // https://leetcode.com/problems/to-lower-case/description/

    public static void main(String... args){
        System.out.println(toLowerCase("AYMAN"));
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90)
                chars[i] = (char) (chars[i]+32);
        }
        return String.valueOf(chars);
    }
}
