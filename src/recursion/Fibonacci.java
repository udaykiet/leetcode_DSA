package recursion;

public class Fibonacci {
    static void main() {
        int answer  = findFib(12);
        System.out.println(answer);
    }


    public static int findFib(int n){

        if(n == 0 || n== 1) return n;
        return findFib(n-1) + findFib(n-2);
    }
}


// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144