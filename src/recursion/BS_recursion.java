package recursion;

public class BS_recursion {
    static void main() {
        int[] arr = {12,23,45,56,76,89,98,123,345,567};
        int target = 5;
        boolean res = findBsRecursion(arr, target , 0 , arr.length-1);
        System.out.println(res);
    }

    public static boolean findBsRecursion(int[] arr , int target , int start, int end){
        if(start > end) return false;

        int mid = start + (end-start)/2;
        if(arr[mid] == target) return true;
        if(target > arr[mid])
            return findBsRecursion(arr, target, mid+1, end);
        return findBsRecursion(arr, target, start ,mid-1);
    }
}
