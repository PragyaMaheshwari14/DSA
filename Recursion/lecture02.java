public class lecture02 {
     public static void  printinreasing(int n){
        if( n == 1){
          System.out.print(n + " ");
          return ;
         }
       printinreasing(n-1);
      System.out.print (n + " " );
      }
  public static void main(String args[]){
       int n =6;
        printinreasing(n);
      }
  }
