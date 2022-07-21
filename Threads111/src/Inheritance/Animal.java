package Inheritance;

public class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal{
   void sleep() {
       System.out.println("sleeping");
   }

}
class Testanimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
    }
}
