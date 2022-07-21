package Nareshfilehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

 class FileTerminal {
     static Path path= Path.of("/home/sankar/Downloads");
     static File file;
     public static void getBack() throws IOException{
        try{
            path = path.getParent();
        }
        catch (Exception e){
            System.out.println(e);
        }
     }
     public static boolean setcurrentDirectory () {
         boolean result=false;
         File file;
         file=new File(String.valueOf(path)).getAbsoluteFile();
         if (file.exists()||file.mkdirs()) {
             result=(System.setProperty("user.dir",file.getAbsolutePath())!=null);
         }
           return result;
     }
     public static PrintWriter openOutputFile()
     {
         PrintWriter output = null;

         try
         {
             output = new PrintWriter(new File(String.valueOf(file)).getAbsoluteFile());
         }
         catch (Exception exception) {}

         return output;
     }
    public void showdir(){
        try {

            File folder = new File(String.valueOf(path));

            File[] file = folder.listFiles();
            for (File files : file)
            {
                System.out.println(files.getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void opendir() {
        try{
            File file = new File(String.valueOf(path));
            Scanner sc2 = new Scanner(file);
            while (sc2.hasNextLine())
                System.out.println(sc2.nextLine());
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createdir() {
        Scanner sc=new Scanner(System.in);
        path= Path.of(path + File.separator + sc.next());
        File file=new File(String.valueOf(path));
        boolean bool1=file.mkdirs();
        if (bool1) {
            System.out.println(true);
        }
        else {
            System.out.println("Error");
        }
    }

    public void deletedir() {
        try {
            File file=new File(String.valueOf(path));
            if (file.delete()){
                System.out.println("Delete "+file);
            }else {
                System.out.println("Error");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createfile() {
        Scanner sc1 = new Scanner((System.in));
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

    }


public class Main {
    public static void main(String[] args) throws IOException {
        String filescrud = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("commands");
        System.out.println("sd cd od cd  cf");
        FileTerminal fileterminal = new FileTerminal();
        do {
            switch (filescrud) {
                case "sd":
                    fileterminal.showdir();
                    break;
                case "cd":
                    fileterminal.createdir();
                    break;
                case "od":
                    fileterminal.opendir();
                case "cf":
                    fileterminal.createfile();
                    break;
                case "dd":
                    fileterminal.deletedir();
                    break;
                case "ccd":
                    fileterminal.setcurrentDirectory();
                   fileterminal.openOutputFile();
                    break;
                case "gb":
                    fileterminal.getBack();
            }

        } while (!filescrud.equals("Quit"));
    }
}
