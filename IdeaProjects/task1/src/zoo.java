import java.util.Scanner;
import java.util.Arrays;


public class zoo {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String lion[] =    {};
        String arr[] =new String[3];


            System.out.println("Lions in our zoo are: ");
            System.out.println(Arrays.toString(lion));

        System.out.println("Enter  lion details add to zoo-name,joining year,color");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("total lions in zoo are(including newly added)");
        for(int i=0; i<arr.length; i++){

        }
        System.out.println(Arrays.toString(lion)+Arrays.toString(arr));
    }

}
