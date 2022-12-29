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
        System.out.println(store);
        System.out.println("Expected: [Book[title=Island of the Mad,price=15.2], Book[title=Big Java,price=76.95], Book[title=New York to Dallas,price=21.95], Book[title=Swordheart,price=19.25]]");
        store.add(new Book("Little Bear", 7.95));  
        System.out.println(store);
        System.out.println("Expected: [Book[title=Island of the Mad,price=15.2], Book[title=Big Java,price=76.95], Book[title=New York to Dallas,price=21.95], Book[title=Swordheart,price=19.25], Book[title=Little Bear,price=7.95]]");
    }
}