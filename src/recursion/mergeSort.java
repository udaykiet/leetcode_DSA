package recursion;

import java.util.Arrays;

public class mergeSort {
    static void main() {
        int[] arr = {10,4,2,1,45,6,4,56,7,7,89,90,90,78,667};
        findMergeSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    private static void mergeArray(int[] arr, int i, int mid, int j){
        int k = mid+1;
        int[] temp = new int[j-i+1];
        int x =0;
        int store = i;

        while(i<=mid && k <= j){
            if(arr[i] < arr[k]){
                temp[x] = arr[i];
                i++;
                x++;
            }
            else{
                temp[x] = arr[k];
                k++;
                x++;
            }
        }

        if(k > j){
            while(i <= mid){
                temp[x] = arr[i];
                x++;
                i++;
            }
        }
        else{
            while(k <= j){
                temp[x] = arr[k];
                k++;
                x++;

            }
        }

        for(int val : temp){
            arr[store] = val;
            store++;
        }


    }

    private static void findMergeSort(int[] arr, int i , int j){

        if(i == j) return;

        int mid = i + (j-i)/2;
        findMergeSort(arr, i , mid);

        findMergeSort(arr, mid+1, j);

         mergeArray(arr, i , mid, j);


    }
}
