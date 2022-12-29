public class Lab11D
{
    public static void main(String[] args)
    {
        VisualArrayList<Picture> list = new VisualArrayList<Picture>();   
        list.add(new Picture("a.jpeg"));
        list.add(new Picture("b.jpeg"));
        list.add(new Picture("c.jpeg"));
        list.add(new Picture("d.jpeg"));
        list.add(new Picture("e.jpeg"));
        list.add(new Picture("f.jpeg"));

        // your work here: swap the first and second parts of the array list.
        int half = list.size()/2;
        for(int r = 0; r < half; r++)
        {
            Picture swap = list.get(r);
            list.set(r, list.get(r+half));
            list.set(r+half,swap);
        }
    }
}
