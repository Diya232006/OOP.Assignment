import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept username from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove leading and trailing spaces
        username = username.trim();

        // Convert username to lowercase
        username = username.toLowerCase();

        // Display cleaned username
        System.out.println("Cleaned Username: " + username);

        sc.close();
    }
}