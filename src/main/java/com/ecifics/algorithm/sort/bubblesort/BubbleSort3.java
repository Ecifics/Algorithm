package com.ecifics.algorithm.sort.bubblesort;

/**
 * @author Ecifics
 * @Description 除了使用变量记录当前轮次是否发生交换外，再使用一个变量记录上次发生交换的位置，下一轮排序时到达上次交换的位置就停止比较
 * @date 4/29/2022-11:01 PM
 */
public class BubbleSort3 {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int indexOfLastUnsortedElem = n - 1;
        boolean isSwapped = true;
        int swappedIndex = -1;

        while (isSwapped) {
            isSwapped = false;

            for (int i = 0; i < indexOfLastUnsortedElem; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                    swappedIndex = i;
                    isSwapped = true;
                }
            }

            indexOfLastUnsortedElem = swappedIndex;
        }
    }
}
