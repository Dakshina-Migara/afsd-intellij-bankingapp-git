import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creating the arrays
        String[] userName = new String[50];
        int[] accountNumber = new int[50];
        double[] accountOpeningBalance = new double[50];
        String[] accountType = new String[50];
        double[] loanAmount = new double[50];
        String[] loanDescription = new String[50];
        int accountCount = 0;

        while (true) {
            System.out.println("===== WELCOME =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Apply for a Loan");
            System.out.println("5. Loan Details");
            System.out.println("6. Fund Transfer");
            System.out.println("7. Check Balance");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1–8): ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount < 50) {
                        createAccount(userName, accountNumber, accountOpeningBalance, accountType, accountCount);
                        accountCount++;
                    } else {
                        System.out.println("Maximum number of accounts reached!");
                    }
                    break;


                default:
                    System.out.println("Invalid choice! Please enter a number from 1–8.");
            }
        }
    }

    public static void createAccount(String[] userName, int[] accountNumber, double[] accountOpeningBalance, String[] accountType, int accounCount) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name of the User: ");
        userName[accounCount] = scan.next();

        while (true) {
            System.out.print("Enter the User Account Number: ");
            int accountNumber1 = scan.nextInt();

            boolean duplicate = false;
            for (int k = 0; k < accounCount; k++) {
                if (accountNumber[k] == accountNumber1) {
                    System.out.println("Account number already exists. Try a different number.");
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                accountNumber[accounCount] = accountNumber1;
                break;
            }
        }

        System.out.print("Enter Opening Balance (Rs.): ");
        accountOpeningBalance[accounCount] = scan.nextDouble();

        while (true) {
            System.out.print("Enter Account Type (saving/current/wanitha wasana): ");
            accountType[accounCount] = scan.next();

            switch (accountType[accounCount]) {
                case "saving":
                    System.out.println("Saving account created successfully.");
                    break;
                case "current":
                    System.out.println("Current account created successfully.");
                    break;
                case "wanitha":
                case "wanitha wasana":
                    System.out.println("Wanitha Wasana account created successfully.");
                    break;
                default:
                    System.out.println("Invalid account type! Try again.");
                    continue;
            }
            break;
        }
        System.out.println("Account created successfully for " + userName[accounCount]);
    }
}
