import java.util.*;
public class TypesOfSet {
   public static void main(String args[]) {
    // 1. Hash Set => unordered
    HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bengaluru");

        System.out.println(hs);
    // 2. Linked HashSet =>  order of insert
    LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
     // 3. Tree Set => Sorted in ascending order
     TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);

   }
}
