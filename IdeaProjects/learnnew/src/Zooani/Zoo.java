package Zooani;

import java.util.*;

public class Zoo {
}


class Worker extends Humans  {
    String name;
    int age;
    public Worker (String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Worker() {

    }
    public  String toString(){
        return ("Worker name is : " + name + ", Age is: " + age );
    }

}

class Humans{}
