package Inheritance;

public class Animal1 {
    void sleep() {
        System.out.println("sleeping........");
    }

    public void jump() {
        System.out.println("as an animal i can jump");
    }

}

class Cat extends Animal1 {
    public void jump() {
        System.out.println("can jump");
    }
}

class Bruno extends  Cat {
    public void jump() {
        System.out.println("i can jump sooooo high");
    }
}

class Dog1 extends Animal1 {
    void  eating(){
        System.out.println("eating..........");
    }

}
class Puppy extends Dog1{
    void  calm(){
        System.out.println("eating..........");
    }
}
class  Testanimal1 {
    public static void main(String[] args) {
//        Dog1 dog1=new Dog1();
//        Dog1 puppy=new Puppy();
//
//        dog1.sleeping();
//        dog1.eating();
//        puppy.calm();


        Animal1 cat = new Cat();
        Animal1 bruno = new Bruno();
        Animal1 dog1=new Dog1();
        bruno.jump();
        cat.jump();
        cat.sleep();
        dog1.sleep();


    }

}
