package may4task;

public class adder2 {
   static int add(int a, int b){return a+b;}
   static int add(double a, double b){return (int)(a+b); }
}

  class Testoverloading2{
   static void main (String[]args){
      System.out.println(adder2.add(11,11));
      System.out.println(adder2.add(45.7,32.8));

   }
 }