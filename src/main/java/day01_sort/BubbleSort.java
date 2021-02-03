package day01_sort;

/**
 * @Author: licanpeng
 * @Date: 2021/2/3 17:16
 */


/**
 *  1.
 *
 *
 */
public class BubbleSort {


    public static void main(String[] args) {
        int arr[] = /*{5, 3, 2, 4, 1, 6};{5, 4, 3, 2, 1}*/ { 181, 169, 187, 172, 163};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    // 选择排序
    private static void selectionSort(int[] arr) {
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


}
