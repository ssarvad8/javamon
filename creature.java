import java.util.*;
public class creature 
{
    private String name;
    private int stage; 
    ArrayList<String> phrases = new ArrayList<String>();
    
    public creature(String name1, int stage1)
    {
        name = name1;
        stage = stage1;
    }

    public String getName()
    {
        return name;
    }

    public int getStage()
    {
        return stage;
    }

    public void setName (String newName)
    {
        name = newName;
    }

    public void setStage (int newStage)
    {
        stage = newStage;
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
}
    