package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void main() {
        int[] candidates = {8,7,4,3};
        int target =11;
        List<List<Integer>> res = combinationSum(candidates, target);
        System.out.println(res);
    }



    private static void findCombinationSum(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int index){
        if(index == candidates.length) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

//        if(candidates[index] > target) return;
        //[3,2]

            if(candidates[index] <= target){
                temp.add(candidates[index]);
                findCombinationSum(candidates, res, temp, target-candidates[index], index);
                temp.remove(temp.size()-1);
            }

            findCombinationSum(candidates, res, temp, target, index+1);




    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombinationSum(candidates, res, temp, target , 0);
        return res;
    }
}
