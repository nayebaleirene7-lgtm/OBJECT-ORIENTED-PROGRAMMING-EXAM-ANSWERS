import java.util.Scanner;

public class Question5_StudentMarksApp {

    // Simple parallel arrays (size chosen by user at runtime)
    private static String[] names;
    private static String[] regNumbers;
    private static String[] subjects;
    private static String[] classes;
    private static double[] marks;
    private static int count = 0;          // how many students are currently registered
    private static final String USERNAME = "teacher";
    private static final String PASSWORD = "pass123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Login
        if (!login(input)) {
            System.out.println("Login failed. Program terminated.");
            return;
        }

        // 2. Register students
        registerStudents(input);

        // 3. Record marks
        recordMarks(input);

        // 4. Display everything
        displayAll();

        input.close();
    }

    // ----- Method 1: Login -----
    public static boolean login(Scanner input) {
        System.out.println("===== TEACHER LOGIN =====");
        System.out.print("Username: ");
        String user = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login successful. Welcome!\n");
            return true;
        }
        return false;
    }

    // ----- Method 2: Register students -----
    public static void registerStudents(Scanner input) {
        System.out.print("How many students do you want to register? ");
        int n = input.nextInt();
        input.nextLine();                 // clear the leftover newline

        names       = new String[n];
        regNumbers  = new String[n];
        subjects    = new String[n];
        classes     = new String[n];
        marks       = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Name: ");
            names[i] = input.nextLine();
            System.out.print("Registration number: ");
            regNumbers[i] = input.nextLine();
            System.out.print("Subject: ");
            subjects[i] = input.nextLine();
            System.out.print("Class: ");
            classes[i] = input.nextLine();
            marks[i] = -1;                // mark not yet recorded
            count++;
        }
        System.out.println("\n" + count + " student(s) registered successfully.\n");
    }

    // ----- Method 3: Record marks -----
    public static void recordMarks(Scanner input) {
        System.out.println("===== RECORD MARKS =====");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark for " + names[i] + " (" + regNumbers[i] + "): ");
            double m = input.nextDouble();
            // simple validation
            while (m < 0 || m > 100) {
                System.out.print("Invalid mark. Enter a value between 0 and 100: ");
                m = input.nextDouble();
            }
            marks[i] = m;
        }
        System.out.println("\nAll marks recorded.\n");
    }

    // ----- Method 4: Display all registered students and marks -----
    public static void displayAll() {
        System.out.println("===== ALL REGISTERED STUDENTS =====");
        System.out.printf("%-5s %-20s %-15s %-15s %-10s %-8s%n",
                "No.", "Name", "Reg. No.", "Subject", "Class", "Mark");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-5d %-20s %-15s %-15s %-10s %-8.1f%n",
                    (i + 1), names[i], regNumbers[i], subjects[i], classes[i], marks[i]);
        }
    }
}
