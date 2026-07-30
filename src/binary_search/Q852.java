package binary_search;

public class Q852 {
    static void main() {
        int[] arr = {3,5,3,2,0};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return arr[mid];
            if(arr[mid] < arr[mid+1]) i = mid+1;
            else j = mid-1;
        }
        return -1;
    }
}


