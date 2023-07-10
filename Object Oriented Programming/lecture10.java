public class lecture10 {
    public static void main (String args[]){
        Bear b = new Bear();
         b.eats();

         Human h = new Human();
         h.eats();
    }
}
                       //  interface implements mutiple inheritance
interface Harbivore{
    void eats();
}

interface Carnivore{
    void eats();
}

class  Bear   implements Herbivore, Carnivore {
    public void eats() {
        System.out.println(" bear are herbivore and also carnivore");
     }
}

class Human implements Harbivore,Carnivore{
    public void eats(){
       System.out.println(" humans are herbivore and  also carnivore");
    }
}