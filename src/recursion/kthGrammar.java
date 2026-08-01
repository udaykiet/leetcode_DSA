package recursion;

public class kthGrammar {
    static void main() {

        int res = findkthGrammar(4,5);
        System.out.println(res);

    }



    public static  int findkthGrammar(int n, int k) {
        if(n == 1) return 0;

        int total = (int) Math.pow(2,n-1);
        if(k > total/2){
            return findkthGrammar(n-1, k - total/2) == 1 ? 0 : 1;
        }
       return findkthGrammar(n-1, k) == 1 ? 1 : 0;
    }
}
