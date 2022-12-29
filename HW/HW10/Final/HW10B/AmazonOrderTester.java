import java.util.ArrayList;
/**
 * Tester for AmazonOrder
 */
public class AmazonOrderTester
{
    public static void main(String[] args)
    {
        AmazonOrder myOrder = new AmazonOrder();
        
        //test empty list
        System.out.printf("%.2f%n",myOrder.average());
        System.out.println("Expected: 0.00");
        
        //add some items
        myOrder.add(new Item("shelving unit", 121.75));
        myOrder.add(new Item("kitty litter", 16.95));
        myOrder.add(new Item("Minnetonka Sheepskin Moccasin", 58.25));
        myOrder.add(new Item("men's cordouroy ", 30.00));
        myOrder.add(new Item("women's sun shirt", 30.0));
        
        System.out.println(myOrder.order());
        System.out.println("Expected: [shelving unit, kitty litter, Minnetonka Sheepskin Moccasin, men's cordouroy , women's sun shirt]");
        
        System.out.printf("%.2f%n",myOrder.average());
        System.out.println("Expected: 51.39");
         
        //add another item
        myOrder.add(new Item("Amazon gift card", 25.00));
        
        System.out.println(myOrder.order());
        System.out.println("Expected: [shelving unit, kitty litter, Minnetonka Sheepskin Moccasin, men's cordouroy , women's sun shirt, Amazon gift card]");
        
        System.out.printf("%.2f%n",myOrder.average());
        System.out.println("Expected: 46.99");
        
        //test same contents    
        AmazonOrder other = new AmazonOrder();
        
        System.out.println(myOrder.sameContents(other));
        System.out.println("Expected: false");
        System.out.println(other.sameContents(myOrder));
        System.out.println("Expected: false");
        
        other.add(new Item("shelving unit", 121.75));
        other.add(new Item("kitty litter", 16.95));
        other.add(new Item("Minnetonka Sheepskin Moccasin", 58.25));
        
        System.out.println(myOrder.sameContents(other));
        System.out.println("Expected: false");
        System.out.println(other.sameContents(myOrder));
        System.out.println("Expected: false");
        
        other.add(new Item("men's cordouroy ", 30.00));
        other.add(new Item("women's sun shirt", 30.0));
        other.add(new Item("Amazon gift card", 25.00));
        
        System.out.println(myOrder.sameContents(other));
        System.out.println("Expected: true");
        System.out.println(other.sameContents(myOrder));
        System.out.println("Expected: true");
        
        //same length but one different
        other = new AmazonOrder();
        myOrder.add(new Item("shelving unit", 121.75));
        myOrder.add(new Item("kitty litter", 16.95));
        myOrder.add(new Item("Minnetonka Sheepskin Moccasin", 58.25));
        myOrder.add(new Item("men's cordouroy ", 30.00));
        myOrder.add(new Item("Wooden Dragon Castle", 30.0));
        
        System.out.println(myOrder.sameContents(other));
        System.out.println("Expected: false");
        System.out.println(other.sameContents(myOrder));
        System.out.println("Expected: false");      
    }
}