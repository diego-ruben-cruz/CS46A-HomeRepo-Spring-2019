    import java.util.ArrayList;
/**
 * Models a bookstore that has an inventory.
 * @DCruzin
 * @28.3.19
 */
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

    /**
     * swaps two books from the list.
     *
     * @param  index1    The first index to reference.
     * @param  index2    The second index to reference.
     */
    public void swap(int index1, int index2)
    {
        if (index1 > 0 && index2 > 0 && index1 < books.size() && index2 < books.size())
        {
            Book temp1 = books.get(index1);
            Book temp2 = books.get(index2);
            books.set(index1, temp2);
            books.set(index2, temp1);
        }
    }

    /**
     * Obtains the cheapest book from the list.
     *
     * @return  the cheapest book in the list.
     */
    public String cheapest()
    {
        if(books.size() > 0)
        {
            Book min = books.get(0);
            for(Book index : books)
            {
                if (min.getPrice() > index.getPrice())
                {
                    min = index;
                }
            }
            return min.getTitle();
        }
        else
        {
            return "";
        }
    }

    @Override
    public String toString()
    {
        return books.toString();
    }
}
