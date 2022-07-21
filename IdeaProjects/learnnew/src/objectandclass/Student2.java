package objectandclass;
//initial through reference
public class Student2 {
    int id;
    String name;
}
   class TestStudent2{
       public static void main (String args[]){
           Student s1=new Student();
           s1.id=101;
           s1.name="Shankar";
           System.out.println(s1.id+" "+s1.name);
       }
   }