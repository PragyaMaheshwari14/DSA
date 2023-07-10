public class lecture01{
  public static void printdecreasing( int n){
     if(n == 1){
        System.out.println(1);
        return;
      }
    System.out.print(n +" "); 
    printdecreasing( n-1); 
   }
   public static void main(String args[]){
    int n =10 ;
    printdecreasing(n);
  }
}