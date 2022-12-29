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
        
        Book[] books2 = {new Book("Island of the Mad", 15.20),
            new Book("Big Java", 76.95), 
            new Book("New York to Dallas", 21.95),  
            new Book("Swordheart", 19.25),
            new Book("Little Bear", 7.95)
        };          
        store = new BookstoreArray(books2);
        
        System.out.println("Arerage: " + store.average());
        System.out.println("Expected: 28.26");
      
        //test with empty object
        store = new BookstoreArray(new Book[0]);
    
        System.out.println("Average: " + store.average());
        System.out.println("Expected: 0.0");  
    }
}