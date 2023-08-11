import java.util.ArrayList;

public class ContactsManager {

    public static void main(String[] args) {

        ArrayList<Contacts> thePeeps = ContactLoad.contactLoad();

        int userChoice = ContactMainMenu.contactMainMenu();

        RunUserChoice.run(userChoice, thePeeps);


    }

}
