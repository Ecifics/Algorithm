package com.ecifics.algorithm.sort.bubblesort;

/**
 * @author Ecifics
 * @Description 除了使用变量记录当前轮次是否发生交换外，再使用一个变量记录上次发生交换的位置，下一轮排序时到达上次交换的位置就停止比较
 * @date 4/29/2022-11:01 PM
 */
public class BubbleSort3 {

    public void bubbleSort(int[] arr) {

        //最后一个无序子列的末尾下标
        int indexOfLastUnsortedElement = arr.length - 1;

        //上次交换的数组元素下标
        int swappedIndex = -1;

        //将isSwapped设置为true用于启动while循环
        boolean isSwapped = true;

        while(isSwapped) {
            isSwapped = false;

            for (int i = 0; i < indexOfLastUnsortedElement; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    isSwapped = true;
                    swappedIndex = i;
                }
            }

            indexOfLastUnsortedElement = swappedIndex;
        }
    }
}
