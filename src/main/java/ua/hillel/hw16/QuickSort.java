package ua.hillel.hw16;

public class QuickSort {
        public static void toSort(int[] arr,int low,int high){
        if (low >= high) return;
        int pivot = arr[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) toSort(arr, low, j);
        if (high > i) toSort(arr, i, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{91, 73, 44, 7, 83, 13, 55, 31, 99, 63, 28, 88, 29, 3, 69, 17, 47, 75, 5, 39, 51, 71};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("  ");
        int low = 0;
        int high = arr.length - 1;
        toSort(arr, low, high);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
