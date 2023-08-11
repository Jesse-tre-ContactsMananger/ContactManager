import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactLoad {

    public static ArrayList<Contacts> contactLoad() {
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

        if (!Files.exists(dataFile)) {
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

        ArrayList<Contacts> theContactObs = new ArrayList<>();
        for (int i = 0; i < contactList.size(); i += 1) {
            String[] arrOfStr = contactList.get(i).split(" ", 2);

            Contacts contact = new Contacts(arrOfStr[0], arrOfStr[1]);
            theContactObs.add(contact);

        }

        return theContactObs;
    }
}
