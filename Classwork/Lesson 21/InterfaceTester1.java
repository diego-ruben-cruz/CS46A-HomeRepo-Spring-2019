
public class InterfaceTester1
{
    public static void main(String[] args)
    {
        System.out.println("Testing BankAccount");
        BankAccount account = new BankAccount(1000.0, "abc123");
        BankAccount account1 = new BankAccount(20000.0, "xyz789");
        Qualifiable qualifiedAccount = account1; //If this does not 
        //compile, it means you did not specify "implements Qualifiable"
        //on the class header
        
        System.out.println(account.qualifies());
        System.out.println("Expected: false");
        System.out.println(account1.qualifies());
        System.out.println("Expected: true");
    }
}