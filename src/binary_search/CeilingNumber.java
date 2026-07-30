package binary_search;

public class CeilingNumber {
    static void main() {

        int[] arr = {3, 8, 15, 22, 31, 47, 59, 68, 75, 90};
        int res = findCeilingNumber(arr,48); // find the
        System.out.println(res);
    }


    public static int findCeilingNumber(int[] arr , int num){
        int i=0;
        int j = arr.length -1;
        int temp = Integer.MIN_VALUE; //67 ,

        while(i <=j){
            int mid = i + (j-i)/2;
            if(arr[mid] == num) return arr[mid];
            if(arr[mid] > num) {
                temp = arr[mid];
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return temp;
    }

}
