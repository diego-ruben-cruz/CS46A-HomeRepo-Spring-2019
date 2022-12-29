
/**
 * Write a description of class StrairViewer here.
 *
 * @ author Diego Cruz
 * @ 2.7.2019
 */
public class MoonAdios

{
    public static void main(String[] args)
    {
        String farewell = "Goodbye, Moon";
        farewell.toLowerCase();
        System.out.println(farewell); // 1
        farewell.replace("o", "");
        System.out.println(farewell);  // 2
        String changed = farewell.toLowerCase();
        System.out.println(farewell);  // #3
        System.out.println(changed);  // #4
        changed = changed.replace("o", "");
        changed = changed.replace("e", "3");
        System.out.println(changed); // #5
        System.out.println(farewell); // #6
    }
}
