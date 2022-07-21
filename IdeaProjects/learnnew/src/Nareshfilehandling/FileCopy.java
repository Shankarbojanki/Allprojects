package Nareshfilehandling;
import java.io.*;

public class FileCopy {
    public static void main(String[] args)
        throws FileNotFoundException,IOException {
        FileInputStream fis = new FileInputStream("/home/sankar/IdeaProjects/learnnew/src/Nareshfilehandling/abc.txt");
        FileOutputStream fos = new FileOutputStream("something.txt");
        int data;
        while ((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("file copied");
        fis.close();
        fos.close();
    }
}
