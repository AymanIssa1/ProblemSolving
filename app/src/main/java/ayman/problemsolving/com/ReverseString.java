package ayman.problemsolving.com;

public class ReverseString {

    //https://leetcode.com/problems/reverse-string/description/

    public static void main(String... args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        int endCursor = s.length()-1;
        char[] sChars = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++){
            char temp = sChars[i];
            sChars[i] = sChars[endCursor];
            sChars[endCursor] = temp;
            endCursor--;
        }
        return String.valueOf(sChars);
    }


}
