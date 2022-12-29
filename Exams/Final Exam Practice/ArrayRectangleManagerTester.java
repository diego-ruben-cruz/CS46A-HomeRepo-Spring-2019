
public class ArrayRectangleManagerTester
{
   public static void main(String[] args)
   {
       Rectangle[] list = 
         {
            new Rectangle(0, 0, 50, 75),
            new Rectangle(0, 0, 150, 40),
            new Rectangle(0, 0, 107, 140)
        };
       
       ArrayRectangleManager manager = new ArrayRectangleManager(list);
       System.out.println(manager.maxWidth());
       System.out.println("Expected: Rectangle[x=0,y=0,width=150,height=40]");
       
   }
}
