package ExceptionHandling;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
      int num;
      Scanner number =new Scanner(new InputStreamReader(System.in)) ;
      try{
          System.out.println("Enter a number");
          num=Integer.parseInt(number.nextLine());
          if (num == 1) {
              System.out.println(num);
          }
          try {
              if (num==2) {
                  System.out.println(num);
              }
          }
          catch (Exception e) {
              System.out.println(e);
          }
      }
      catch (Exception e) {
          System.out.println("wrong input");
      }
      finally {
          System.out.println("Bye");
      }
























//        int i,j,k;
//        int a[] = new int[4];
//        i=8;
//        j=2;
//
//        try{
//            k=i/j;
//            for (int c=0;c<=4;c++) {
//                a[c] = c+1;
//            }
//            for (int example:a) {
//                System.out.println(example);
//            }
//            System.out.println(k);
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
    }
}
