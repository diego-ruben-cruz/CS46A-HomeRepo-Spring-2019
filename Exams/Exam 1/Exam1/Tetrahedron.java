
/**
 * Models a tetrahedron with a given side length.
 *
 * @author DCruzin
 * @version 3.7.19
 */
public class Tetrahedron
{
    // instance variables - replace the example below with your own
    private double edge;

    /**
     * Constructor for objects of class Tetrahedron
     * 
     * @param   givenEdge   The given edge for the tetrahedron.
     * 
     */
    public Tetrahedron(double givenEdge)
    {
        // initialise instance variables
        edge = givenEdge;
    }

    /**
     * Computes the volume of the tetrahedron.
     *
     * @return    The computed volume.
     */
    public double volume()
    {
        // put your code here
        double calculation = Math.pow(edge,3)/(6.0*Math.sqrt(2));
        return calculation;
    }

    /**
     * Increases the length of the tetrahedron edge.
     *
     * @param  growAmount  the amount to grow edge by.
     */
    public void grow(double growAmount)
    {
        // put your code here
        edge = edge + growAmount;
    }
}
