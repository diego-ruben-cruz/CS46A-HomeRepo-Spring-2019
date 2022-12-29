/**
 * Tester for the Item class
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        Item thing = new Item("shelving unit", 121.75);
        System.out.println(thing.getName() + " " + thing.getPrice());
        System.out.println("Expected: shelving unit 121.75");
        
        thing = new Item("kitty litter", 16.95);
        System.out.println(thing.getName() + " " + thing.getPrice());
        System.out.println("Expected: kitty litter 16.95");
        
        thing.setName("Minnetonka Sheepskin Moccasin");
        thing.setPrice( 58.25);
        System.out.println(thing.getName() + " " + thing.getPrice());
        System.out.println("Expected: Minnetonka Sheepskin Moccasin 58.25");
       
    }
}