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
}
