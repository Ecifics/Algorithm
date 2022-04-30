package com.ecifics.algorithm.sort.bubblesort;

/**
 * @author Ecifics
 * @Description 在初始冒泡排序的基础上，使用一个变量记录当前轮次的比较是否发生过交换，如果没有发生交换表示已经有序，不再继续排序
 * @date 4/29/2022-10:57 PM
 */
public class BubbleSort2 {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            //用于标记数组内元素是否发生了交换
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }
}
