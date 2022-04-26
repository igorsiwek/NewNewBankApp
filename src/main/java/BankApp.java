import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in our bank");
        System.out.println("How many users you want to add?");
        int qtyClinets = scanner.nextInt();
        Account tableOfClinets [] = new Account[qtyClinets];
        for(int i = 0; i <= tableOfClinets.length; i++){
            tableOfClinets[i] = new Account();
            tableOfClinets[i].createAccount();
            tableOfClinets[i].showAccount();
        }

        Account account = new Account();

        account.createAccount();


        int inputNumber;
        do {
            System.out.println("1. Display all account details");
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
                    System.out.println("Enter account number to deposit: ");
                    String inputAccountNumber = scanner.next();
                    boolean found = false;
                            for(int i=0; i < tableOfClinets.length; i++){
                                found = tableOfClinets[i].search(inputAccountNumber);
                                if(found){
                                    tableOfClinets[i].depositMoney();
                                }
                            }
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




