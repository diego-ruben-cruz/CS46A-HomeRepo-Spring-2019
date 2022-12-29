/**
 * Tests the Tetrahedron class
 */
public class TetrahedronTester
{
    public static void main(String[] args)
    {
        Tetrahedron tetra = new Tetrahedron(10);
        System.out.printf("%.2f%n",tetra.volume());
        System.out.println("Expected: 117.85");
        tetra.grow(5);
        System.out.printf("%.2f%n",tetra.volume());
        System.out.println("Expected: 397.75");
        
        tetra = new Tetrahedron(6);
        System.out.printf("%.2f%n",tetra.volume());
        System.out.println("Expected: 25.46");
        tetra.grow(2);
        System.out.printf("%.2f%n",tetra.volume());
        System.out.println("Expected: 60.34");
    }
}