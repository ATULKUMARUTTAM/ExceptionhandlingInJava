import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("Hello and welcome!");

        customer obj  =  new customer(15011, "ABC", 3000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Customer Info "+obj);
        try {
            System.out.println("Enter amount to deposit ");
            int amt =  sc.nextInt();
            obj.deposit(amt);
            System.out.println("Customer Info "+obj);
        }
        catch(BalanceCheck e)
        {
            System.out.println(e);
        }

        try {
            System.out.println("Enter amount to Withdraw ");
            int amt =  sc.nextInt();
            obj.withdraw(amt);
            System.out.println("Customer Info "+obj);
        }
        catch(insufficientbalance e)
        {
            System.out.println(e);
        }
    }
}