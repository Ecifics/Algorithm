package com.ecifics.algorithm.sort.quicksort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 快速排序测试
 * @date 7/18/2022-9:17 PM
 */
public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
