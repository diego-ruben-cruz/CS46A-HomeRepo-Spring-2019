import java.util.Arrays;
/**
 * Write a description of class ProductTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToyTester
{
    public static void main(String[] args)
    { 
        Toy rocket = new Toy("Duplo Rocket", 18.95, 2);
        System.out.println("Price: " + rocket.getPrice());
        // System.out.println(rocket.increasePrice(10)); // void type will never print anything.
        System.out.println("Name: " + rocket.getDescription());
        System.out.println("Appropriate Age: " + rocket.getAppropriateAge());
        
        Product myProduct = rocket;
        // System.out.println( myProduct.getAppropriateAge()); // won't work because supclass can't access subclass methods.
    }
}