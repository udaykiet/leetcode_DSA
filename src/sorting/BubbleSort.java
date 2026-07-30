package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {8, 3, 6, 1, 5};
        doBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doBubbleSort(int[] arr){
        for(int k=0; k<arr.length-1;k++){
            int i=0;
            int j=i+1;
            while((j+k)<arr.length){
                if(arr[j] < arr[i]){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
                j++;
                i++;
            }
        }
    }
}
