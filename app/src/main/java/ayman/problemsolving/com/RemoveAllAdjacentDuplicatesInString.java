package ayman.problemsolving.com;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static void main(String... args) {

        System.out.println(removeDuplicates("abbaca"));

    }

    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char s : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == s){
                stack.pop();
            } else {
                stack.push(s);
            }
        }

        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

}
