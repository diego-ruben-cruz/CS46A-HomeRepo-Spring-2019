
/**
 * Models a bookstore that has an inventory.
 * @DCruzin
 * @28.3.19
 */
import java.util.ArrayList;
public class Bookstore
{
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class BookStore
     */
    public Bookstore()
    {
        books = new ArrayList<Book>();
    }

    /**
     * Adds a book to the list.
     *
     * @param  b    The book to be added.
     */
    public void add(Book b)
    {
        books.add(b);
    }

    @Override
    public String toString()
    {
        return books.toString();
    }
}
