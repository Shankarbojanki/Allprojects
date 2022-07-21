package Nareshfilehandling;
import java.io.*;
public class FISDemo {
    public static void main(String[] args)
        throws FileNotFoundException, IOException{
           FileInputStream fis = new FileInputStream("/home/sankar/IdeaProjects/learnnew/src/Nareshfilehandling/abc.txt");


        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();
        System.out.println("data1: "+data1+"-" +(char)data1);
        System.out.println("data2: "+data1+"-" +(char)data2);
        System.out.println("data3: "+data1+"-" +(char)data3);
           fis.close();
        }
}
