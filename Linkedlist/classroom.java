import java.util.LinkedList;

public class classroom {
     public static void main(String args[]){
        //create -objects (int, float(not use) )-> Integer , Float
       LinkedList<Integer>ll = new LinkedList();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->->1->2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        //1
     }
}
