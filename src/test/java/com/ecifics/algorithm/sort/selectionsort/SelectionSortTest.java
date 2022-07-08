package com.ecifics.algorithm.sort.selectionsort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description TODO
 * @date 7/8/2022-7:38 PM
 */
public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        SelectionSort2 selectionSort = new SelectionSort2();

        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};
        selectionSort.selectionSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
