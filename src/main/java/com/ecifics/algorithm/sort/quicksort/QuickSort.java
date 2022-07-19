package com.ecifics.algorithm.sort.quicksort;

/**
 * @author Ecifics
 * @Description 快速排序
 * @date 7/18/2022-9:07 PM
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return ;
        }

        int middle = partition(nums, start, end);
        quickSort(nums, start, middle - 1);
        quickSort(nums, middle + 1, end);
    }

    private int partition(int[] nums, int start, int end) {
        // 将第一个元素设置为基数
        int pivot = nums[start];
        int left = start + 1;
        int right = end;

        while (left < right) {
            while (left < right && nums[left] <= pivot) {
                ++left;
            }

            while (left < right && nums[right] >= pivot) {
                --right;
            }

            if (left < right) {
                swap(nums, left, right);
                ++left;
                --right;
            }
        }

        if (right == left && nums[right] > pivot) {
            --right;
        }

        if (right != start) {
            swap(nums, right, start);
        }

        return right;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
