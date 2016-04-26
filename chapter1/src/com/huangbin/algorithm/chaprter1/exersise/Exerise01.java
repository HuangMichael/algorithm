package com.huangbin.algorithm.chaprter1.exersise;

/**
 * Created by huangbin on 2016/4/26.
 * 已知一个长度为n 的数组和一个正整数k，并且最多只能使用一个用于
 * 交换数组元素的附加空间单元，试设计算法得到原数组循环右移k 次的
 * 结果并分析算法的时间复杂度。
 */
public class Exerise01 {

    private static int array[] = {12, 33, 23, 56, 45, 67, 99, 20};

    public static void main(String args[]) {

        shiftArray(array, 9);
    }

    /**
     * @param array 数组
     * @param k     移动次数
     */
    public static void shiftArray(int array[], int k) {

// 临时变量
        int temp;

        //将第length-1个元素赋值给temp

        for (int j = k ; j > 0; j--) {
            for (int i = array.length - 1; i > 0; i--) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            String str = "[";
            for (int x : array) {
                str += x + ",";
            }
            str =str.substring(0,str.length()-1);
            str += "]";
            System.out.println("移动" + (k-j+1) + "次结果：" + str);
        }
    }
}
