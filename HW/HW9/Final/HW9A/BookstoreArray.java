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

    /**
     * Swaps two book objects in the array.
     *
     * @param  index1  The first index to reference.
     * 
     * @param  index2  The second index to reference.
     */
    public void swap(int index1, int index2)
    {
        if (index1 > 0 && index1 < books.length && index2 > 0 && index2 < books.length )
        {
            Book temp = books[index1];
            books[index1] = books[index2];
            books[index2] = temp;
        }
    }

    /**
     * Obtains the title of the cheapest book of the set.
     *
     * @return  returns the title or an empty string.
     */
    public String cheapest()
    {
        if (books.length > 0)
        {
            Book cheapest = books[0];
            for(Book n : books)
            {
                if (cheapest.getPrice() > n.getPrice())
                {
                    cheapest = n; 
                }
            }
            return cheapest.getTitle();
        }
        else
        {
            return "";
        }
    }

    @Override
    public String toString()
    {
        return Arrays.toString(books);
    }
}