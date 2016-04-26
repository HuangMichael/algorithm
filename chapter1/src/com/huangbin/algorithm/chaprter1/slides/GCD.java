package com.huangbin.algorithm.chaprter1.slides;

/**
 * Created by huangbin on 2016/4/26.
 * 使用辗转相除法求最大公约数
 */
public class GCD {

    public static void main(String args[]) {

        System.out.println(gcd(18, 72));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
