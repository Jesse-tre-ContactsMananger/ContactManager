import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class RunUserChoice {
    static Scanner userSC = new Scanner(System.in);


    public static void run(int userChoice, ArrayList<Contacts> thePeeps) {

        if (userChoice == 1) {
            showContacts(thePeeps);
        } else if (userChoice == 2) {
            addContact(thePeeps);

        } else if (userChoice == 3) {
            getUserWantedContact(thePeeps);

        } else if (userChoice == 4) {
            removeUserWantedContact(thePeeps);

        } else if (userChoice == 5) {
            killApp(thePeeps);
        }


    }

    public static void showContacts(ArrayList<Contacts> thepeeps) {

        System.out.println("Name | Phone number");
        System.out.println("---------------");
        for (int i = 0; i < thepeeps.size(); i += 1) {
            System.out.println(thepeeps.get(i).getName() + " | " + thepeeps.get(i).getPhoneNumber());
        }
        System.out.println("\n\nMAIN MENU\n\n");
        int userChoice = ContactMainMenu.contactMainMenu();
        RunUserChoice.run(userChoice, thepeeps);
    }

    public static void addContact(ArrayList<Contacts> thepeeps) {

//        System.out.println("Name | Phone number");
        System.out.println("ENTER USERNAME AND PHONE NUMBER");
        String nameAndPhone = userSC.nextLine();
        String[] arrOfStr = nameAndPhone.split(" ", 2);

        Contacts contact = new Contacts(arrOfStr[0], arrOfStr[1]);
        thepeeps.add(contact);


        System.out.println("Contact Added");

        System.out.println("\n\nMAIN MENU\n\n");
        int userChoice = ContactMainMenu.contactMainMenu();
        RunUserChoice.run(userChoice, thepeeps);
    }

    public static void getUserWantedContact(ArrayList<Contacts> thepeeps) {
        System.out.println("ENTER USERNAME");
        String name = userSC.nextLine();
        for (int i = 0; i < thepeeps.size(); i += 1) {
            if (name.equals(thepeeps.get(i).getName())) {
                System.out.println("Name | Phone number");
                System.out.println("---------------");
                System.out.println(thepeeps.get(i).getName() + " | " + thepeeps.get(i).getPhoneNumber());

            }
        }
        System.out.println("\n\nMAIN MENU\n\n");
        int userChoice = ContactMainMenu.contactMainMenu();
        RunUserChoice.run(userChoice, thepeeps);

    }

    public static void removeUserWantedContact(ArrayList<Contacts> thepeeps) {
        System.out.println("REMOVE USER");
        String name = userSC.nextLine();
        for (int i = 0; i < thepeeps.size(); i += 1) {
            if (name.equals(thepeeps.get(i).getName())) {
                thepeeps.remove(i);
            }
        }
        System.out.println("USER REMOVED");
        System.out.println("\n\nMAIN MENU\n\n");
        int userChoice = ContactMainMenu.contactMainMenu();
        RunUserChoice.run(userChoice, thepeeps);
    }

    public static void killApp(ArrayList<Contacts> thepeeps) {
        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (!Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/contacts.txt"));
            for (Contacts obj : thepeeps) {
                writer.write(String.format("%s %s", obj.getName(), obj.getPhoneNumber()));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        userSC.close();
        System.exit(0);
    }
}

