package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static void main() {
        int[] arr = {1,2,5,6,7,10};
        int target = 3;
        List<List<Integer>> res = combinationSum2(arr, target);
        System.out.println(res);
    }

    private static void findCombinationSum2(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int index) {

        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if(index == candidates.length) return;

        if(candidates[index] <= target){
            temp.add(candidates[index]);
            findCombinationSum2(candidates, target-candidates[index], res, temp, index+1);
            temp.remove(temp.size()-1);
        }


        while(index < candidates.length-1 && candidates[index+1] == candidates[index]){
            index++;
        }
        findCombinationSum2(candidates, target, res, temp, index+1);
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombinationSum2(candidates, target, res, temp, 0);
        return res;
    }


}
