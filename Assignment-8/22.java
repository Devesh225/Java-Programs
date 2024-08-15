// Write a Java Program to Validate an Email Address Format.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }
        scanner.close();
    }
}
