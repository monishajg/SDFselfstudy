package myapp;

import java.util.Scanner;

/*Write a simple login program in Java that 1) prompts the user for a username and password,
and then 2) verifies the input against a predefined username and password.
The program will continue to prompt the user for input until the correct username and password are entered,
or until the user enters "q" to quit the program: */

public class Login {
    public static void main(String[] args) {
      // Predefined username and password
      String username = "admin";
      String password = "password";
  
      // Create a Scanner object for reading input
      Scanner scanner = new Scanner(System.in);
  
      while (true) {
        // Prompt the user for a username
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
  
        // If the user enters "q", exit the program
        if (inputUsername.equals("q")) {
          break;
        }
  
        // Prompt the user for a password
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
  
        // If the user enters "q", exit the program
        if (inputPassword.equals("q")) {
          break;
        }
  
        // Check if the input matches the predefined username and password
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
          System.out.println("Login successful!");
          break;
        } else {
          System.out.println("Invalid username or password. Try again.");
        }
      }
    }// main
  }// class