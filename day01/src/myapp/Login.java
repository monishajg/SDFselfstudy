package myapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Write a simple login program in Java that 1) prompts the user for a username and password,
and then 2) verifies the input against a predefined username and password.
The program will continue to prompt the user for input until the correct username and password are entered,
or until the user enters "q" to quit the program: */

public class Login {
  // Define an enumeration for the user types
  public enum UserType {
    ADMIN,
    MODERATOR,
    USER
  }

  public static void main(String[] args) {
    // Define a map to store the users and their corresponding user types
    Map<String, UserType> users = new HashMap<>();
    users.put("admin", UserType.ADMIN);
    users.put("moderator", UserType.MODERATOR);
    users.put("user", UserType.USER);

    // Create a Scanner to read input from the command line
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for a username and password
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    // Verify the input against the correct username and password
    while (!users.containsKey(username) || !password.equals("password")) {
      // If the input is incorrect, display an error message
      System.out.println("Incorrect username or password. Try again or enter 'q' to quit.");

      // Prompt the user for a username and password again
      System.out.print("Enter username: ");
      username = scanner.nextLine();
      System.out.print("Enter password: ");
      password = scanner.nextLine();

      // If the user enters "q", exit the loop and terminate the program
      if (username.equals("q")) {
        break;
      }
    }

    // If the input is correct, display the user's type
    if (users.containsKey(username) && password.equals("password")) {
      System.out.println("Login successful! You are a " + users.get(username) + ".");
    }
  }
}