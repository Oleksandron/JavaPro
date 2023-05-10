package ua.hillel.hw10;

public class ValueCalculator extends Thread {
    static int size = 2000000;
    static int[] array = new int[size];

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void arraysWorking(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];
        System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, arr2, 0, arr.length / 2);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < arr1.length; i++) {
                    float test = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    arr1[i] = (int) test;
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < arr2.length; i++) {
                    float test = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    arr2[i] = (int) test;
                }
            }
        });
        thread2.start();
        int[] arrFull = new int[arr.length];
        System.arraycopy(arrFull, 0, arr1, 0, arr1.length);
        System.arraycopy(arrFull, arr1.length, arr2, 0, arr2.length);
    }

    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        long start = System.currentTimeMillis();
        arraysWorking(array);
        long end = System.currentTimeMillis();
        System.out.println("Times: " + (end - start));
    }
}
