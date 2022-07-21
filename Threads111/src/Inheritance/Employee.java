package Inheritance;

public class Employee {
    int salary=45000;
}
class Programmer extends Employee {
    float bonus=3000f;
    public static void main(String[] args) {
        Programmer programmer= new Programmer();

        System.out.println("programmer salary : " +programmer.salary +",  programmer Bonus : " +programmer.bonus);
    }
}