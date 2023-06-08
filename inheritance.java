package inheritance;
public class inheritance extends Student {
    int new_rollno=104;  
    public static void main(String args[]){  
        inheritance p=new inheritance();  
        System.out.println("Student new rollno is:"+p.new_rollno);  
        System.out.println("Student old rollno is:"+p.rollno);  
   }  
}

class Student{
    int rollno=107;
}