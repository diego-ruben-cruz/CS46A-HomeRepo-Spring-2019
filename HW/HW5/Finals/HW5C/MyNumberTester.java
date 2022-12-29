/**
 * Tester for MyNumber
 *
 */
public class MyNumberTester
{
    public static void main(String[] args)
    {
        MyNumber number = new MyNumber(2500);
        System.out.println(number.getNumber());
        System.out.println("Expected: 2500");
        
        number = new MyNumber(-10);
        System.out.println(number.getNumber());
        System.out.println("Expected: 10");
        
        number = new MyNumber(1000000);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: too big");
        
        number = new MyNumber(999);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: 999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 3");
        
        number = new MyNumber (1000);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: 1,000");
        System.out.println(number.digitCount());
        System.out.println("Expected: 4");
        
        number.setNumber(9999);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: 9,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 4");
        
        number.setNumber(99999);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: 99,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 5");
        
        number.setNumber(999999);
        System.out.println(number.formatWithCommas());
        System.out.println("Expected: 999,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 6");
        
    }
}