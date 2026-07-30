package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {

        int[] arr = {8, 3, 6, 1, 5};
        doSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doSelectionSort(int[] arr){
        for( int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for( int j = i ; j<arr.length; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
}
