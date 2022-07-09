package com.ecifics.algorithm.sort.shellsort;

import com.ecifics.algorithm.sort.insertsort.InsertSort2;
import jdk.nashorn.tools.Shell;
import org.junit.jupiter.api.Test;

/**
 * @author Ecifics
 * @Description 希尔排序测试
 * @date 7/9/2022-12:41 PM
 */
public class ShellSortTest {

    @Test
    public void testShellSort() {
        int[] arr = {9, 8, 10, 2525, 2, 3, 50, 2, 10, 4};

        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
