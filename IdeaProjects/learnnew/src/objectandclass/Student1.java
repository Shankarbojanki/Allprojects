package objectandclass;
//main outside the class
public class Student1 {
    int id;
    String name;
}

 class TestStudent1{
    public static void main(String args[]){
        Student s1 =new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
 }