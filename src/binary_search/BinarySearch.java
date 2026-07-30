package binary_search;

public class BinarySearch {
    static void main() {

        int[] arr = {12,23,45,56,76,89,98,123,345,567};
        int target = 56;
        int res = BS(arr,target);
        System.out.println(res);
    }


    public static int BS(int[] arr , int target){
        int i=0;
        int j = arr.length-1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] == target)return mid;
            if(target > arr[mid]){
                i = mid+1;
            }
            else j = mid-1;
        }
        return -1;
    }
}
