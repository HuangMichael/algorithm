package com.huangbin.algorithm.chaprter1.slides;

/**
 * Created by huangbin on 2016/4/26.
 * find the max number in the array
 */
public class MaxElementSearch {

    public static int array[] = {22, 43, 65, 1123, 467, 223, 2245, 5775, 88, 67755};

    public static void main(String args[]) {

        searchMax(array);
    }


    /**
     * @param array 要查找的数组对象
     */
    public static int searchMax(int[] array) {

        int max = array[0];
        for (int element : array) {
            max = (element < max) ? max : element;
        }
        System.out.println(" the max in the array is " + max);
        return max;
    }
}
