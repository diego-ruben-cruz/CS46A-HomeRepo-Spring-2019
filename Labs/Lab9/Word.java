public class Word
{
    private String text;

    /**
    Constructs a word.
    @param text the characters in this word
     */
    public Word(String text)
    {
        this.text = text;
    }

    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean isVowel(String letter)
    {
        return "aeiouy".contains(letter.toLowerCase());
    }

    /**
    Counts all the vowels of the word.
    @return the number of vowels.
     */
    public int countVowels()
    {
        int i = 0;
        int counter = 0;
        while (i < text.length())
        {
            String letter = text.substring(i, i + 1); // the ith letter
            // Your work here

        }
        return 0;
    }

    /**
    Gets all the vowels of the word.
    @return the vowels.
     */
    public String getVowels()
    {
        String collect = "";
        for (int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i+1); // the ith letter
            if(this.isVowel(letter))
            {
                collect = collect + letter;
            }
        }
        return collect;
    }

    /**
    Gets all the consonants of the word.
    @return the consonants.
     */
    public String getNonVowels()
    {
        String collect = "";
        for (int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i+1); // the ith letter
            if(!this.isVowel(letter))
            {
                collect = collect + letter;
            }
        }
        return collect;
    }

    /**
    Gets all the vowels of the word followed by the rest of the letters.
    @return The word in order of vowels and then consonants.
     */
    public String getVowelsFirst()
    {
        String vowelcollect = this.getVowels();
        String consonantcollect = this.getNonVowels();
        String collect = vowelcollect + consonantcollect;
        return collect;
    }

    /**
    Gets the longest vowel group.
    @return The longest vowel group.
     */
    public String longestVowelGroupSoFar()
    {
        int i = 0;
        String vowelGroup = "";
        String longestVowelGroupSoFar = "";
        String letter = "";
        while (i < text.length())
        {
            letter = text.substring(i, i + 1);
            if (this.isVowel(letter))
            {
                while (i < text.length() - 1 && this.isVowel(letter))
                {
                    i++;
                    vowelGroup = vowelGroup + letter;
                    letter = text.substring(i, i + 1);
                }
                if(this.isVowel(letter))
                {
                    vowelGroup = vowelGroup + letter;
                    i++;
                }
                if(longestVowelGroupSoFar.length() < vowelGroup.length())
                {
                    longestVowelGroupSoFar = vowelGroup;
                }
                vowelGroup = "";
            }
            else
            {
                i++;
            }
        }
        return longestVowelGroupSoFar;
    }

    public String toString()
    {
        return text;
    }
}