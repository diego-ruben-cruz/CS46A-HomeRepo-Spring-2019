/**
 * Tests the Bookstore class.
 *
 * @author Kathleen O'Brien
 */
public class BookstoreTester
{
    public static void main(String[] args)
    {
        Bookstore store = new Bookstore();
        store.add(new Book("Island of the Mad", 15.20)); 
        store.add(new Book("Big Java", 76.95)); 
        store.add(new Book("New York to Dallas", 21.95));  
        store.add(new Book("Swordheart", 19.25));  
        
        //test cheapest
        System.out.println("Cheapest: " + store.cheapest());
        System.out.println("Expected: Island of the Mad");
        
        store.add(new Book("Little Bear", 7.95));    
        System.out.println("Cheapest: " + store.cheapest());
        System.out.println("Expected: Little Bear");
        
        //test swap
        store.swap(0, 4);
        System.out.println(store);
        System.out.println("Expexcted: [Book[title=Little Bear,price=7.95], Book[title=Big Java,price=76.95], Book[title=New York to Dallas,price=21.95], Book[title=Swordheart,price=19.25], Book[title=Island of the Mad,price=15.2]]");
        
        //swap bad index. Should have no effect
        store.swap(-1, 1);
        store.swap(2, -1);
        store.swap(1, 5);
        store.swap(5, 2);
        System.out.println(store);
        System.out.println("Expexcted: [Book[title=Little Bear,price=7.95], Book[title=Big Java,price=76.95], Book[title=New York to Dallas,price=21.95], Book[title=Swordheart,price=19.25], Book[title=Island of the Mad,price=15.2]]");
        
        //test with empty object
        store = new Bookstore();
        store.swap(1, 3);
        System.out.println(store);
        System.out.println("Expected: []");
        
        System.out.println("Cheapest: " + store.cheapest());
        System.out.println("Expected: ");      
    }
}