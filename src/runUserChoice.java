import java.util.ArrayList;


public class runUserChoice {



    public static void run(int userChoice, ArrayList<Contacts> thePeeps) {

//        1. View contacts.
//        2. Add a new contact.
//        3. Search a contact by name.
//        4. Delete an existing contact.
//        5. Exit.

        if (userChoice == 1) {
            showContacts(thePeeps);
        } else if (userChoice == 2) {
            addContact(thePeeps);
        } else if (userChoice == 3) {
            getUserWantedContact(thePeeps);
        } else if (userChoice == 4) {
            removeUserWantedContact(thePeeps);
        } else if (5) {
            closeApp();
        }

        ContactMainMenu.contactMainMenu();

    }

}
