package ayman.problemsolving.com;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    public static void main(String... args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }

    static class MyQueue {

        Stack<Integer> stackOldest;
        Stack<Integer> stackNewest;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stackOldest = new Stack<>();
            stackNewest = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            stackNewest.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (stackOldest.isEmpty())
                while (!stackNewest.isEmpty()) {
                    stackOldest.push(stackNewest.pop());
                }
            return stackOldest.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (stackOldest.isEmpty())
                while (!stackNewest.isEmpty()) {
                    stackOldest.push(stackNewest.pop());
                }
            return stackOldest.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stackOldest.isEmpty() && stackNewest.isEmpty();
        }
    }

}
