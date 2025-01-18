package Core_Features;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountCreation {
    //create hash map
    private static final Map<String, String> users = new HashMap<>(); 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                //check if username exists
                if (users.containsKey(username)) {
                    System.out.println("Username already exists.");
                } else {
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    // Store user credentials in the HashMap
                    users.put(username, password);
                    System.out.println("Account created successfully!");
                }
            } else if (choice == 2) {
                //else leave the system
                System.out.println("Exiting...");
                System.exit(0);

                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
