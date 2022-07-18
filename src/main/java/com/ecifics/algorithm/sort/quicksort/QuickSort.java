package com.ecifics.algorithm.sort.quicksort;

/**
 * @author Ecifics
 * @Description 快速排序
 * @date 7/18/2022-9:07 PM
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return ;
        }

        int middle = partition(arr, start, end);
        quickSort(arr, start, middle - 1);
        quickSort(arr, middle + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        // 选择第一个元素作为基数
        int pivot = arr[start];
        // 设置left和right两者指针，分别从数组两头向中间遍历
        int left = start + 1;
        int right = end;

        while (left < right) {
            // 寻找位于数组前端大于基数的数用于交换到后半部分数组中
            while (left < right && arr[left] < pivot) {
                ++left;
            }
            // 寻找位于数组后端小于基数的
            while (left < right && arr[right] > pivot) {
                --right;
            }

            swap(arr, left, right);
        }

        // 将基数插入对应的位置
        if (left == right) {
            --right;
        }

        if (right != start) {
            swap(arr, start, right);
        }

        return right;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
