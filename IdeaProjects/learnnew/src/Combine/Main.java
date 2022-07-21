package Combine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

interface  Datatype {
     void datatype();
}
interface Intoperations {
    int adds(int a,int b);
    int subtract(int a,int b);
    int multiple(int a,int b);
    int division(int a,int b);

}
interface Floatoperations {
    float adds( float a, float b);
    float subtract( float a, float b);
    float multiple( float a, float b);
    float division( float a, float b);

}
interface Doubleoperations {
    double adds( double a, double b);
    double subtract( double a, double b);
    double multiple( double a, double b);
    double division( double a, double b);

}

 class  Addstrings implements Datatype {
    ArrayList<Addstrings> adds=new ArrayList<>();
    String name1;
    String name2;
    public Addstrings(String name1, String name2) {
        this.name1=name1;
        this.name2=name2;
    }
    public Addstrings() {
    }
    public String toString() {
        return name1+name2;
  }
    @Override
    public void datatype() {
           Scanner str=new Scanner(System.in);
           System.out.println("Enter first string");
           String name1=str.nextLine();
           System.out.println("Enter second string");
           String name2=str.nextLine();
           adds.add(new Addstrings(name1,name2));
           System.out.println(adds.toString());
    }
}
class Processint implements  Intoperations{
    ArrayList<Processint> ints=new ArrayList<>();
          int a,b;
    public Processint(int a, int b) {
        this.a= a;
        this.b= b;
    }

    public Processint() {

    }

    public int addition() {
        Scanner ints1=new Scanner(System.in);
        System.out.println("enter first number");
        int a= ints1.nextInt();
        System.out.println("enter second number");
        int b= ints1.nextInt();
        ints.add(new Processint(a,b));
        System.out.println(adds(a,b));
        return a;
    }
    public void subtraction() {
        Scanner ints1=new Scanner(System.in);
        System.out.println("enter first number");
        int a= ints1.nextInt();
        System.out.println("enter second number");
        int b= ints1.nextInt();
        ints.add(new Processint(a,b));
        System.out.println(subtract(a,b));

    }
    public void multiplication() {
        Scanner ints1=new Scanner(System.in);
        System.out.println("enter first number");
        int a= ints1.nextInt();
        System.out.println("enter second number");
        int b= ints1.nextInt();
        ints.add(new Processint(a,b));
        System.out.println(multiple(a,b));

    }
    public void divisions() {
        Scanner ints1=new Scanner(System.in);
        System.out.println("enter first number");
        int a= ints1.nextInt();
        System.out.println("enter second number");
        int b= ints1.nextInt();
        ints.add(new Processint(a,b));
        System.out.println(division(a,b));

    }

    public int adds(int a,int b) {
       return a+b;
    }
    public int subtract(int a,int b) {
        return a-b;
    }
    public int multiple(int a,int b) {
        return a*b;
    }
    public int division(int a,int b) {
        return a/b;
    }
}
class Processfloat implements  Floatoperations{
    ArrayList<Processfloat> floats=new ArrayList<>();
    float a;
    float b;
    public Processfloat(float a, float b) {
        this.a= a;
        this.b= b;
    }

    public Processfloat() {

    }

    public float addition() {
        Scanner ints1=new Scanner(System.in);
        System.out.println("enter first number");
        float a= ints1.nextInt();
        System.out.println("enter second number");
        float b= ints1.nextInt();
        floats.add(new Processfloat(a,b));
        System.out.println(adds(a,b));
        return a;
    }
    public void subtraction() {
        Scanner floats1=new Scanner(System.in);
        System.out.println("enter first number");
        float a= floats1.nextInt();
        System.out.println("enter second number");
        float b= floats1.nextInt();
        floats.add(new Processfloat(a,b));
        System.out.println(subtract(a,b));

    }
    public void multiplication() {
        Scanner floats1=new Scanner(System.in);
        System.out.println("enter first number");
        float a= floats1.nextInt();
        System.out.println("enter second number");
        float b= floats1.nextInt();
        floats.add(new Processfloat(a,b));
        System.out.println(multiple(a,b));

    }
    public void divisions() {
        Scanner floats1=new Scanner(System.in);
        System.out.println("enter first number");
        float a= floats1.nextInt();
        System.out.println("enter second number");
        float b= floats1.nextInt();
        floats.add(new Processfloat(a,b));
        System.out.println(division(a,b));

    }

