package Practceall;

public class Methodobject {
    int rollnumber;
    String name;

    void inserdata(int rollnumber,String name) {
        this.rollnumber=rollnumber;
        this.name=name;

    }
    void displaydata() {
        System.out.println(rollnumber+ " " + name);
    }
}
class Student1{
    public static void main(String[] args) {
        Methodobject s1= new Methodobject();
        Methodobject s2 = new Methodobject();

        s1.inserdata(1234,"shankar");
        s2.inserdata(5678,"appalanaidu");

        s1.displaydata();
        s2.displaydata();
    }
}
