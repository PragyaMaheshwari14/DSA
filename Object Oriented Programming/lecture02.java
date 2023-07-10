public class lecture02 {
    public static void main(String args[]){
       Student s1 =  new Student();
       Student s2 = new Student("pragya");
       Student s3 = new Student(304);
    }
    
}

 class Student{
    String name;
    int roll;
 
    //  non parameterized constructor 

    Student(){
        System.out.println("Constructor is called ....");
    }
  
    // parameterized constructor 

    Student(String name){
      this.name = name ;  
      System.out.println(name);
    }
    
    Student(int roll){
        this.roll = roll;
        System.out.print(roll);
    }


 }