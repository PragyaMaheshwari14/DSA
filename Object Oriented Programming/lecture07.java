public class lecture07 {
     public static void main (String args []){
         Deer d = new Deer();
         d.eat();
     }
}
     // functiomn overriding // Run time polymorphism
class Animal {
    void eat(){
        System.out.println("eat everything");

    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
