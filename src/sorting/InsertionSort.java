package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {8, 3, 6, 1, 5};
        doInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doInsertionSort(int[] arr){
        for( int i=1; i<arr.length-1; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                    j--;
                }
                else break;
            }
            arr[j+1] = temp;
        }
    }
}
