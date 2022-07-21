package Practceall;

public class Controlflow {
    public static void main(String[] args) {
        int age= 102;

        if (age>18){
            System.out.println("you are major");
        }

        if (age<18){
            System.out.println("teenage");
        } else {
            System.out.println("adult");
        }
             //      if else if
        if (age<=14) {
            System.out.println("child");
        } else if (age<=18) {
            System.out.println("teenage");
        } else if (age>18 &&age<35) {
            System.out.println("adult");
        } else if (age>35 && age<60) {
            System.out.println("sr adult");
        } else if (age>=60 && age<=100) {
            System.out.println("old");
        }
        else {
            System.out.println("RIP");
        }
            //   leaf yr
        int year=2001;

        if (year%4==0&& year%100 !=0 ||year%400==0) {
            System.out.println("leaf yr");
        }
        else {
            System.out.println("normal yr");
        }




          int number=19;

          String output=(number%2==0)? "even":"odd";

          System.out.println(output);


          int age1=2;
          int weight=50;

          if (age1>18) {
              if (weight>45) {
                  System.out.println("eligible to donate blood");
              }
              else {
                  System.out.println("not eligible");
              }
          }
          else {
              System.out.println("age must be 18+");
          }

    }
}
