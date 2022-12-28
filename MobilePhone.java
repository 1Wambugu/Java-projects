import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> phoneBook = new ArrayList<Contacts>();
    private static String name;
    private static String phoneNumber;

    public void printContact() { //printing the contact
        if (phoneBook.size() == 0) {
            System.out.println("Your phone book is empty");
        }
        else {
            System.out.println("Your current phone book has the following entries.");
            for (int i = 0; i < phoneBook.size(); i++) {
                System.out.println(i + 1 + ". Name:" + phoneBook.get(i).getName() + " PH# " +
                         phoneBook.get(i).getPhoneNumber());
            }
        }
    }

    public void addContact() {
        System.out.println("Enter the name that you would like to add");
        name = scanner.nextLine();
        System.out.println("Enter the phone number for this contact");
        phoneNumber = scanner.nextLine();
        Contacts contacts = new Contacts(name,phoneNumber);
        phoneBook.add(contacts);
    }

    public void removeContact() {
        System.out.println("Enter the contact that you would like to remove");
        name = scanner.nextLine();
        for (int i=0; i<phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(name)) {
                phoneBook.remove(i);
            }
        }
    }
    public void updateContact() {
        System.out.println("Enter the item you want to modify");
        name = scanner.nextLine();
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(name)) {
                System.out.println("Contact found. Enter the updated contact name.");
                name = scanner.nextLine();
                System.out.println("Enter this new contact's new phone number");
                phoneNumber = scanner.nextLine();
                Contacts contacts = new Contacts(name, phoneNumber);
                phoneBook.set(i, contacts);
            }
        }
    }


}