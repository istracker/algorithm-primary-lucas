package day01_sort;

/**
 * @Author: licanpeng
 * @Date: 2021/2/3 17:16
 */


import java.util.Arrays;

import static java.lang.Math.*;

/**
 *  1. 冒泡排序
 *  左右两两比较
 *
 *  复杂度 O(N)
 *
 */
public class BubbleSort {


    // 冒泡排序
    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }



    private static void swap(int[] arr, int i, int j) {
        if (arr == null) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int maxSize = 5000;
        int maxValue = 9999;
        int[] arr = generateRandomArray(maxSize, maxValue);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /************************************** for test ********************************************/

    // 生成随机数组
    private static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) (random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxSize + 1) * random()) - (int) (maxSize * random());
        }
        return arr;
    }

}
