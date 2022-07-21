package Nareshfilehandling;
import java.io.*;
import java.util.Scanner;

public class FilecopyCLI {
    public static void main(String[] args)
     throws FileNotFoundException,IOException {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String srcFile=scn.nextLine();

        System.out.println("Enter destnation file:");
        String destfile =scn.nextLine();

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destfile);



        int data;
        while ((data=fis.read())!=-1){
            fos.write(data);

        }
        System.out.println("copied");
    }

}
