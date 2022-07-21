package objectandclass;

public class Worker {
    String name;
    int age;
    int joiningyear;

    public Worker(String name, int age, int joiningyear) {
        this.name = name;
        this.age = age;
        this.joiningyear = joiningyear;
    }

    public Worker() {
    }

    public String toString() {
        return ("Worker name is:" + name + ",age is:" + age + ", joining year:" + joiningyear);
    }
}
