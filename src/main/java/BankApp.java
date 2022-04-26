import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Account account = new Account ();

        account.createAccount();
        System.out.println("Hello in our bank");
        System.out.println("1. Display account details");
        System.out.println("2. Deposit money");
        System.out.println("Select number");

        int inputNumber;
        inputNumber = scanner.nextInt();

        switch (inputNumber){
            case 1:
                account.showAccount();
            case 2:
                account.depositMoney();

        }
    }
}