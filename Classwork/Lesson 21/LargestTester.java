public class LargestTester
{
    public static void main(String[] args)
    {
        Country[] centralAmericanCountries =
            {
                new Country("Belize", 22966),
                new Country("Costa Rica", 51100),
                new Country("El Salvador", 21041),
                new Country("Guatemala", 108889),
                new Country("Honduras", 112492),
                new Country("Nicaragua", 130373),
                new Country("Panama", 75417)
            };
            
        System.out.println("Country with largest area");
        Country largest = (Country) Data.largest(centralAmericanCountries); 
        System.out.println(largest.getName());
        System.out.println();

        System.out.println("Student with highest gpa");
        Student[] students = 
            {
                new Student("Amy", 3.4),
                new Student("Thong", 2.9),
                new Student("Perdeep", 3.6),
                new Student("Mica", 3.56)

            };
            
        Student bestGPA = (Student) Data.largest(students);
        System.out.println(bestGPA.getName());
        System.out.println();
        
        
        Measurable[] accounts = 
        {
            new BankAccount(1000.0, "abc123"),
            new BankAccount(2000.0, "xyz789"),
            new BankAccount(1500.0, "pqr456"),
        };
        
        BankAccount largestBankAccount = (BankAccount) Data.largest(accounts);
        System.out.println("Bank account with highest balance:");
        System.out.println(largestBankAccount.getAccountId());
    }
}
