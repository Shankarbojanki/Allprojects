package Zooani;

public class Lion extends Animals {
    String name;
    int age;
    int yearOfJoin;

    public Lion(String name, int age, int yearOfJoin) {
        this.name = name;
        this.age = age;
        this.yearOfJoin = yearOfJoin;
    }

    public Lion() {

    }

    public String toString() {
        return ("lion name is " + name +
                ", age is: " + age + ", and year of join is : " + yearOfJoin);
    }
}
