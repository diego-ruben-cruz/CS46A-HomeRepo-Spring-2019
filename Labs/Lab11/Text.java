import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class Text
{
    private ArrayList<String> words;

    public Text()
    {
        words = new ArrayList<String>();
    }

    public void removeAdjacentDuplicates()
    {
        for(int p = 0; p < words.size()-1; p++)
        {
            if(words.get(p+1).equals(words.get(p)))
            {
                words.remove(p+1);
                p--;
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void removeAllDuplicates()
    {
        for(int place = 0; place < words.size()-1; place++)
        {
            for(int p = place + 1; p < words.size(); p++)
            {
                if(words.get(place).equals(words.get(p)))
                {
                    words.remove(p);
                    p--;
                }
            }
        }
    }

    /**
    Gets the words from this text.
    @return an array list containing the words
     */
    public ArrayList<String> getWords()
    {
        return words;
    }

    // Don't look at the code below...

    /**
    Lets the user pick a file for loading
     */
    public void pick()
    {
        JFileChooser chooser = new JFileChooser(".");
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            load(chooser.getSelectedFile().getAbsolutePath());
        }
    }   

    /**
    Loads a file.
    @param source a URL or file name
     */
    public boolean load(String source)
    {
        if (source == null) return false;
        try
        {
            Scanner in;
            if (source.startsWith("http://"))
            {
                in = new Scanner(new URL(source).openStream());
            }
            else
            {
                in = new Scanner(new FileReader(source));
            }
            in.useDelimiter("[^\\p{L}]");
            words = new ArrayList<String>();
            while (in.hasNext())
            {
                String word = in.next();
                if (word.length() > 0)
                    words.add(word);
            }
            return true;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    /**
    Displays the words in a text area
     */
    public void explore()
    {
        JTextArea area = new JTextArea(20, 40);
        JScrollPane scroll = new JScrollPane(area);
        for (String word : words)
            area.append(word + "\n");
        JOptionPane.showMessageDialog(null, scroll);    
    }
}
