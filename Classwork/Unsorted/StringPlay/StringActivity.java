
/**
 * StringActivity
 *
 * @Diego Cruz
 * @2.5.19
 */
public class StringActivity
{
    public static void main(String[] args)
    {
        String word = "University";
        String lowerConvert = word.toLowerCase();
        System.out.println(lowerConvert);
        System.out.println(word);
        String replaceConvert = word.replace("s","$")
                                    .replace("i","1")
                                    .replace("e","3");
        System.out.println(replaceConvert);
        System.out.println(word);
    }
}
