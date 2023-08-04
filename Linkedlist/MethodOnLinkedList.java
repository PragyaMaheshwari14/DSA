public class MethodOnLinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //Methods 

    public void addFirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 -> newNode  next = head
        newNode.next = head; //link

        // step 3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node (data);
        size++;
         if(head == null){
            head = tail = newNode;
            return;
         }
         tail.next = newNode;
         tail = newNode;
     }
     
    public void print(){
         if(head == null){
             System.out.println("linkedlist is empty");
             return  ;
         }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
     }    
      // Add in the Middle of LinkedList
       public void add(int idx , int data){
          if(idx == 0){
              addFirst(data);
              return;
           }
          Node newNode = new Node(data);
          size++;
           Node temp = head;
           int i = 0;

           while(i < idx-1){
               temp = temp.next;
               i++;
           }

           //i = idx-1; temp-> prev
           newNode.next = temp.next;
           temp.next = newNode;
       }

    public int removeFirst(){
            if(size == 0){
                 System.out.println("LL is empty");
                 return Integer.MIN_VALUE;
            } else if(size == 1){
                 int val = head.data;
                 head = tail = null;
                 size = 0;
                 return val;
            }
           int val = head.data;
           head = head.next;
           size--;
           return val ;
        }

    public int removeLast(){
            if(size == 0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1){
                int val = head.data;
                head = tail = null ;
                size = 0;
                return val;
            }
            //  prev : i = size - 2
            Node prev = head ;
            for(int i=0; i<size-2; i++ ){
                prev = prev.next;
            }

            int val = prev.next.data; // tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

    public int itrSearch(int key){ // iteration search->O(n)
            Node temp = head;
             int i = 0;

             while(temp != null){
                if(temp.data == key){ // key found
                   return i;
                }
                 temp = temp.next;;
                 i++;
             }

             //key not found
             return -1;
        }

    public int helper(Node head , int key){
            // base case
            if(head == null){
                return -1;
            }
             
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next , key);//recursivre call;
            if(idx == -1){
                 return -1;
            }

            return idx+1;
        }


    public int recSearch(int key){  //recursive search->O(n) == Space complexity & time Complexity
             return helper(head , key);

        }
        
        public void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev  =  curr;
                curr  =  next;
            }
            head = prev;
        }

    public void deleteNthfromEnd(int n){
            // calculate size
            int size = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                size++;
            }

            if(n == size) {
                head = head.next; // remove first operation
                return;
            }

            // size -n
            int i = 1;
            int iToFind = size-n;
            Node prev = head;
            while(i < iToFind){
               prev = prev.next;
               i++;
            }

            prev.next = prev.next.next;
            return;
        }

        //Slow-Faast Approach
    public Node findMid(Node head){// helper(checkPalindrome)
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow;  // slow is my MidNode
        }

  
    public boolean checkPalindrome(){
            if(head == null || head.next == null){
                return true;
            }
            //step1 - find mid
            Node midNode = findMid(head);

           //step2 - reverse 2nd half
           Node prev = null;
           Node curr = midNode;
           Node next;
           while(curr != null){
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
           }

           Node right = prev; // right half head
           Node left = head;

           // step3 - check left half &  right half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }

            return true;
        }

    private Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                head = head.next; //+1
                fast = fast.next.next; //+2
            }
            return slow; //mid node
        }

    private Node merge(Node head1 , Node head2){
            Node  mergedLL = new Node(-1);
            Node temp = mergedLL;

            while(head1 != null  && head2 != null){
                 if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                 } else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                 }
            }

            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while(head2 != null){
                 temp.next = head2;
                 head2 = head2.next;
                 temp = temp.next;
            }

            return mergedLL.next;
        }

    public Node mergeSort(Node head){
             if(head == null || head.next == null){
                return head;
             }
            //find mid
            Node mid = getMid(head);
            // left & right half Merge Sort
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            //merge
            return merge(newLeft , newRight);
        }

    public void zigZag(){
          // find mid
          Node slow = head;
          Node fast = head.next;
          while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
          }
         Node mid = slow;

          // reverse 2nd half
         Node curr = mid.next;
         mid.next = null;
         Node prev = null;
         Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

         Node left = head;
         Node right = prev;
         Node nextL , nextR;

        // alternate merge(zig azg merge)
          while(left!= null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL; // update
            right = nextR;
        }

    }
        
    public static void main(String args[]){

         //    MethodOnLinkedList ll = new MethodOnLinkedList();   
         //    ll.addFirst(2);
         //    ll.addFirst(1);
         //    ll.addLast(4);
         //    ll.addLast(5);
         //    ll.add(2,3);
         //    ll.print();  //1->2->3->4->5
         //System.out.println(ll.size);

         //   ll.removeFirst();
         //   ll.print();
         //   System.out.println(ll.size);

         //    ll.removeLast();
         //    ll.print();
         //    System.out.println(ll.size);

         // System.out.println(ll.itrSearch(3));
         // System.out.println(ll.itrSearch(10));

         //  System.out.println(ll.recSearch(3));
         //  System.out.println(ll.recSearch(10));

         // ll.reverse();
         // ll.print();
     
         //    ll.deleteNthfromEnd(3);
         //    ll.print();

         // MethodOnLinkedList ll =  new MethodOnLinkedList();
         // ll.addLast(1);
         // ll.addLast(2);
         // ll.addLast(2);
         // ll.addLast(1);

         // ll.print();  //1->2->2->1 
         // System.out.println(ll.checkPalindrome());


         //  MethodOnLinkedList ll = new MethodOnLinkedList();
         //  ll.addFirst(1);
         //  ll.addFirst(2);
         //  ll.addFirst(3);
         //  ll.addFirst(4);
         //  ll.addFirst(5);
         //  //5->4->3->2->1

         //  ll.print();
         //  ll.head = ll.mergeSort(ll.head);
         //  ll.print();

         MethodOnLinkedList ll = new MethodOnLinkedList();
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          //1->2->3->4->5

         ll.print();
         ll.zigZag();
         ll.print();
    } 
}
