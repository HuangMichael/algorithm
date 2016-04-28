package com.huangbin.algorithm.chapter2.slides;

/**
 * Created by huangbin on 2016/4/28.
 * <p/>
 * 斐波那契数列
 * <p/>
 * <p/>
 * Algorithm Fib(n)
 * 1 if n < 2 then f ← n;
 * 2 else
 * 3 f1 ← Fib(n − 1);
 * 4 f2 ← Fib(n − 2);
 * 5 f ← f1 + f2;
 * 6 end
 * 7 return f;
 */
public class FibonacciSequence {


    public static void main(String args[]) {
        long n = 12;
        System.out.println("斐波那契数列第" + n + "项为" + fib1(12));
    }

    public static long fib(long n) {
        long f;
        if (n < 2) {
            f = n;
        } else {
            f = fib(n - 1) + fib(n - 2);
        }
        return f;
    }

    public static long fib1(long n) {
        return (n < 2) ? n : fib(n - 1) + fib(n - 2);
    }
}
