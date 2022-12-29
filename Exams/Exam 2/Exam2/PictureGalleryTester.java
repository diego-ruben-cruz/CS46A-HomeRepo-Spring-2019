import java.util.ArrayList;
/**
 * Tests the PictureGallery class
 *
 */
public class PictureGalleryTester
{
    public static void main(String[] args)
    {
        PictureGallery pictures = new PictureGallery();        
        pictures.add(new Picture("ashi.jpg"));
        pictures.add(new Picture("popsicle.jpg") );
        pictures.add(new Picture("billy.jpg"));
        
        Picture narrowest = pictures.mostNarrow();
        System.out.println(narrowest);
        System.out.println("Expected: Picture[x=0,y=0,width=150,height=113,source=billy.jpg]");      

        pictures.add(new Picture("oliver_bed.jpg"));
        pictures.add(new Picture("oliver_sink.jpg"));
        narrowest = pictures.mostNarrow();  
        System.out.println(narrowest);
        System.out.println("Expected: Picture[x=0,y=0,width=143,height=190,source=oliver_sink.jpg]");
           
        pictures = new PictureGallery();  
        narrowest = pictures.mostNarrow();
        System.out.println(narrowest);
        System.out.println("Expected: null");
        
        
    }
}