package com.ecifics.algorithm.sort.countingsort;

/**
 * @author Ecifics
 * @Description 计数排序
 * @date 7/20/2022-9:31 PM
 */
public class CountingSort {

    public void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return ;
        }

        // 寻找数组中最小和最大的元素，用于确定数组元素的范围区间
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        // 数组元素范围
        int range = max - min + 1;

        // 统计每个元素所在位次的元素个数
        int[] counting = new int[range];
        for (int num : arr) {
            ++counting[num - min];
        }

        // 统计每个元素之前的元素个数
        int preCounts = 0;
        for (int i = 0; i < range; ++i) {
            preCounts += counting[i];
            counting[i] = preCounts - counting[i];
        }

        // 将元素放入临时数组中
        int[] result = new int[arr.length];
        for (int num : arr) {
            result[counting[num - min]] = num;
            ++counting[num - min];
        }

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = result[i];
        }
    }
}
