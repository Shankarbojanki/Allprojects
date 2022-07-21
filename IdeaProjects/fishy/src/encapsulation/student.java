package encapsulation;


public class student {

    private String name;
    private int age;
    private String address;
    //constructor
    public student(String name,
                   int age,
                   String address){
        this.name =name;
        this.age =age;
        this.address = address;
    }
     //set
     public void setName(String name) {
        this.name =name;
     }

     public void setAge(int age) {
        this.age = age;
     }

     public void setAddress(String address){
        this.address =address;
     }
     //get
   public String getName(){
        return name;
   }




}
