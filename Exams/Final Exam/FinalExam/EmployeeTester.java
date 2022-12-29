import java.util.Arrays;
public class EmployeeTester
{
    public static void main (String[] args)
    {
        Employee anna = new Employee("Anna Chen", 35000.0);
        Employee kob = new Employee("Kathleen OBrien", 44000.0);
        Employee bob = new Employee("Bob Nguyen", 44000.0);
        Employee cay = new Employee("Cay Horstmann", 64000.0);

        System.out.println(anna.numberOfCharactersInName());
        System.out.println("Expected: 9");
        System.out.println(cay.numberOfCharactersInName());
        System.out.println("Expected: 13");
        
        System.out.println(bob.vowelCount());
        System.out.println("Expected: 3");
        System.out.println(kob.vowelCount());
        System.out.println("Expected: 6");
        
        System.out.println(anna.getLetter());
        System.out.println("Expected: A");
        System.out.println(bob.getLetter());
        System.out.println("Expected: o");
        System.out.println(cay.getLetter());
        System.out.println("Expected: H");
    }
}