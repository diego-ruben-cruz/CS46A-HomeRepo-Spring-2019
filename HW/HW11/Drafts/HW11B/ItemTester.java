/**
 * Tester for the Item class
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        //Note that the answers may not be correct for the draft. compareTo is a stub
        Item thing1 = new Item("shelving unit", 121.75);
        Item thing2 = new Item("kitty litter", 20.95);
        Item thing3 = new Item("Minnetonka Sheepskin Moccasin", 20.95);
        
        Comparable c = thing1; //if this compliles, Comparable is implemented
        
        System.out.println(thing1.compareTo(thing2));
        System.out.println("Expected: 0");
        
        System.out.println(thing3.compareTo(thing1));
        System.out.println("Expected: 0");
        
        System.out.println(thing3.compareTo(thing2));
        System.out.println("Expected: 0");
       
    }
}