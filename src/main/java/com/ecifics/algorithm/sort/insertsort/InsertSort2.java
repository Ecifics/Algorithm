package com.ecifics.algorithm.sort.insertsort;

/**
 * @author Ecifics
 * @Description 插入排序
 * @date 7/8/2022-10:38 PM
 */
public class InsertSort2 {
    public void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int j = i;
            int temp = arr[j];
            // 如果前面一个数字比arr[j]小，那么将其后移，直到遇到一个合适的位置将arr[j]插入
            while (j >= 1 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                --j;
            }

            arr[j] = temp;
        }
    }
}
