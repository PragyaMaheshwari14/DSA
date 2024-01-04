import java.util.*;
public class CatalanNumbers {
    // Recursion
    public static int catlanRec(int n){
        if( n== 0 || n==1){
            return 1;
        }
        int ans = 0; //Cn
        for( int i=0; i<=n-1; i++){
            ans += catlanRec(i) * catlanRec(n-i-1); 
        }
         return ans;
    }
    //Memorization
    public static int catlan(int n , int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if( dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for( int i=0; i<n; i++){
            ans += catlan(i, dp) * catlan(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(catlanRec(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catlan(4, dp));
    }
}
