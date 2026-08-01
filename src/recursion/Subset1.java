package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset1 {
    static void main() {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findSubsets(arr, res, temp, 0);

        System.out.println(res);
    }

    public static void findSubsets(int[] arr, List<List<Integer>> res, List<Integer> temp, int index){
        if(index == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[index]);
        findSubsets(arr, res, temp , index+1);

        temp.remove(temp.size()-1);
        findSubsets(arr, res, temp , index+1);
    }
}
