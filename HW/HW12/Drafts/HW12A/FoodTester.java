/**
 * Test Food class
 */
public class FoodTester
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
       
       //If thic compiles. MDR is correctly defined
       System.out.println("MDR: " + Food.MDR);
       System.out.println("Expected: 65");
       
       //be sure the old methods work
       spinach.increasePrice(10);
       System.out.println(spinach.getPrice());
       System.out.println("Expected: 5.5");
       spinach.reducePrice(10);
       System.out.println(spinach.getPrice());
       System.out.println("Expected: 4.95");
              
       System.out.println("vitaminC in cheese: " + cheese.getVitaminC());
       System.out.println("Expected: 0.0");
       System.out.println("vitaminC in spinach: " + spinach.getVitaminC());
       System.out.println("Expected: 8.4");
       
       //answers not necessarily correct
       //the method is a stub
       System.out.println("Servings: " + cheese.howMuch());
       System.out.println("Expected: 0.0");
       System.out.println("Servings?: " + spinach.howMuch());
       System.out.println("Expected: 0.0");
       
       //has not been overriden
       System.out.println(spinach.getDescription());
       System.out.println("Expected: Spinach");
       System.out.println(broccoli.getDescription());
       System.out.println("Expected: Broccoli");
   }
}