public class lecture08 {
  public static void main (String args[]){
     //     Horse h = new Horse();
     //     h.eat();
      //     h. walk();
      //    // System.out.println(h.color);

      //     Chicken c = new Chicken();
     //     c. eat();
      //     c.walk();

      Mustang myhorse = new Mustang();
         //Animal-> Horse -> Mustang
         // hierrarichal class
    }
}
 abstract class Animal{
       String color ;
         // constructor 
     Animal(){   
        //color = "brown";
        System.out.println("animal constructor called");
      }
      void eat(){
         System.out.println(" animals eats");
       }

      abstract void walk();
   }

   class  Horse extends Animal{
      Horse(){
         System.out.println("horse constructor called");
       }
       void changecolor(){
          color = "white";
       }
       void walk(){
          System.out.println("walks on 4 legs");
        }
    }
    
    class Mustang extends Horse{
        Mustang (){
            System.out.println("mustang constructor called");
        }
    }
    class Chicken extends Animal{
        void changecolor(){
          color = "yellow";
        }
        void walk(){
            System.out.println(" waks on 2 legs");
         }
    }
