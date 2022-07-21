package ExceptionHandling;

import java.io.InputStreamReader;
import java.util.Scanner;

public class UserDefined {
    public static void main(String[] args) {
        int num ;
        System.out.println("Enter number");
        Scanner number =new Scanner(new InputStreamReader(System.in)) ;
       try {
           num= Integer.parseInt(number.nextLine());
           switch (num) {
               case 1:
                   System.out.println("1");
                   break;
               case 2:
                   System.out.println("2");
                   break;
               case 0:
                   System.out.println("Bye");
                   break;
               default:
                   System.out.println("Wrong input");
           }
       }
       catch (Exception e) {
           System.out.println(e);
       }



















//        int num ;
//        int number;
//        System.out.println("Enter number");
//        Scanner number =new Scanner(new InputStreamReader(System.in)) ;
//        num=Integer.parseInt(number.nextLine());
//
//            switch (number) {
//                case 1:
//
//
//
//            }


        }
    }



























//        int i=5;
//        try {
//            if (i<10) {
//              throw   new MyException("Error..........") ;
//            }
//        }
//        catch (Exception e ) {
//            System.out.println(e);
//        }
//    }
//}
// class MyException extends Exception {
//     public MyException (String msg) {
//         super(msg);
//
