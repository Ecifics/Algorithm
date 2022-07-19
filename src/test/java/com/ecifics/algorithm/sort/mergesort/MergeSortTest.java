package com.ecifics.algorithm.sort.mergesort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 归并排序测试
 * @date 7/19/2022-10:29 PM
 */
public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
