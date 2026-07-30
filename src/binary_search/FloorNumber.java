package binary_search;

public class FloorNumber {
    static void main() {
        int[] arr = {5, 12, 18, 27, 35, 46, 58, 64, 79, 91};
        int res = findFloorNumber(arr, 100);
        System.out.println(res);
    }


    public static int findFloorNumber(int[] arr, int num){
        int i = 0;
        int j = arr.length-1;
        int temp = -1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] == num) return arr[mid];
            if(num > arr[mid]){
                temp = arr[mid];
                i = mid + 1;
            }
            else{
                j = mid-1;
            }
        }
        return temp;
    }
}
