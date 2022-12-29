
public class EllipseManager2Tester
{
   public static void main(String[] args)
   {
       Ellipse[] list = 
         {
            new Ellipse(0, 0, 50, 75),
            new Ellipse(0, 0, 150, 40),
            new Ellipse(0, 0, 107, 140)
        };
       
       EllipseManager2 manager = new EllipseManager2(list);
       System.out.println(manager.widest());
       System.out.println("Expected: Ellipse[x=0,y=0,width=150,height=40]");
       
   }
}
