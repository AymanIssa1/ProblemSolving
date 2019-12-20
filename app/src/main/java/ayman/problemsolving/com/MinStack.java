package ayman.problemsolving.com;


import java.util.Stack;

// 155. Min Stack
// https://leetcode.com/problems/min-stack/
public class MinStack {

    private Stack<Integer> valuesStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        valuesStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (x <= getMin())
            minStack.push(x);
        valuesStack.push(x);
    }

    public void pop() {
        if (valuesStack.pop() == getMin())
            minStack.pop();
    }

    public int top() {
        return valuesStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty())
            return Integer.MAX_VALUE;
        else
            return minStack.peek();
    }

}
