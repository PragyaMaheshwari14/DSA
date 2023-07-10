public class lecture10 {
  public static  int optimizedPower(int x, int n ){
      if(n == 0){
         return 1 ;
       }
       int halfpower = optimizedPower(x, n/2);
       int halfpowersquare = halfpower * halfpower; 
       // n is odd 
        if(n % 2 != 0){
           halfpowersquare = x * halfpowersquare ;
         }
      return halfpowersquare;
     }

    public static void main(String args[]){
    System.out.println(optimizedPower(2, 5));
    }
}
