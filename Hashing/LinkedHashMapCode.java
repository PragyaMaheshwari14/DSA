import java.util.*;
public class LinkedHashMapCode {
      public static void main(String args[]){
         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("India" ,100);
         lhm.put("China", 150);
         lhm.put("USA", 200);

         HashMap<String, Integer> hm = new HashMap<>();
         hm.put("India" ,100);
         hm.put("China", 150);
         hm.put("USA", 200);

         System.out.println("order of hashmap "+hm);   
         System.out.println("order of LinkedHashMap" + lhm); 
    }
}


