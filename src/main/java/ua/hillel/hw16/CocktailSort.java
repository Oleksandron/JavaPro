package ua.hillel.hw16;

public class CocktailSort {
    static void toSort(int[] array) {
        boolean isSwap = true;
        int start = 0;
        int end = array.length;

        while (isSwap == true) {
            isSwap = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwap = true;
                }
            }
            if (isSwap == false)
                break;
            isSwap = false;
            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSwap = true;
                }
            }
            start = start + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{91, 73, 44, 7, 83, 13, 55, 31, 99, 63, 28, 88, 29, 3, 69, 17, 47, 75, 5, 39, 51, 71};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("  ");
        int low = 0;
        int high = arr.length - 1;
        toSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
