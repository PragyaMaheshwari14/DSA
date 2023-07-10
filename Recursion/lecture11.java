public class lecture11 { 
    public static int tilingProblem(int n){ // 2 x n (floor size)
        // base case
        if(n == 0 || n == 1){
            return 1 ;
        }

        //kaam 
        // vertical choice
         // int fnm1 = tilingProblem(n-1);

        // horizonatal choice
        // int fnm2 = tilingProblem(n-2);

        // int totalWays = fnm1 + fnm2;
       // return totalWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String args[]){
       System.out.println(tilingProblem(4));
    }
}
   