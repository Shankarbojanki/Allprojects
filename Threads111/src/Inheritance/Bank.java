package Inheritance;

 //overriding
public class Bank {
    int getrateofinterest (){
        return 0;
    }
}
class  Sbi extends Bank {
    int getrateofinterest() {
        return 7;
    }
}
class Icici extends  Bank {
    int getrateofinterest() {
        return 8;
    }
}
class Axis extends Bank{
    int getrateofinterest() {
        return 9;
    }
}
 class Main {
     public static void main(String[] args) {
         Sbi s= new Sbi();
         System.out.println("SBI...."+s.getrateofinterest());
         Icici i=new Icici();
         System.out.println("Icici..."+i.getrateofinterest());
         Axis a=new Axis();
         System.out.println("Axis...." +a.getrateofinterest());
     }
 }
