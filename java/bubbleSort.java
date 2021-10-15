package com.company;

import java.util.Arrays;

public class tut13_bubbleSort {
    public static void main(String[] args) {
int[]arr={3,6,6,2,4,1,3,5,3};
bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        //run the stps n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
