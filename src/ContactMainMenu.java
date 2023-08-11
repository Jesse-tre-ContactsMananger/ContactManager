package src;

import java.util.Scanner;

public class ContactMainMenu {

    public static int contactMainMenu() {
        int userInput = 0;
        Scanner sc = new Scanner(System.in);

        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5) {
            String menu = """
                    1. View contacts.
                    2. Add a new contact.
                    3. Search a contact by name.
                    4. Delete an existing contact.
                    5. Exit.
                    Enter an option (1, 2, 3, 4 or 5):
                    """;
            System.out.println(menu);
            userInput = sc.nextInt();
        }


        return userInput;
    }


}
