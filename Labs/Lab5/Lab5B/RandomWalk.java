
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    public static void main(String[] args)
    {
        Picture roomba = new Picture("large_roomba.png");
        roomba.translate(200,200);
        double randomDeg = Math.random() * 360;
        double radConvert = Math.toRadians(randomDeg);
        
    }
}
