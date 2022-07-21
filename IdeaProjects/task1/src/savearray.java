import java.util.Scanner;

public class savearray {
    static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {

        showMainMenu();
    }

    public static void showMainMenu(){
        System.out.println("--- MAIN MENU ---");
        System.out.println("1. Create Pet");
        System.out.println("2. Update Pet");
        System.out.println("3. Delete Pet");
        System.out.println("4. Exit");

        System.out.print("Enter your Choice : ");

        int option = scan.nextInt();

        switch(option){
            case 1:
                createPet();
                break;
            case 2:
                updatePet();
                break;
            case 3:
                deletePet();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option!");
                showMainMenu();
        }

    }
    public static void createPet(){

        Scanner myObj = new Scanner(System.in);
        //String newPet = myObj.nextLine();
        System.out.print("Enter Pet Name: ");
        String newPet = myObj.nextLine();
        String newPetArray[] = newPet.split(" ");
        // newPet = scan.nextLine();
        System.out.println("Pet Name is " + newPet);

        // use for READ
        for (int i = 0; i < newPetArray.length; i++){
            System.out.println(newPetArray[i]);
        }
        showMainMenu();
    }
    public static void updatePet() {

    }

    public static void deletePet() {

    }
}
