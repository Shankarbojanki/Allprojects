package Nareshfilehandling;
import java.io.*;
public class FOSDemo {
    public static void main(String[] args)
      throws FileNotFoundException,IOException {
        FileOutputStream fos = new FileOutputStream("something.txt");

        fos.write(50);

        System.out.println("data is saved");

        fos.close();
    }
}
