Assignment 5
import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        int index = file.lastIndexOf(".");

        String extension = file.substring(index + 1);

        System.out.println("File Extension: " + extension);

        sc.close();
    }
}

Assignment 6
import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);

        int count = st.countTokens();

        System.out.println("Total Words: " + count);

        sc.close();
    }
}

Assignment 7
class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");

        // Insert text
        sb.insert(5, " Java");

        // Reverse string
        sb.reverse();

        System.out.println("Final String: " + sb);
    }
}

Assignment 8
class TextProcessingBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // Append text
        sb.append(" Programming");

        System.out.println("Modified String: " + sb);
    }
}

/*
Difference:
StringBuffer -> Thread-safe (slow)
StringBuilder -> Not thread-safe (fast)
*/

Assignment 9
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Rahul");

        System.out.println(s);
    }
}

Assignment 10
import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int len = password.length();

        String masked = "";

        for (int i = 0; i < len - 2; i++) {
            masked += "*";
        }

        masked += password.substring(len - 2);

        System.out.println("Masked Password: " + masked);

        sc.close();
    }
}