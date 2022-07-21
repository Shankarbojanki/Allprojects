package Nareshfilehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
public class FileCopyDynamic {
    public static void main(String[] args)
    throws FileNotFoundException, IOException {


        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

//        FileInputStream fis = new FileInputStream("/home/sankar/IdeaProjects/learnnew/p.txt");
//        FileOutputStream fos = new FileOutputStream("/home/sankar/IdeaProjects/learnnew/q.txt");

        int data;
        while ((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("file copied");
    }
}