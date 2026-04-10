// ================= ASSIGNMENT 11 =================
// ATM Withdrawal System
import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

// ================= ASSIGNMENT 12 =================
// Division Calculator
import java.util.Scanner;

class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}

// ================= ASSIGNMENT 13 =================
// Student Input System
import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            int check = 10 / age; // for exception demo
            System.out.println("Student age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}

// ================= ASSIGNMENT 14 =================
// File Processing System

class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}

// ================= ASSIGNMENT 15 =================
// Bank Application

class BankApplication {

    static void process() throws Exception {
        throw new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}

// ================= ASSIGNMENT 16 =================
// Music Player (Thread)

class MusicPlayer extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        MusicPlayer t = new MusicPlayer();
        t.start();
    }
}

// ================= ASSIGNMENT 17 =================
// Download Manager (Runnable)

class DownloadManager implements Runnable {

    public void run() {
        System.out.println("Downloading file...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager());
        Thread t2 = new Thread(new DownloadManager());

        t1.start();
        t2.start();
    }
}

// ================= ASSIGNMENT 18 =================
// Railway Reservation System

class RailwayReservation {

    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        Thread t1 = new Thread(() -> obj.bookTicket());
        Thread t2 = new Thread(() -> obj.bookTicket());

        t1.start();
        t2.start();
    }
}

// ================= ASSIGNMENT 19 =================
// Online Shopping System

class OnlineShoppingSystem {

    public static void main(String[] args) {

        Thread payment = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        Thread order = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        payment.start();
        order.start();
    }
}

// ================= ASSIGNMENT 20 =================
// Thread Priority System

class ThreadPrioritySystem extends Thread {

    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadPrioritySystem t1 = new ThreadPrioritySystem();
        ThreadPrioritySystem t2 = new ThreadPrioritySystem();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

// ================= ASSIGNMENT 21 =================
// Producer Consumer System

class Restaurant {

    boolean foodReady = false;

    synchronized void prepare() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serve() throws Exception {
        if (!foodReady)
            wait();

        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> r.prepare()).start();

        new Thread(() -> {
            try {
                r.serve();
            } catch (Exception e) {}
        }).start();
    }
}

// ================= ASSIGNMENT 22 =================
// Banking System

class BankingSystem {

    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("Balance after deduction: " + balance);
        }
    }

    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();

        Thread t1 = new Thread(() -> obj.withdraw(200));
        Thread t2 = new Thread(() -> obj.withdraw(300));

        t1.start();
        t2.start();
    }
}

// ================= ASSIGNMENT 23 =================
// Chat Application

class ChatApplication {

    public static void main(String[] args) {

        Thread send = new Thread(() -> {
            System.out.println("Sending message...");
        });

        Thread receive = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        send.start();
        receive.start();
    }
}