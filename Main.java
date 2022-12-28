import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args){
        boolean runMenu = false;

        while (runMenu != true) {
            System.out.println("What would you like to do?");
            System.out.println("\t Option 1: Add a contact");
            System.out.println("\t Option 2: Update a contact");
            System.out.println("\t Option 3: Remove a contact");
            System.out.println("\t Option 4: Print current phone book");
            System.out.println("\t Option 5: Exit");
        

            int userOption = scanner.nextInt();
            switch(userOption){

            case 1:
           mobilePhone.addContact();
            break;
            
        case 2: 
             mobilePhone.updateContact();
            break;
        case 3:
            mobilePhone.removeContact();
            break;
        case 4:
            mobilePhone.printContact();
            break;
        case 5:
            runMenu = true;

        
            }
        }
    }
}