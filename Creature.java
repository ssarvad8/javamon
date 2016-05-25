import java.util.*;

public class Creature 
{
    private ArrayList<String> knownSpeech=new ArrayList<String>();
    private int level, currentStage;
    private int FIRST_EVOLVE=25;
    private int SECOND_EVOLVE=50;

    public Creature()
    {
        knownSpeech.add("I'm a Javamon!");
        level=1;
        currentStage=1;
    }
    
    public void teach(String input)
    {
        knownSpeech.add(input);
    }
    
    public String speak()
    {
        int random = (int)(Math.random() *(knownSpeech.size()));
        return knownSpeech.get(random);
    }
    
    public void levelUp()
    {
        level++;
        if (isEvolveTime()){
            currentStage++;
        }
    }
    
    private boolean isEvolveTime()
    {
        if (level==FIRST_EVOLVE || level==SECOND_EVOLVE){
            return true;
        }
        return false;
    }
    
    public int getCurrentStage(){
        return currentStage;
    }
}
