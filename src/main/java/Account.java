import java.util.Scanner;
public class Account {
    private String AccountName;
    private String AccountSurname;
    private String AccountNumber;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public String getAccountName(){
        return AccountName;
    }
    public void setAccountName(String AccountName){
        this.AccountName = AccountName;
    }
    public String getAccountSurname() {
        return AccountSurname;
    }
    public void setAccountSurname(String AccountSurname) {
        this.AccountSurname = AccountSurname;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void createAccount() {
        System.out.println("Enter your name");
        AccountName = scanner.next();
        System.out.println("Enter your surname");
        AccountSurname = scanner.next();
        System.out.println("Enter your account number");
        AccountNumber = scanner.next();
        System.out.println("Enter your balance");
        balance = scanner.nextLong();

    }

    public void showAccount() {
        System.out.println("Name: " + AccountName);
        System.out.println("Surname: " + AccountSurname);
        System.out.println("Account number: " + AccountNumber);
        System.out.println("Balance: " + balance);
    }

    public void depositMoney() {
        System.out.println("How much do you want to deposit?");
        long amount = scanner.nextLong();
        balance = balance + amount;
        System.out.println("Now your balance is: " + balance);
    }

    public void withdrawal() {
        System.out.println("How much do you want to withdraw?");
        long amount = scanner.nextLong();

        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Now your balance is: " + balance);}
        else{
                System.out.println("Your balance is less than " + amount);
            }

    }

    public boolean search(String inputAccountNumber) {
        if(AccountNumber.equals(inputAccountNumber)){
            return true;

        }
        else{
            return false;
        }
    }
}
