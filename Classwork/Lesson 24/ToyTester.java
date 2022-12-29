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
        Toy rocket = new Toy("Duplo Rocketship", 19.95, 2);
        System.out.println(rocket.getDescription());
        Product myProduct = rocket;
        // System.out.println( myProduct.getAppropriateAge()); // Doesnt compile due use of sub method for super object.
        Product watch = new Product("Apple Watch", 300.00); 
        Product[] array = new Product[2];
        array[0] = watch;
        array[1] = rocket;
        for(Product p : array)
        {
            System.out.println(p.getDescription());
        }
        Product thing = rocket;
        Toy toy = (Toy) thing;
        System.out.println(toy.getAppropriateAge());
    }
}
