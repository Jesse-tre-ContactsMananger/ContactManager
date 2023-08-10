package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactsManager {

    public static void main(String[] args) {


//
//        Load all of the contacts by calling a method that returns a List of Contact objects.
        contactLoad();
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
    public static void contactLoad(){
        String directory = "data";
        String filename = "contacts.txt";
        List<String> contactList;



        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (! Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Path contactsPath = Paths.get("data", "contacts.txt");
        try {
            contactList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < contactList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + contactList.get(i));
            String[] arrOfStr = contactList.get(i).split(" ", 2 );

            Contacts contact = new Contacts(arrOfStr[0],arrOfStr[1]);

        }


        return ;
    }



}
