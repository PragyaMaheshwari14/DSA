public class lecture05 {
    public static void main(String args[]){
      Fish starfish = new Fish();
      starfish.eat();
      starfish.swim();
      starfish.breathe();

      Mammal cow = new Mammal();
      cow.eat();
      cow.walk();
    }
}
   // Hierarichial inheritance 

  class Animal{
     String color ;
       void eat(){
         System.out.println("eats");
        }
       void breathe(){
         System.out.println("breathes");
       }
    }
    class Mammal extends Animal {
        void walk(){
            System.out.println("walks");
        }
    }
    class Fish extends Animal {
        void swim(){
            System.out.println("swim in water");
        }
    }
