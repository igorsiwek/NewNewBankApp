import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in our bank");
        Account account = new Account();

        account.createAccount();


        int inputNumber;
        do {
            System.out.println("1. Display account details");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.println("Select number");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.depositMoney();
                    break;
                case 3:
                    account.withdrawal();
                    break;
                case 4:
                    System.out.println("see you");
            }

        }

        while (inputNumber != 4);

    }
}




