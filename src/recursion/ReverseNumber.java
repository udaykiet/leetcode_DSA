package recursion;

public class ReverseNumber {
    static void main() {
        int num = 9867;
        int sum = 0;
        int res = findReverseRec(num, sum);

//        System.out.println(findcountzero(1209080, 0));

        int[] arr ={1,2,3,4,-1};
        System.out.println(findSortedOrNot(arr, 0));
    }

    //123
    public static int findReverse(int num){
        int res = 0;
        while(num!=0){
            int lastdigit = num%10;
            res = res*10 + lastdigit;
            num = num/10;
        }
        return res;
    }


    public static int findReverseRec(int num, int sum){
        if(num ==0) return sum;
        sum  = sum*10 +num%10;
       return findReverseRec(num/10, sum);
    }

    public static int findcountzero(int num , int count) {
        if(num == 0) return count;
        if (num % 10 == 0) count++;
        return findcountzero(num / 10, count);
    }

    public static boolean findSortedOrNot(int[] arr , int index){
        if(index == arr.length-1) return true;
        if(arr[index] > arr[index+1]) return false;

        return findSortedOrNot(arr, index+1);

    }
}

//102