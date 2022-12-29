import java.util.ArrayList;
public class EllipseManagerTester
{
   public static void main(String[] args)
   {
       ArrayList<Ellipse> list = new ArrayList<>();
       EllipseManager manager = new EllipseManager(list);
       System.out.println(manager.widest());
       System.out.println("Expected: null");
       
       list.add(new Ellipse(0, 0, 50, 75));
       list.add(new Ellipse(0, 0, 150, 40));
       list.add(new Ellipse(0, 0, 105, 140));
       
       manager = new EllipseManager(list);
       System.out.println(manager.widest());
       System.out.println("Expected: Ellipse[x=0,y=0,width=150,height=40]");
       
   }
}
