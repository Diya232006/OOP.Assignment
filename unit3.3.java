import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two student names
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        // Case-sensitive comparison
        if (name1.equals(name2)) {
            System.out.println("Names are SAME (Case-Sensitive)");
        } else {
            System.out.println("Names are DIFFERENT (Case-Sensitive)");
        }

        // Case-insensitive comparison
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are SAME (Case-Insensitive)");
        } else {
            System.out.println("Names are DIFFERENT (Case-Insensitive)");
        }

        sc.close();
    }
}