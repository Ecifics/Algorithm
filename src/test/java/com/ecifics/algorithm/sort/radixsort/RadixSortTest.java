package com.ecifics.algorithm.sort.radixsort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 基数排序测试
 * @date 7/21/2022-9:31 PM
 */
public class RadixSortTest {

    @Test
    public void testRadixSort() {
        int[] arr = {9, -8, 10, 2525, -2, 3, 50, 2, -10, 4};

        RadixSort radixSort = new RadixSort();
        radixSort.radixSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
