package com.ecifics.algorithm.sort.selectionsort;

/**
 * @author Ecifics
 * @Description 选择排序
 * @date 7/8/2022-7:54 PM
 */
public class SelectionSort2 {
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; ++i) {
            int minIndex = i;
            int maxIndex = i;
            for (int j = i + 1; j < n - i; ++j) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            // minIndex和maxIndex相同，表示已经排序完毕
            if (minIndex == maxIndex) {
                break;
            }

            // 交换minIndex和首位
            swap(arr, i, minIndex);

            // 如果首位为最大元素，需要重新定位最大元素
            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            // 将最大元素交换到数组末尾
            swap(arr, n - i - 1, maxIndex);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
