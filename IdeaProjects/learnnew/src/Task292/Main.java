package Task292;
import java.util.Scanner;

interface OS {
    void running();
}

class Windows implements OS {
    public void running() {
        System.out.println("Running on windows \n Hii Windows");
    }
}
class Mac implements OS {
    public void running() {
        System.out.println("Running on mac \n Hii Mac");
    }
}
class Linux implements OS {
    public void running () {
        System.out.println("Running on Linux \n Hii Linux");;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your type of windows");
        String os="";
        os = scan.nextLine();
        OS selectedOS = null;
        switch (os) {
            case "windows" :
                selectedOS = new Windows();
                break;
            case "mac":
                selectedOS = new Mac();
                break;
            case "linux":
                selectedOS = new Linux();
                break;
            default:
                System.out.println("Enter your os properly");
        }
        if (selectedOS!= null) selectedOS.running();
    }
}
