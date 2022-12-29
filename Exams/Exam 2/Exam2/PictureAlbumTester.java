/**
 * Tests the PictureAlbum class 
 */
public class PictureAlbumTester
{
    public static void main(String[] args)
    {
        Picture[] pics = {
            new Picture("oliver_bed.jpg"),
            new Picture("oliver_sink.jpg"),
            new Picture("oliver_sprawl.jpg")
           };
        PictureAlbum album = new PictureAlbum(pics);
        System.out.println(album.landscapeCount());
        System.out.println("Expected: 0");
        
        Picture[] pics2 = {
              new Picture ("popsicle.jpg"),
              new Picture("oliver_sink.jpg"),
              new Picture("ashi.jpg"),
              new Picture("billy.jpg"),
              new Picture("tiger.jpg"),
              new Picture("oliver_bed.jpg")
            };
             
        album = new PictureAlbum(pics2);
        System.out.println(album.landscapeCount());
        System.out.println("Expected: 4");

        //have to display something so Codecheck is happy
        Text message = new Text(10, 20, "landscape: 0, 4");
        message.setColor(Color.BLUE);
        message.draw();
    }
}