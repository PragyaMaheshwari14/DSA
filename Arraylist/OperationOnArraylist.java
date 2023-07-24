import java.util.ArrayList;
public class OperationOnArraylist{
    public static void main(String args[]){
        //ClassName objectName = new ClassName();
        ArrayList<Integer>list = new ArrayList();
        ArrayList<String>list2 = new ArrayList();
        ArrayList<Boolean>list3 = new ArrayList();

        //   Add element ->O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);//O(n)

        System.out.println(list);
        

       // // Get Operation -> O(1)
       // int element = list.get(2);
        // System.out.println(element);

        //// Remove Element(Delete) -> O(n)
        // list.remove(2);
       //  System.out.println(list);

       // // Set Element at index Operation ->O(n)
       // list.set(2,10);
       //System.out.println(list);

        // Contains Element ->O(n)
        //System.out.println(list.contains(1));
        //System.out.println(list.contains(10));

    }
} 