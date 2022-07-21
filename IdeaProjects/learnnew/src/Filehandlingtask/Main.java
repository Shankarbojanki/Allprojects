package Filehandlingtask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

interface FilesandDirectories {
    void files();
}
 class ShowDirectories implements FilesandDirectories {
     String path="/home/sankar/Downloads";
     public void showdir(){
        try {

            File folder = new File(path);

            File[] files1 = folder.listFiles();
            for (File file : files1)
            {
                System.out.println(file.getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     @Override
     public void files() {
     }

 }
 class OpenDirectory implements  FilesandDirectories {
       public void opendir() {
           try{
               File file = new File("/home/sankar/myfile.txt");
               Scanner sc2 = new Scanner(file); //file to be scanned
               while (sc2.hasNextLine())
                   System.out.println(sc2.nextLine());
           }catch (Exception e) {
               System.out.println(e);
           }
       }

     @Override
     public void files() {

     }
 }
 class Createdirectory implements FilesandDirectories {
    public void createdir() {
        String path = "/home/sankar";
        Scanner sc=new Scanner(System.in);
        path=path+File.separator+sc.next();
        File f1=new File(path);
        boolean bool1=f1.mkdirs();
        if (bool1) {
            System.out.println(true);
        }
        else {
            System.out.println("Error");
       }
    }
     @Override
     public void files() {

     }
 }
 class DeletedDirectory implements FilesandDirectories {
     public void deletedir() {
            try {
                File file2=new File("/home/sankar/gggggggggggggg.txt");
                if (file2.delete()){
                    System.out.println("Delete "+file2);
                }else {
                    System.out.println("Error");
                }
            }catch (Exception e) {
                System.out.println(e);
            }
     }
     @Override
     public void files() {

     }
 }
 class Createfiles implements FilesandDirectories {
     public void createfile() {
        Scanner sc1 = new Scanner((System.in));
         String path="/home/sankar";
         String filename=sc1.nextLine();
         String filename1=path+"/"+filename+ ".txt";
         File file =new File(filename1);
         try {
             boolean isfilecreated=file.createNewFile();
             System.out.println(isfilecreated);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
     @Override
     public void files() {

     }
 }

public class Main {
    public static void main(String args[])  {

        String  filescrud ="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("commands");
        System.out.println("sd od cd  cf");
            do {
                filescrud=scanner.nextLine();
                switch (filescrud) {
                    case "sd":
                        ShowDirectories showDirectories=new ShowDirectories();
                        showDirectories.showdir();
                        break;
                    case "cd":
                        Createdirectory createdirectory=new Createdirectory();
                        createdirectory.createdir();
                        break;
                    case "od":
                        OpenDirectory openDirectory=new OpenDirectory();
                        openDirectory.opendir();
                    case "cf":
                        Createfiles createfiles=new Createfiles();
                        createfiles.createfile();
                        break;
                    case "dd":
                        DeletedDirectory deleteddirectory=new DeletedDirectory();
                        deleteddirectory.deletedir();
                }
            }
            while (!filescrud.equals("Quit"));
            }
        }
