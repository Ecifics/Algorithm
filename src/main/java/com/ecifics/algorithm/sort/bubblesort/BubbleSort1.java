package com.ecifics.algorithm.sort.bubblesort;

/**
 * @author Ecifics
 * @Description 初始冒泡排序，基本思想：一边比较一边两两交换，将最大值或者最小值交换到末尾
 * @date 4/29/2022-10:46 PM
 */
public class BubbleSort1 {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
