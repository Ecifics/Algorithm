package com.ecifics.algorithm.sort.insertsort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description TODO
 * @date 7/8/2022-10:35 PM
 */
public class InsertSortTest {
    @Test
    public void testInsertSort() {
        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};

        InsertSort2 insertSort = new InsertSort2();
        insertSort.insertSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
