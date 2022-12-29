import java.util.Arrays;
/**
 * Tests the  TV class.
 * 
 */
public class TVRunner
{
    public static void main(String[] args)
    {
        TV[] inventory = new TV[6];
        inventory[1] = new TV("Sony", 55.0);
        inventory[0] = new TV("Westinghouse", 43.0);
        inventory[2] = new TV("LG Electronics", 55.0);
        inventory[4] = new TV("Panasonic", 60);
        inventory[5] = new TV("Toshiba", 60.0);
        inventory[3] = new TV("Sharp", 55);

        System.out.println(inventory[1].toString());
        
        for (TV c : inventory)
        {
            System.out.println(c.getBrand() + " " + c.getSize());
        }
    }
}