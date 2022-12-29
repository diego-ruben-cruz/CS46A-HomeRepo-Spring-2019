/**
 * Test Food class
 */
public class FoodRunner
{
    public static void main(String[] args)
    {
        Food cheese = new Food("Cheddar", 3.95, 0);
        Food broccoli = new Food("Broccoli", 5.50, 81.2);
        Food spinach = new Food("Spinach",5.00, 8.4);
        Food orange = new Food("Orange", 2.60, 51);

        //you can always assign a subclass object to a 
        //superclass reference
        Product  potato = new Food("potato", 2.50, 42 );

        //Notice potato can not be in the array. 
        //It is a Product reference
        Food [] foods = {cheese, broccoli, spinach, orange};

        //If thic compiles. MDR is correctly defined
        System.out.println("MDR: " + Food.MDR);

        //be sure the old methods work
        spinach.increasePrice(10);
        System.out.println("Increase price: " + spinach.getPrice());
        spinach.reducePrice(10);
        System.out.println("Reduce price: " + spinach.getPrice());


        for (Food f: foods)
        {
            System.out.printf("%s servings: %.2f%n" ,f.getDescription(), f.howMuch());
        }
    }
}