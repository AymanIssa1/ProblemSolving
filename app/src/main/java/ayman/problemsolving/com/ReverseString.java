package ayman.problemsolving.com;

public class ReverseString {

    //https://leetcode.com/problems/reverse-string/description/

    public static void main(String... args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        int endCursor = s.length()-1;
        for (int i = 0; i < s.length()/2; i++){
            char temp = s.charAt(i);
            s = replaceCharAt(s,i,s.charAt(endCursor));
            s = replaceCharAt(s,endCursor,temp);
            endCursor--;
        }
        return s;
    }

    public static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }

}
