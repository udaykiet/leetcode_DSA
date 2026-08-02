package recursion;

public class PowerRecursion {
    static void main() {
        double res = myPow(1,Integer.MIN_VALUE);
//        double res = myPow(2,-10);
        System.out.println(res);
    }

    private static double findPower(double n, long k){
        if(k == 1) return n;
        if(k == 0) return 1;



        if(k%2 != 0){
            return n*findPower(n,k-1);
        }
        double temp = (double) findPower(n, k/2);
        return temp*temp;
    }

    private static double myPow(double n , int k){

        if(k < 0){
            long temp = k;
            System.out.println(temp);
            temp = -temp;
            System.out.println(temp);
//            System.out.println(temp);
            long pow = -k;
//            System.out.println(pow);
            return 1/findPower(n,pow);
        }

        return findPower(n,k);



    }
}
