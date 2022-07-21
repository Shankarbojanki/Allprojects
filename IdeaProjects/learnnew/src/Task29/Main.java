package Task29;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Laptop {
  OS operatingSystem;
  Keyboard keyboard;
  public void installOS(OS os) {
      this.operatingSystem = os;
  }
  public void connectKeyboard(Keyboard keyboard) {
      this.keyboard = keyboard;
      this.keyboard.setOS(this.operatingSystem);
  }

  public void listenKeyChanges() {
      int key;
      do {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter key to operate");
          key = scanner.nextInt();
          this.keyboard.keyPress(key);
      } while (key != 0);
  }

}

class Mac implements  OS {
    @Override
    public Set<Integer> getEnabledKeys() {
        return new HashSet<Integer>(List.of(1,2,3));
    }
}

class Windows implements  OS {
    @Override
    public Set<Integer> getEnabledKeys() {
        return new HashSet<Integer>(List.of(4,5,6));
    }
}

class Linux implements  OS {
    @Override
    public Set<Integer> getEnabledKeys() {
        return new HashSet<Integer>(List.of(7,8,9));
    }
}

interface OS {
    public Set<Integer> getEnabledKeys();
}

class Keyboard {
    OS os;
    public void setOS(OS os) {
        this.os = os;
    }

    public void keyPress (int i) {
        if(os.getEnabledKeys().contains(i)) {
            System.out.println("can print " +i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("select your os: ");
        String selectedOS = scanner.nextLine();
        OS os = null;
        switch (selectedOS) {
            case "mac" :
                os = new Mac();
                break;
            case "linux":
                os = new Linux();
                break;
            case "windows":
                os = new Windows();
                break;
        }
        if (os == null) return;
        laptop.installOS(os);
        laptop.connectKeyboard(new Keyboard());
        laptop.listenKeyChanges();
    }
}
