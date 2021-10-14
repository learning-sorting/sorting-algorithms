package com.bubblewrap;
class Sort{
    int[] arr1 = {9,14,3,2,43,11,58,22};
    void forSort(){
        int swap;
        boolean stop=false;
        while(!stop){
            stop=true;
            for(int a=0;arr1.length-2>=a;a++){
                if (arr1[a] > arr1[a + 1]) {
                    swap = arr1[a + 1];
                    arr1[a + 1] = arr1[a];
                    arr1[a] = swap;
                    stop = false;
                }
            }
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        Sort S=new Sort();
        System.out.print("Unsorted: ");
        for (int arr: S.arr1) System.out.print(arr+" ");
        System.out.print("\nSorted: ");
        S.forSort();
        for (int arr: S.arr1) System.out.print(arr+" ");
    }
}
