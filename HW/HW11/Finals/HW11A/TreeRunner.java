public class TreeRunner
{
    public static void main(String[] args)
    {
        Tree[] forest = new Tree[6];
        forest[0] = new Tree("avocado", 35.0);
        forest[1] = new Tree("dwarf maple tree", 4.0);
        forest[2] = new Tree("lemon",12.5 );
        forest[3] = new Tree("apple", 20.0);
        forest[4] = new Tree("cherry", 12.5);
        forest[5] = new Tree("apricot", 17);
          
        // Add the code to get the average height of the Trees 
        //between here and the comment that says end
        double sum = 0;
        double average = 0;
        int count = forest.length;
        for(Tree p : forest)
        {
            sum = sum + p.getMeasure();
        }
        average = sum/count;
        System.out.println(average);
        // System.out.println("Expected: " + (35+4+12.5+20+12.5+17)/6);
        //end
        
        
        //
        // Add the code to get the type of tallest tree between the comments
        //
        Tree tallest = forest[0];
        for(Tree p : forest)
        if(tallest.getMeasure() < p.getMeasure())
        {
            tallest = p;
        }
        System.out.println(tallest.getType());
        // end
        
        
        
       
    }
}