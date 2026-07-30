package linear_search;

public class Q1295 {
    static void main() {

        int[] nums = {12,345,2,6,7896,90,2}; //2
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {
        int res = 0;
        for(int value : nums){
            if(digitCounter(value) %2 ==0)
                res++;
        }
        return res;
    }

    static int digitCounter(int value){
        int counter = 0;
        while(value!=0){
            counter++;
            value = value/10;
        }
        return counter;
    }
}




