public class lecture06 {
    public static void main (String args []){
       Calculator clc = new Calculator();
       System.out.println(clc.sum(1,2));
       System.out.println(clc.sum((float)1.5,(float)2.3));
       System.out.println(clc.sum(1,2 ,5));
    }
} 
 // Function((method)) Overloading //  compile time polymorphism

class Calculator{
   int sum(int a, int b ){
    return a+b ;
   }

   float sum (float a , float b){
    return a+b ;
   }

   int sum (int a, int b, int c ){
    return a + b + c ;
   }
}

   