public class O_1Knapsack {

    // Recursion ;O(2^n)
     public static int knapsackRecu(int val[], int wt[], int W, int n ){
        if( W == 0 || n ==0 ){
            return 0;
        }

        if(wt[n-1] <= W){ // valid
           // include
           int ans1 = val[n-1] + knapsackRecu(val, wt, W-wt[n-1], n-1 );
          // exclude
           int ans2 = knapsackRecu(val, wt, W, n-1 );
            return   Math.max(ans1, ans2);
        
        } else { // not valid
             return  knapsackRecu(val, wt, W, n-1);
        }
    }
    // Memoization:O(n * W )
    public static int knapsack(int val[], int wt[], int W, int n ,int dp[][]){
        if( W == 0 || n ==0 ){
            return 0;
        }
        
        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){ // valid
           // include
           int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1 , dp);
          // exclude
           int ans2 = knapsack(val, wt, W, n-1 ,dp);
           dp[n][W] = Math.max(ans1, ans2);
          return dp[n][W];
        } else { // not valid
            dp[n][W] = knapsack(val, wt, W, n-1 ,dp);
            return dp[n][W];
        }
    }

    public static void print(int dp[][]){ // print the dp table
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
 // Tabulization
    public static int knapsackTab(int val[] ,int wt[] , int W){
        int n = val.length;
        int dp[][] = new int [n+1] [W+1];
        for( int i=0; i<dp.length; i++){ // 0th column
            dp[i][0] = 0;
        }
        for( int j=0; j<dp[0].length; j++){ //0throw
            dp[0][j] = 0;
        }

        for( int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1]; // ith item value
                int w= wt[i-1]; // ith item wt
                if( w<=j ) { // valid
                  int incProfit = v + dp[i-1][j-w];
                  int excProfit = dp[i-1][j];
                  dp[i][j] = Math.max(incProfit , excProfit);
                } else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] =  excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];

    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] =  new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++){
             for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
             }
        }
        System.out.println(knapsack(val, wt, W, val.length ,dp ));
        System.out.println(knapsackTab(val, wt, W));
        System.out.println(knapsackRecu(val, wt, W, val.length));
        
    }
}
