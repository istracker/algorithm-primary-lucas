package day01_sort;

/**
 * @Author: licanpeng
 * @Date: 2021/2/3 18:22
 */

import java.util.Arrays;

/**
 * 选择排序：每次选择最小的数，放到前面
 *    n 个数
 *    第1次：在[0, n-1] 中选择最小值，放到0位置
 *    第2次：在[1, n-1] 中选择最小值，放到1位置
 *    ...
 *    第i次：在[i-1, n-1] 中选择最小值，放到i-1位置
 *    ...
 *
 *    复杂度 O(N)
 */

public class SelectionSort {


    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 0 ~ N-1  找到最小值，在哪，放到0位置上
        // 1 ~ n-1  找到最小值，在哪，放到1 位置上
        // 2 ~ n-1  找到最小值，在哪，放到2 位置上
        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;
            // 在 i 到 n-1 之间寻找最小值的下标
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            // 把最小值放到 i 位置
            swap(arr, i, minIndex);
        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void main(String[] args) {
        int maxSize = 20;
        int maxValue = 30;
        int[] arr = generateRandomArray(maxSize, maxValue);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        /*comparator(arr);
        System.out.println(Arrays.toString(arr));*/

    }


    /************************ for test ****************************/
    // 比较两个数组是否相等
    public boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // 生成随机数组
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random()   [0,1)
        // Math.random() * N  [0,N)
        // (int)(Math.random() * N)  [0, N-1]

        int[] arr = new int[(int) (Math.random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxSize + 1) * Math.random()) - (int) (maxSize * Math.random());
        }
        return arr;
    }


    // 复制数组
    public int[] copy(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    // 集合工具进行排序
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }




}
