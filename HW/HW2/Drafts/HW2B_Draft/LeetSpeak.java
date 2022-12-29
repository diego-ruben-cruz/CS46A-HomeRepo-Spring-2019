/**
 * Use some string methods
 * 
 * @Diego Cruz
 */
public class LeetSpeak
{
    public static void main(String[] args)
    {
        String word =  "leet"; 
        //do not change the line above here
        //add your code between here
        System.out.println(word.toUpperCase());
        System.out.println(word.length());
        //Final stuff begins here
        String op1 = word.replace("l","1");
        System.out.println(op1);
        String op2 = op1.replace("e","3");
        System.out.println(op2);
        String op3 = op2.replace("t","7");
        System.out.println(op3);
        //Final Stuff ends here
        //and here
        System.out.println("original word: " + word); // do not change this line
        
      
    }
}