    public float adds(float a, float b) {
        return a+b;
    }
    public float subtract(float a, float b) {
        return a-b;
    }
    public float multiple(float a, float b) {
        return a*b;
    }
    public float division(float a, float b) {
        return a/b;
    }

}
class Processdouble implements  Doubleoperations{
    ArrayList<Processdouble> doubles=new ArrayList<>();
   double a;
    double b;
    public Processdouble(double a, double b) {
        this.a= a;
        this.b= b;
    }

    public Processdouble() {

    }

    public double addition() {
        Scanner doubles1=new Scanner(System.in);
        System.out.println("enter first number");
        double a=  doubles1.nextInt();
        System.out.println("enter second number");
        double b=  doubles1.nextInt();
        doubles.add(new Processdouble(a,b));
        System.out.println(adds(a,b));
        return a;
    }
    public void subtraction() {
        Scanner  doubles1=new Scanner(System.in);
        System.out.println("enter first number");
        double a=  doubles1.nextInt();
        System.out.println("enter second number");
        double b=  doubles1.nextInt();
        doubles.add(new Processdouble(a,b));
        System.out.println(subtract(a,b));

    }
    public void multiplication() {
        Scanner  doubles1=new Scanner(System.in);
        System.out.println("enter first number");
        float a=  doubles1.nextInt();
        System.out.println("enter second number");
        float b=  doubles1.nextInt();
        doubles.add(new Processdouble(a,b));
        System.out.println(multiple(a,b));

    }
    public void divisions() {
        Scanner  doubles1=new Scanner(System.in);
        System.out.println("enter first number");
        float a=  doubles1.nextInt();
        System.out.println("enter second number");
        float b=  doubles1.nextInt();
        doubles.add(new Processdouble(a,b));
        System.out.println(division(a,b));

    }

    public double adds(double a, double b) {
        return a+b;
    }
    public double subtract(double a, double b) {
        return a-b;
    }
    public double multiple(double a, double b) {
        return a*b;
    }
    public double division(double a, double b) {
        return a/b;
    }

}
public class Main {
    public static void main(String[] args) {

        try {
            Scanner menu= new Scanner(System.in);
            Scanner submenu= new Scanner(System.in);
            int Mainmenu;
            int intmenu;
            int floatmenu;
            int doublemenu;
            System.out.println("Choose your data type");
            System.out.println("1.String");
            System.out.println("2.Int");
            System.out.println("3.Float");
            System.out.println("4.Double");
            System.out.println("5.Exit");

            Mainmenu= menu.nextInt();
            do {
                switch (Mainmenu) {
                    case 1:
                        Addstrings str =new Addstrings();
                        str.datatype();
                        break;
                    case 2:
                        System.out.println("1.Addition");
                        System.out.println("2.Subtraction");
                        System.out.println("3.Multiplication");
                        System.out.println("4.Division");
                        intmenu=submenu.nextInt();
                        Processint ints=new Processint();
                           switch (intmenu) {
                               case 1:
                                   ints.addition();
                                   break;
                               case 2:
                                   ints.subtraction();
                                   break;
                               case 3:
                                   ints. multiplication();
                                   break;
                               case 4:
                                   ints.divisions();
                                   break;
                           }

                    case 3:
                        System.out.println("1.Addition");
                        System.out.println("2.Subtraction");
                        System.out.println("3.Multiplication");
                        System.out.println("4.Division");
                        floatmenu=submenu.nextInt();
                        Processfloat floats=new  Processfloat();
                        switch (floatmenu) {
                            case 1:
                                floats.addition();
                                break;
                            case 2:
                                floats.subtraction();
                                break;
                            case 3:
                                floats. multiplication();
                                break;
                            case 4:
                                floats.divisions();
                                break;
                        }
                    case 4:
                        System.out.println("1.Addition");
                        System.out.println("2.Subtraction");
                        System.out.println("3.Multiplication");
                        System.out.println("4.Division");
                        doublemenu=submenu.nextInt();
                        Processdouble doubles=new  Processdouble();
                        switch (doublemenu) {
                            case 1:
                                doubles.addition();
                                break;
                            case 2:
                                doubles.subtraction();
                                break;
                            case 3:
                                doubles. multiplication();
                                break;
                            case 4:
                                doubles.divisions();
                                break;
                        }
                }
            } while (Mainmenu!=5);

        }

        catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}


