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
            
        }
    }
}
