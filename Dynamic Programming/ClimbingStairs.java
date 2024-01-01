import java.util.Arrays;

public class ClimbingStairs {
    // memoization O(n)  | recursion -O(2^n)
    public static int Countways(int n , int ways[]){
         if(n == 0){
            return 1 ;
         }
         if(n < 0 ){
            return 0;
         }
         if( ways[n] != -1){ //already calculate
            return ways[n];
         }
         ways[n]=  Countways(n-1 , ways) + Countways(n-2 , ways);
         return ways[n];
    }

    public static int countWaysTab(int n){ //O(n)
        int dp[] = new int[n+1];
         dp[0] = 1;

         //tabulation loop
         for(int i=1; i<=n; i++){
            if(i == 1) {
               dp[i] = dp[i-1];
            } else {
               dp[i] = dp[i-1] + dp[i-2];
            }
         }
         return dp[n];
    }

public static void main(String[] args) {
    int n = 5; // n=3 -> 3 & n=4 ->5 =>5+3 =8
    int ways[] = new int[n+1];
    Arrays.fill( ways, -1);
    System.out.println(Countways(n , ways));
    System.out.println(countWaysTab(n));
}
}
