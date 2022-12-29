/**
 * Write a description of class NameTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameTester
{
    public static void main(String[] args)
    {
        Name name = new Name("Allison Chung");
        System.out.println(name.consonants());
        System.out.println("Expected: 8");
        
        name = new Name("a-abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(name.consonants());
        System.out.println("Expected: 42");
        //name should not change
        System.out.println(name.getName()); 
        System.out.println("Expected: a-abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        name = new Name("Alhambra Cohen");
        System.out.println(name.initials());
        System.out.println("Expected: AC");
        
        name = new Name("George H W Bush");
        System.out.println(name.initials());
        System.out.println("Expected: GHWB");
        
        name = new Name("John Jacob Jingleheimer Schmidt");
        System.out.println(name.initials());
        System.out.println("Expected: JJJS");
        
        name = new Name("Zorro");
        System.out.println(name.initials());
        System.out.println("Expected: Z");
      
    }
}