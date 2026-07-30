package binary_search;

import java.lang.reflect.Array;
import java.util.Arrays;

//infinite means we cannot use array.lenght
public class BSonInfinteArray {
    static void main() {
        int[] arr = {
                2,   5,   8,  11,  15,  19,  23,  27,  31,  35,
                39,  42,  46,  50,  54,  58,  61,  65,  69,  73,
                77,  81,  85,  89,  93,  97, 101, 105, 109, 113,
                117, 121, 125, 129, 133, 137, 141, 145, 149, 153,
                157, 161, 165, 169, 173, 177, 181, 185, 189, 193,
                197, 201, 205, 209, 213, 217, 221, 225, 229, 233,
                237, 241, 245, 249, 253, 257, 261, 265, 269, 273,
                277, 281, 285, 289, 293, 297, 301, 305, 309, 313,
                317, 321, 325, 329, 333, 337, 341, 345, 349, 353,
                357, 361, 365, 369, 373, 377, 381, 385, 389, 393
        };
        int target = 1;
        int res = findBS(arr , target);
        System.out.println(res);
    }

    public static int[] findWindow(int[]arr , int target){
        int i = 0;
        int j = 1;

        while(j < arr.length){
            if(target <= arr[j] && target >= arr[i]){
                return new int[]{i,j};
            }
            else{
                i = j +1;
                j = i*2 +1;
                if(j > arr.length) j = arr.length-1;
                if(i == arr.length) return new int[]{-1,-1};
            }
        }
        return new int[]{-1,-1};

    }

    public static int findBS(int[] arr, int target){
        int[] window = findWindow(arr, target);
        if(window[0] == -1) return -1;

        int i = window[0];
        int j = window[1];

        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] == target) return arr[mid];
            if(target > arr[mid]) i = mid+1;
            else j = mid -1;
        }
        return -1;
    }
}
