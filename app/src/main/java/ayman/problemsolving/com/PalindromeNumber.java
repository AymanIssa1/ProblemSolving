package ayman.problemsolving.com;

public class PalindromeNumber {

    // https://leetcode.com/problems/palindrome-number/description/

    public static void main(String... args) {
        System.out.println(isPalindrome(-12321));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        String num = String.valueOf(x);
        int lastPointer = num.length() -1;
        for (int i = 0; i <= num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(lastPointer)) {
                return false;
            }
            lastPointer--;
        }
        return true;
    }

}
