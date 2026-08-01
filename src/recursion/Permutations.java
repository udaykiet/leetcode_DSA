package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Permutations {
    static void main() {
        int[] nums = {1,2,3,4};
        System.out.println(permute(nums));
    }


    private static void findpermute(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] present){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for( int i=0; i<nums.length ;i++){
            if(present[i] == false){
                temp.add(nums[i]);
                present[i] = true;
                findpermute(nums, res, temp, present);
                present[i] = false;
                temp.remove(temp.size()-1);

            }
        }
    }


    private static void findPermuteUsingSwap(int[] nums, List<List<Integer>> res, int index){
        if(index == nums.length-1){
            List<Integer> temp = new ArrayList<>();
           for(int n : nums){
               temp.add(n);
           }
           res.add(temp);
           return;
        }

        for(int i = index; i<nums.length; i++){
            swapping(nums, i , index);
            findPermuteUsingSwap(nums, res, index+1);
            swapping(nums, i , index);
        }


    }

    private static void swapping(int[] nums, int i , int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] present = new boolean[nums.length];
//        findpermute(nums, res, temp, present);
        findPermuteUsingSwap(nums, res,0);
        return res;
    }
}
