package com.ecifics.algorithm.sort.mergesort;

/**
 * @author Ecifics
 * @Description 归并排序
 * @date 7/19/2022-10:12 PM
 */
public class MergeSort {

    public void mergeSort(int[] arr) {
        int[] result = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, result);
    }

    private void mergeSort(int[] arr, int start, int end, int[] result) {
        // 只有一个元素已经有序，不需要在进行切割
        if (start == end) {
            return ;
        }

        int middle = ((end - start) >> 1) + start;
        mergeSort(arr, start, middle, result);
        mergeSort(arr, middle + 1, end, result);
        // 将[start, end]区间内的元素排序好后临时放入result数组中，然后再放入原数组[start, end]区间内
        merge(arr, start, end, result);
    }

    private void merge(int[] arr, int start, int end, int[] result) {
        int end1 = ((end - start) >> 1)  + start;
        int start2 = end1 + 1;

        // 用于定位第一个有序数组
        int index1 = start;
        // 用于定位第二个有序数组
        int index2 = start2;

        // 合并两个有序数组
        while (index1 <= end1 && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                result[index1 + index2 - start2] = arr[index1];
                ++index1;
            } else {
                result[index1 + index2 - start2] = arr[index2];
                ++index2;
            }
        }

        // 将剩余元素放入临时数组result
        while (index1 <= end1) {
            result[index1 + index2 - start2] = arr[index1];
            index1++;
        }

        while (index2 <= end) {
            result[index1 + index2 - start2] = arr[index2];
            ++index2;
        }

        while (start <= end) {
            arr[start] = result[start];
            ++start;
        }
    }

}
