package com.ecifics.algorithm.sort.bubblesort;

import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 用于测试冒泡排序的代码
 * @date 4/29/2022-10:52 PM
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        BubbleSort3 bubbleSort = new BubbleSort3();

        //int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};
        int[] arr = {1, 2, 3, 4, 5, 6};
        bubbleSort.bubbleSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
