public class BookTester
{
    public static void main(String[] args)
    {
        Book myBook = new Book("Goodnight, Moon", 9.95);
        System.out.println(myBook.getName());
        System.out.println("Expected: Goodnight, Moon");
        myBook.setName("Crazy Rich Asians");
        System.out.println(myBook.getName());
        System.out.println("Expected: Crazy Rich Asians");
        myBook.setPrice(22.75);
        System.out.println(myBook.getPrice());
        System.out.println("Expected: 22.75");
        
        
    }
}