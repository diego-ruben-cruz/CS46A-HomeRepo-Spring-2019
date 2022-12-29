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
        
        Measurable measurable = forest[0];
        System.out.println("If this compiles,Measurable is implemented");
        
        System.out.println("The heights are:");
        for (Tree t: forest)
        {
            System.out.print(t.getMeasure() + " ");
        }

    }
}