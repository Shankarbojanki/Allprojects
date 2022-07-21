package ExceptionHandling;


import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int i,j=1,k=0;

        Scanner br =new Scanner(new InputStreamReader(System.in));
        i=8;

        try{
            System.out.println("Enter a number");
            j=Integer.parseInt(br.nextLine());
            k=i/j;
            System.out.println("output is... "+k);
        } catch (ArithmeticException e) {
            System.out.println("can't divided by zero ..."+e);
        }
        catch (Exception e) {
            System.out.println("Unknown exception... "+e);
        }
        finally {
            System.out.println("finally BYE");
        }
    }
}
