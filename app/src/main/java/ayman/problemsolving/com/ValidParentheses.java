package ayman.problemsolving.com;

import java.util.Stack;

public class ValidParentheses {

    // https://leetcode.com/problems/valid-parentheses/description/

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                characterStack.push(c);
            } else {
                if (characterStack.size() == 0)
                    return false;

                char lastChar = characterStack.peek();

                if ((lastChar == '(' && c == ')') ||
                        (lastChar == '[' && c == ']') ||
                        (lastChar == '{' && c == '}')) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }

        return (characterStack.size() == 0);
    }

}
