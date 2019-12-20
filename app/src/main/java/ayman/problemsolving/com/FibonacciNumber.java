package ayman.problemsolving.com;

public class FibonacciNumber {

    // 509. Fibonacci Number
    // https://leetcode.com/problems/fibonacci-number/

    public static void main(String... args){
        System.out.print(fib(10));
    }

    public static int fib(int N) {
        if(N == 0)
            return 0;
        if (N == 1 || N == 2)
            return 1;
        return fib(N-2) + fib(N-1);
    }

}
