public class AnimalTester
{
    public static void main(String [] args)
    {
        Animal animal = new Animal();
        
        System.out.println("just born : " + animal.getEnergy());
        System.out.println("Expected: 1");
        
        animal.move(1);
        System.out.println("move: " + animal.getEnergy());
        System.out.println("Expected: 0");

        animal.eat(15);
        System.out.println("eat: " + animal.getEnergy());
        System.out.println("Expected: 15");
        
        animal.move(5);
        System.out.println("move: " + animal.getEnergy());
        System.out.println("Expected: 10");

        animal.eat(50);
        System.out.println("eat: " + animal.getEnergy());
        System.out.println("Expected: 60");
        
        animal = new Animal();
        System.out.println("just born : " + animal.getEnergy());
        System.out.println("Expected: 1");
        
        //notice the problem here
        animal.move(3);
        System.out.println("move: " + animal.getEnergy());
        System.out.println("Expected: -2");   
        
        animal.eat(5);
        System.out.println("eat: " + animal.getEnergy());
        System.out.println("Expected: 3");
        
        animal.eat(4);
        System.out.println("eat: " + animal.getEnergy());
        System.out.println("Expected: 7");
        
        animal.eat(5);
        System.out.println("eat: " + animal.getEnergy());
        System.out.println("Expected: 12");

    }
}