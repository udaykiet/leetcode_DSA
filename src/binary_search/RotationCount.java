package binary_search;



//find the minimum in rotated sorted array
public class RotationCount {
    static void main() {
        int[] arr = {3,4,5,1,2};
        int answer = findRotationCount(arr);
        System.out.println(answer);
    }

    public static int findPivot(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] < arr[i]) return i;
        }
        return -1;
    }

    public static int findRotationCount(int[] arr){
        int pivot = findPivot(arr);
        System.out.println("pivot: " + pivot);
        return (pivot+1)%arr.length;
    }
}


