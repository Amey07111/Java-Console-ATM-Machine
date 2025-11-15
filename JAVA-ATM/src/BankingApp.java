

import java.util.Scanner;

    public class BankingApp {


        static double balance = 5000.0; // Account balance
        static int pin = 1234; // Secret PIN

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Welcome to Java Bank ATM ===");
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            // 1. Security Check (If-Else)
            if (enteredPin != pin) {
                System.out.println("❌ Wrong PIN! Access Denied.");
                return; // if enterpin is not equal to the pin then program will be stop
            }

            // 2. Infinite Loop
            while (true) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                // 3. Menu Logic (Switch Case)
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depAmount = sc.nextDouble();
                        deposit(depAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withAmount = sc.nextDouble();
                        withdraw(withAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using Java Bank. Bye! 👋");
                        System.exit(0); // Program band karne ka command
                        break;
                    default:
                        System.out.println("Invalid Option! Try again.");
                }
            }
        }

        // --- Methods (Logic Alag Rakha Hai) ---

        public static void checkBalance() {
            System.out.println("💰 Current Balance: ₹" + balance);
        }

        public static void deposit(double amount) {
            balance = balance + amount;
            System.out.println("✅ ₹" + amount + " deposited successfully!");
            checkBalance();
        }

        public static void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("❌ Insufficient Balance! ");
            } else {
                balance = balance - amount;
                System.out.println("✅ ₹" + amount + " withdrawn successfully!");
                checkBalance();
            }
        }
    }

