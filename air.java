import java.util.*;
public class air extends creature
{
    ArrayList<String> phrases = new ArrayList<String>();

    public air(String name1, int stage1)
    {
        super(name1,stage1);
    }

    public String phrases(String phrase)
    {
        phrases.add(phrase);
        return phrase;
    }

    public ArrayList getPhrases()
    {
        return phrases;
    }
    
    public String toString()
    {
        return "Stage: " + getStage() + "\n" + "Name: " + getName();
    }
}
