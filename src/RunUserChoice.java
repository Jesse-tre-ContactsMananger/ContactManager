package src;

import java.util.ArrayList;


public class RunUserChoice {



    public static void run(int userChoice, ArrayList<Contacts> thePeeps) {

//        1. View contacts.
//        2. Add a new contact.
//        3. Search a contact by name.
//        4. Delete an existing contact.
//        5. Exit.


        if (userChoice == 1) {
            showContacts(thePeeps);
        }
//        } else if (userChoice == 2) {
//            addContact(thePeeps);
//        } else if (userChoice == 3) {
//            getUserWantedContact(thePeeps);
//        } else if (userChoice == 4) {
//            removeUserWantedContact(thePeeps);
//        } else if (5) {
//            closeApp();
//        }

//        ContactMainMenu.contactMainMenu();

    }
    public static void showContacts(ArrayList<Contacts> thepeeps){

        System.out.println("Name | Phone number");
        System.out.println("---------------");
        for (int i = 0; i < thepeeps.size(); i += 1) {
            System.out.println(thepeeps.get(i).getName() + " | " + thepeeps.get(i).getPhoneNumber());
        }
        System.out.println("\n\nMAIN MENU\n\n");
        int userChoice =  ContactMainMenu.contactMainMenu();
        RunUserChoice.run(userChoice, thepeeps);
    }



}
