package Zooani;

public class Gatekeeper extends Worker {
    String name;
    int age;

    public Gatekeeper(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Gatekeeper name is : " + name + ", Age is: " + age);
    }

}
