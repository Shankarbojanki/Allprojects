package Nareshfilehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisDemo2 {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("/home/sankar/IdeaProjects/learnnew/src/Nareshfilehandling/abc.txt");


        int data ;
       while ((data = fis.read())!=-1){
           System.out.println("data: "+data);
           System.out.println("data:"+data+"->"+(char)data);
        }
        fis.close();
    }
}
