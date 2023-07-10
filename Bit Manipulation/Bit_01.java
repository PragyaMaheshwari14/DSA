
import java.net.InetAddress;
import java.util.Scanner;
public class Bit_01 {

  public static void oddOReven(int n){
     int bitMask =  1;
     if(( n  & bitMask ) == 0){
          System.out.println(" bit number is even");
     }
     else {
          System.out.println("bit number is odd ");
    }

}
   
   public static int getIthbit(int n , int i){
       int biMask = 1 << i ;
       if((n & (1 <<i ) ) == 0 ){
         return 0;
       }
       else{
        return 1;
      }
   }

   public static int setIthbit(int n , int i){
      int bitMask = 1<< i;
      return n | bitMask ;
   }

   public static int clearIthbit(int n , int i){
      int bitMask  = ~(1 << i);
      return n & bitMask ;
   } 
 
   public static int updateIthbit(int n , int i , int newBit){

    // n= clearIthBit(n , i);
    // ith BitMask  = newBit << i ;
    // return n |BitMask ;

       if(newBit == 0){
         return clearIthbit(n,i);
      }
       else{
         return setIthbit(n ,i);
      }
   }

   public static int clearIbits(int n , int i ){
     int bitMask =((~0 ) << i);
       return n & bitMask ;
   }

   public static int clearIbits(int n , int i , int j ){
      int a = ((~0)<< j+1);
      int b = (1 << i)-1;
      int bitMask = a |  b ;
      return n & bitMask ;
   }
   
   public static boolean  isPowerOfTwo(int n ){
      return (n & (n-1)) == 0 ;
   }

    public static int countSetBits(int n){
      int count  = 0;
      while(n > 0){
           if((n & 1) !=0 ){// check our LSB
             count++ ;
           }
         n = n>>1;
      }
         return count ;
    }

   public static int fastExpo(int a, int n){
      int ans = 1 ;
   
      while(n > 0){
        if((n & 1) !=0) { // LSB
           ans = ans * a ; 
        }
       a = a * a;
       n = n >> 1;
     }
       return ans ;
   }

   public static long ModExpo(int a , int n , int x){
      long ans = 1;
      while(n > 0){
         if((n & 1) != 0){
             ans = (ans * a % x)%x;
         }
      a = (a % x * a % x)%x ;
      n = n >> 1; 
      }
      return ans ;
   }


   public static void main (String args[])  {
     
    //   oddOReven(2);
    //   oddOReven(14);


   //  System.out.println( getIthbit(10, 2));

   // System.out.println(setIthbit(10, 2));

   // System.out.println(clearIthbit(10, 1));

   //  System.out.println(updateIthbit(10, 2, 1));

   //    System.out.println(clearIbits(15, 2));

   //    System.out.println(clearIbits(10 , 2, 4));
       
   //    System.out.println(isPowerOfTwo(8));

   //    System.out.println(countSetBits(10));
    
   //    System.out.println(fastExpo(5, 3));

   System.out.println(ModExpo(123456, 5, 10000003));

//   System.out.println((5 & 6)); // and operator
//   System.out.println((5 | 6)); // or operator
//   System.out.println((5 ^ 6)); // xor operator
// System.out.println((~ 5));    // ones complement or not operator
//   System.out.println((~0));

//   System.out.println((5 << 2));
//       // left shift // a << b  = (a * 2^b)
//   System.out.println((6 >> 1));
//       // right shift // a >> b = (a / 2^b)

  }
}
