package linear_search;

public class Q1672 {
    static void main() {
        int[][] accounts = {
                {1, 2, 3},
                {3,2,1}
        };

        int result = maximumWealth(accounts);
        System.out.println(result);
    }


    static public int maximumWealth(int[][] accounts) {

        int res = 0;
        for(int i=0; i<accounts.length ;i++){
            int temp =0;
            for(int j=0; j< accounts[i].length ;j++){
                temp  = temp + accounts[i][j];
            }
            if(temp > res)
                res = temp;
        }

        return res;
    }
}
