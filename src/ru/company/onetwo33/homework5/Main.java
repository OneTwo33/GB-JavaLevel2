package ru.company.onetwo33.homework5;

import java.util.Arrays;

public class Main {
    static final int size = 10_000_000;
    static final int h = size / 2;

    public static void main(String[] args) throws InterruptedException {
        method1(size);
        method2(size);
    }

    public static void method1(int sizeArr) {
        float[] arr = new float[sizeArr];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void method2(int sizeArr) throws InterruptedException {
        float[] arr = new float[sizeArr];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        float[] newArr1 = new float[h];
        float[] newArr2 = new float[h];
        System.arraycopy(arr, 0, newArr1, 0, h);
        System.arraycopy(arr, h, newArr2, 0, h);
        Thread th1 = new Thread(new ThreadFill(newArr1));
        Thread th2 = new Thread(new ThreadFill(newArr2));
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.arraycopy(newArr1, 0, arr, 0, h);
        System.arraycopy(newArr2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }
}
