package binary_search;

public class Q33 {
    static void main() {
        int[] nums = {3,1};
        int target = 3;
        int res = searchingArray(nums, target);
        System.out.println(res);
    }


    public static int findPivot(int[] nums){
        for(int i=0 ;i<nums.length-1 ;i++){
            if(nums[i+1] < nums[i]) return i;
        }
        return -1;
    }

    public static int Binary_search(int[] nums, int target, int i, int j){
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid] == target) return mid;
            if(target > nums[mid]) i = mid+1;
            else j = mid-1;
        }
        return -1;
    }

    public static int searchingArray(int[] nums, int target){

        int pivot = findPivot(nums);
        System.out.println("pivot:" + pivot);
        if(pivot == -1) return Binary_search(nums, target, 0, nums.length-1);
        if(target >= nums[0]) return Binary_search(nums, target, 0 , pivot);
        else return Binary_search(nums, target, pivot+1, nums.length-1);
    }
}
