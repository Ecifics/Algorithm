package com.ecifics.algorithm.sort.radixsort;

import java.util.Arrays;

/**
 * @author Ecifics
 * @Description 基数排序
 * @date 7/21/2022-9:10 PM
 */
public class RadixSort {

    public void radixSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return ;
        }

        int n = arr.length;
        // 找到数组元素中绝对值最大的数
        int max = 0;
        for (int num : arr) {
            if (Math.abs(num) > max) {
                max = Math.abs(num);
            }
        }

        // 通过数组最大值算出数组元素最大位数
        int maxDigits = 0;
        while (max != 0) {
            ++maxDigits;
            max /= 10;
        }

        // 从最后一位开始向前对每一位进行排序
        int dev = 1;
        // 数组中每一位的范围为[-9,9]，故为了方便可以在每一位上都加上9
        // 这时每一位的范围变成了[0,18]一共19个元素
        int range = 19;
        int[] counting = new int[range];
        int[] result = new int[n];
        for (int i = 0; i < maxDigits; ++i) {
            // 对每一位进行计数排序
            for (int num : arr) {
                // 获取第i为的元素，并在其值上加上9
                int radix = num / dev % 10 + 9;
                ++counting[radix];
            }

            // 计算[0, 18]范围内每个元素有多少个
            int preCounts = 0;
            for (int j = 0; j < range; ++j) {
                preCounts += counting[j];
                counting[j] = preCounts - counting[j];
            }

            // 根据元素第i位大小，将元素放入临时数组对应的位置处
            for (int num : arr) {
                int radix = num / dev % 10 + 9;
                result[counting[radix]++] = num;
            }

            System.arraycopy(result, 0, arr, 0, n);
            Arrays.fill(counting, 0);
            dev *= 10;
        }
    }
}
