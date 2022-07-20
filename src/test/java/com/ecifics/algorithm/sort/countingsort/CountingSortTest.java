package com.ecifics.algorithm.sort.countingsort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 计数排序测试
 * @date 7/20/2022-9:44 PM
 */
public class CountingSortTest {

    @Test
    public void testCountingSort() {
        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};

        CountingSort countingSort = new CountingSort();
        countingSort.countingSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
