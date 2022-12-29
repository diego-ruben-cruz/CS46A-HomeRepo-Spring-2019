
public class RectangleManagerTester
{
   public static void main(String[] args)
   {
       RectangleManager manager = new RectangleManager();
       System.out.println(manager.maxWidth());
       System.out.println("Expected: null");
       
       manager.add(new Rectangle(0, 0, 50, 75));
       manager.add(new Rectangle(0, 0, 150, 40));
       manager.add(new Rectangle(0, 0, 105, 140));
       
       System.out.println(manager.maxWidth());
       System.out.println("Expected: Rectangle[x=0,y=0,width=150,height=40]");
       
   }
}
