import java.util.ArrayList;
import java.util.Arrays;
/**
 * Manages a collection of Book objects
 *
 */
public class BookstoreArray
{
    private Book[] books;
    /**
     * Constructor for objects of class Class
     * 
     * @param   list    The list of books to keep track of.
     * 
     */
    public BookstoreArray(Book[] list)
    {
        books = list;
    }

    /**
     * Computes the average price of the book inventory
     *
     * @return  the computed average.
     */
    public double average()
    {
        double sum = 0;
        int count = 0;
        double average = 0;
        if (books.length > 0)
        {
            for(Book p : books)
            {
                sum = sum + p.getPrice();
                count++; 
            }
            average = sum/count;
            return average;
        }
        else
        {
            return average;
        }
    }
    
    @Override
    public String toString()
    {
        return Arrays.toString(books);
    }
}