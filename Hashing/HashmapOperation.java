import java.util.*;
public class HashmapOperation {
    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India" , 100);
        hm.put("China" , 150);
        hm.put("Us" , 120);
        System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // // ContsinsKey - O(1)
        // System.out.println(hm.containsKey("India")); //true
        // System.out.println(hm.containsKey("Indonesia")); //false

        //Remove - O(1)
        //System.out.println(hm.remove("India"));
        //System.out.println(hm);

       //Size
       System.out.println(hm.size());

       // Is Empty
       hm.clear();
       System.out.println(hm.isEmpty());
    }
} 