package com.ecifics.algorithm.sort.insertsort;

/**
 * @author Ecifics
 * @Description 插入排序
 * @date 7/8/2022-10:32 PM
 */
public class InsertSort1 {
    public void insertSort(int[] arr) {
        int n = arr.length;

        // 索引i之前的元素都已排序，需要将索引i的元素插入到前面排序号的数组中去
        for (int i = 1; i < n; ++i) {
            int j = i;
            // 只要前一个数组比自己小，就和其交换
            while (j >= 1 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                --j;
            }
        }
    }
}
