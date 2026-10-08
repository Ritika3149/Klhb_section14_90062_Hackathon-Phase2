
import java.util.Scanner;
class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int a, String b, double c)
    {
        accountNumber = a;
        accountHolderName = b;
        balance = c;
    }
    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited amount: " + amount);
    }
    void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn amount: " + amount);
        }
        else
        {
            System.out.println("Low balance");
        }
    }
    double checkBalance()
    {
        return balance;
    }
    void displayAccount()
    {
        System.out.println("Account no: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + checkBalance());
    }
}
public class  BankAccountManagementSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account number: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String b = sc.nextLine();
        System.out.print("Balance: ");
        double c = sc.nextDouble();
        BankAccount obj = new BankAccount(a, b , c);
        System.out.print("Deposit amount: ");
        double x = sc.nextDouble();
        obj.deposit(x);
        System.out.print("Withdraw amount: ");
        double y = sc.nextDouble();
        obj.withdraw(y);
        System.out.println("Account Details");
        obj.displayAccount();
        sc.close();
    }
}