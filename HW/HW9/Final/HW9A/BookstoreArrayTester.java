/**
 * Tests the Bookstore class.
 *
 * @author Kathleen O'Brien
 */
public class BookstoreArrayTester
{
    public static void main(String[] args)
    {
        Book[] books = {new Book("Island of the Mad", 15.20),
            new Book("Big Java", 76.95), 
            new Book("New York to Dallas", 21.95),  
            new Book("Swordheart", 19.25)
        };         
        BookstoreArray store = new BookstoreArray(books);
        
        System.out.printf("Arerage: %.2f%n", store.average());
        System.out.println("Expected: 33.34");                
        System.out.println("Cheapest: " + store.cheapest());
        System.out.println("Expected: Island of the Mad");
        
        Book[] books2 = {new Book("Island of the Mad", 15.20),
            new Book("Big Java", 76.95), 
            new Book("New York to Dallas", 21.95),  
            new Book("Swordheart", 19.25),
            new Book("Little Bear", 7.95)
        };          
        store = new BookstoreArray(books2);
        
        System.out.println("Arerage: " + store.average());
        System.out.println("Expected: 28.26");
          
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
        store = new BookstoreArray(new Book[0]);
        store.swap(1, 3);
        System.out.println(store);
        System.out.println("Expected: []");
        
        System.out.println("Cheapest: " + store.cheapest());
        System.out.println("Expected: ");     
        System.out.println("Average: " + store.average());
        System.out.println("Expected: 0.0");  
    }
}