import java.util.ArrayList;
/**
 * Manages an arrary list of Circle objects
 */
public class CircleManager
{
    private ArrayList<Circle> myCircles;

    /**
     * Constructs an empty CirclManager
     */
    public CircleManager()
    {
        myCircles = new ArrayList<Circle>();
    }

    /**
     * Adds a Circle object to this object
     * @param the Circle to add
     */
    public void add(Circle c)
    {
        myCircles.add(c);
    }

    /**
     * Gets the sum of the areas of the Circles in the 
     * CircleManager
     * @return the sum of the areas
     */
    public double sumAreas()
    {
        double sum = 0;
        for(Circle place : myCircles)
        {
            sum = sum + place.area();
        }
        return sum;
    }

    /**
     * Gets the average of the areas of the Circles in 
     * the CircleManager
     * @return the average of the areas
     */
    public double averageArea()
    {
        double average = 0;
        int count = 0;
        for(Circle place : myCircles)
        {
            count++;
        }
        average = this.sumAreas()/count;
        if (average > 0)
        {
            return average;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Gets the largest Circle in this CircleManager
     * @return the largest Circle
     */
    public Circle largest()
    {
        if (myCircles.size() > 0)
        {
            Circle max = myCircles.get(0);
            for(Circle place : myCircles)
            {
                if (max.getRadius() < place.getRadius())
                {
                    max = place;
                }
            }
            return max;
        }
        else
        {
            return null;
        }
    }

    /**
     * Gets the first Circle in the CircleManger with 
     * radius > 10
     * @return the first Circle in the CircleManger with 
     * radius > 10
     */
    public Circle firstRadiusGreaterThan10()
    {
        Circle firstMatch = new Circle(0);
        int index = 0;
        boolean found = false;
        while (index < myCircles.size() && !found)
        {
            if (myCircles.get(index).getRadius() > 10)
            { 
                firstMatch = myCircles.get(index);
                found = true;
            }
            else
            {
                index++;
            }
        }
        if(firstMatch.getRadius() > 0)
        {
            return firstMatch;
        }
        else
        {
            return null;
        }
    }
    
   /**
     * Gets the number of circles with a radius greater than one.
     */
    public int countRadiusGreaterThanOne()
    {
        int count = 0;
        for(Circle c : myCircles)
        {
            if (c.getRadius() > 1)
            {
                count++;
            }
        }
        return count;
    }
    /**
     * Gets an array list circles with a radius greater than ten.
     */
    public ArrayList<Circle> radius10OrGreater()
    {
        ArrayList<Circle> goodCircles = new ArrayList<Circle>();
        for(Circle c : myCircles)
        {
            if (c.getRadius() > 10)
            {
                goodCircles.add(c);
            }
        }
        return goodCircles;
    }

    public String toString()
    {
        String s = "CircleManager[";
        s = s + myCircles.toString() + "]";
        return s;
    }
}
