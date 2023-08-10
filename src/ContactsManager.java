//package src;

import java.util.ArrayList;


public class ContactsManager {

    public static void main(String[] args) {


//
//        Load all of the contacts by calling a method that returns a List of Contact objects.
        ArrayList<Contacts> thePeeps = ContactLoad.contactLoad();
        for(Contacts person : thePeeps) {
            System.out.println(person.getName());
        }
//
////        Call a method that shows the user the main menu and returns their choice of action.
//        contactMainMethod();
////        Using the user's choice from the previous step, call a method that performs that action
////        (modifying the contents of the List of Contact objects if applicable).
//        runUserChoice();
////        Keep calling the method from step two until the user chooses to exit.
//
////       Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.
//        fileSave();


    }

}
