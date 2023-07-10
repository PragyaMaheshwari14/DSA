public class lecture04 {
    public static void main (String args[]){
    //  Fish shark = new Fish();
    //  shark.eat();
    //  shark.swim();

     Dog noddy = new Dog();
     noddy.eat();
     noddy.legs = 4;
     System.out.println(noddy.legs);
  }
} 
// base class // parent class
class Animal{
  String colour;
     void eat(){
        System.out.println("eats");
    }
      void breathe(){
        System.out.println("breathes");
    }
}
      // multilpel inheitance
class Mammal extends  Animal {
     int legs ;
    }
class Dog extends Mammal {
     String breed ;
}



// single inheritance 
// Derived class // child class
//  class Fish extends Animal{
//     int fins;
//       void swim(){
//         System.out.println("swims in water");
//     }
// }