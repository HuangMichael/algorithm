package com.huangbin.algorithm.chaprter1.slides;

/**
 * Created by huangbin on 2016/4/26.
 * 在一个数组中查找一个元素，找到返回下标，找不到返回-1
 */
public class ElementSearch {


    public static int array[] = {22, 43, 65, 1123, 467, 223, 2245, 5775, 88};

    public static void main(String args[]) {
        System.out.println(search(array, 88));
    }

    /*
    * 在数组中查找元素
    * */
    public static int search(int array[], int targetNumber) {

        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                result = i;
                break;
            }
        }
        return result;
    }
}
