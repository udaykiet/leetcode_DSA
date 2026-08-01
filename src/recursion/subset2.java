package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    static void main() {
        int[] nums = {2,2};
        System.out.println(subsetsWithDup(nums));
    }

    private static void findSubset(int[] nums, List<List<Integer>> res, List<Integer> temp, int index){
        if(index == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        findSubset(nums, res, temp, index+1);

        temp.remove(temp.size()-1);
        int val = nums[index];
        while(index < nums.length && nums[index] == val){
            index++;
        }

        findSubset(nums, res, temp, index);

    }


    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        bubblesort(nums,0);
        System.out.println("sorted array: "+ Arrays.toString(nums));
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findSubset(nums, res, temp, 0);
        return res;
    }




    //[10,7,3,6,8]
    private static void bubblesort(int[] arr, int index){
        if(index == arr.length-1) return;

        for(int i = 0; i < arr.length -index-1 ; i++){
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubblesort(arr, index+1);
    }
}
