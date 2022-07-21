package Zooani;

public class Elephant extends Lion {
    String name;
    int age;
    int yearOfJoin;

    public Elephant(String name, int age, int yearOfJoin) {
        super();
        this.name = name;
        this.age = age;
        this.yearOfJoin = yearOfJoin;
    }

    public String toString() {
        return ("Elephant name is : " + name + ", Age is: " + age + ", and Year of join : " + yearOfJoin);
    }

}
