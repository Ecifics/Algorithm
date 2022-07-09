package com.ecifics.algorithm.sort.shellsort;

/**
 * @author Ecifics
 * @Description 希尔排序
 * @date 7/9/2022-12:34 PM
 */
public class ShellSort {
    public void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int startGroupIndex = 0; startGroupIndex < n; startGroupIndex += gap) {
                // 将当前curIndex元素向前面排序好的数组中插入排序
                for (int curIndex = startGroupIndex + gap; curIndex < n; curIndex += gap) {
                    int curNum = arr[curIndex];
                    int prevIndex = curIndex - gap;
                    // 向前寻找curNum合适的插入位置
                    while (prevIndex >= startGroupIndex && curNum < arr[prevIndex]) {
                        // 将当前元素用前一个元素覆盖
                        arr[prevIndex + gap] = arr[prevIndex];
                        prevIndex -= gap;
                    }

                    arr[prevIndex + gap] = curNum;
                }
            }
        }
    }
}
