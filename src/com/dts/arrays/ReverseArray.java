package com.dts.arrays;

import kotlin.collections.ArraysKt;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 5, 9, 10, 56};
        int len = arr.length;
        System.out.println("Array is " + Arrays.toString(arr));
        System.out.println("Array Length " + len);

        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        System.out.println("Reverse array " + Arrays.toString(arr));
    }
}
