package Combine2;





import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Stringoperations {

       static String addstrings(String name1, String name2) {
           return name1+name2;
       }

    void addstrings();
}

   interface Arithmeticint {
        static  int addition (int a,int b) {
            return a+b;
       }
       static  int subtraction (int a,int b) {
           return a-b;
       }
       static  int multiplication (int a,int b) {
           return a*b;
       }
       static  int division (int a,int b) {
           return a/b;
       }
   }

    class Addstrings1 implements Stringoperations {
       ArrayList<Addstrings1> adds=new ArrayList<>();
       String name1;
       String name2;
       public Addstrings1(String name1, String name2) {
           this.name1=name1;
           this.name2=name2;
       }
       public Addstrings1() {
       }
       public String toString() {
           return name1+name2;
       }
       @Override
       public void addstrings() {
           Scanner str=new Scanner(System.in);
           System.out.println("Enter first string");
           String name1=str.nextLine();
           System.out.println("Enter second string");
           String name2=str.nextLine();
           adds.add(new Addstrings1(name1,name2));
           System.out.println(adds.toString());

       }
   }

   class Processint implements Arithmeticint {

   }

public class Main {
    public static void main(String[] args) {
        try {
            Scanner menu= new Scanner(System.in);
            Scanner submenu= new Scanner(System.in);
            int Mainmenu;
            int intmenu;
            System.out.println("Choose your data type");
            System.out.println("1.String");
            System.out.println("2.Int");
            System.out.println("3.Float");
            System.out.println("4.Double");

            Mainmenu= menu.nextInt();
            switch (Mainmenu) {
                case 1:
                    Addstrings1 str =new Addstrings1();
                    str.addstrings();
                    break;
                case 2:
                    System.out.println("1.Addition");
                    System.out.println("2.Subtraction");
                    System.out.println("3.Multiplication");
                    System.out.println("4.Division");
                    intmenu=submenu.nextInt();
                    Processint ints1=new Processint();
                    switch (intmenu) {
                        case 1:

                    }
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
