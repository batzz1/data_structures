package com.dts.arrays;

/**
 * Create a class with name Arrays and Implement Following:
 * Method insert(int item): which takes a parameter and inserts the value into the array
 * Method removeAt(int index): removes the element at specified index
 * Method indexOf(int item): returns the index of the item if present and returns -1 if item is not present
 */


public class Array {

    int count;
    private int[] array;

    public Array(int length) {
        array = new int[length];
    }

    public void insert(int item) {
        //If Array is full
        if (array.length == count) {
            //Create a new Array
            int[] newItems = new int[count * 2];

            //Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = array[i];
            }

            //Set "array" to new new array "newItems"
            array = newItems;
        }

        array[count] = item;
        count++;
    }

    //
    public void removeAt(int index) {
        //Validate the Index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Please Check the Index");
        }
        //Shift the items to left if some item is deleted
        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (array[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public int max() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        removeZerosFromArray();
        return array[count - 1];
    }

    private void removeZerosFromArray() {
        for (int i = 0; i < count; i++) {
            if (array[i] == 0) {
                count--;
            }
        }
    }

}