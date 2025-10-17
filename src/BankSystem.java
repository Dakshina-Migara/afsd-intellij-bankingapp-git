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

                case 2:
                    double moneydeposit = moneyDeposit(accountNumber, accountOpeningBalance, accountType);
                    break;

                case 3:
                    double moneyWithdraw = moneyWithdraw(accountNumber, accountOpeningBalance, accountType);
                    break;

                case 4:
                    double applyLoan = applyLoan(accountNumber, loanAmount, accountOpeningBalance, loanDescription);
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

    public static double moneyDeposit(int[] accountNumber, double[] accountOpeningBalance, String[] accountType) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber1 = scan.nextInt();

        for (int i = 0; i < accountNumber.length; i++) {
            if (accountNumber[i] == accountNumber1) {
                System.out.print("Enter the deposit amount: Rs. ");
                double depositAmount = scan.nextDouble();
                accountOpeningBalance[i] += depositAmount;
                System.out.println("Deposit successful! your " + accountType[i] + " Account New balance: Rs. " + accountOpeningBalance[i]);
                return accountOpeningBalance[i];
            }
        }
        System.out.println("Invalid account number!");
        return 0;
    }

    public static double moneyWithdraw(int[] accountNumber, double[] accountOpeningBalance, String[] accountType) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber2 = scan.nextInt();

        for (int i = 0; i < accountNumber.length; i++) {
            if (accountNumber[i] == accountNumber2) {
                System.out.print("Enter the Withdraw amount: Rs. ");
                double withdrawAmount = scan.nextDouble();

                if (withdrawAmount > accountOpeningBalance[i]) {
                    System.out.println("Insufficient balance!");
                    return accountOpeningBalance[i];
                }

                accountOpeningBalance[i] -= withdrawAmount;
                System.out.println("Withdrawal successful! your " + accountType[i] + " Account New balance: Rs. " + accountOpeningBalance[i]);
                return accountOpeningBalance[i];
            }
        }
        System.out.println("Invalid account number!");
        return 0;
    }

    public static double applyLoan(int[] accountNumber, double[] loanAmount, double[] accountOpeningBalance, String[] loanDescription) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber3 = scan.nextInt();

        for (int i = 0; i < accountNumber.length; i++) {
            if (accountNumber[i] == accountNumber3) {
                System.out.print("Purpose of the loan: ");
                loanDescription[i] = scan.next();

                System.out.print("Loan amount needed: Rs. ");
                loanAmount[i] = scan.nextDouble();

                accountOpeningBalance[i] += loanAmount[i];
                System.out.println("Loan approved! New balance: Rs. " + accountOpeningBalance[i]);
                return loanAmount[i];
            }
        }
        System.out.println("Account not found!");
        return 0;
    }
}
