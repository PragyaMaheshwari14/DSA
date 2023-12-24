import java.util.*;
public class TypesOfMap {
    public static void main(String args[]) {
        //1. HashMap => Unordered
        HashMap<String, Integer> hm = new HashMap<>();
         hm.put("India" ,100);
         hm.put("China", 150);
         hm.put("USA", 200);
  
        //2. LinkedHashMap => Order of insertion
         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("India" ,100);
         lhm.put("China", 150);
         lhm.put("USA", 200);

        // 3. TreeMap => oKeys are sorted in ascending order
         TreeMap<String, Integer> tm = new TreeMap<>();
         tm. put("India" , 100);
         tm.put("China", 100);
         tm.put("Us", 50);
 
         System.out.println(hm);
         System.out.println(lhm);
         System.out.println(tm);
    }
}
