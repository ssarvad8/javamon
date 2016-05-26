import java.util.*;
/**
 * This creature class sets the current stages and names of the creatures and sends the information to the 
 * applet class to print on the applet screen
 * 
 * @Authors: annidhi and Lesya 
 * @5/26/16
 */
public class Creature 
{
    private ArrayList<String> knownSpeech=new ArrayList<String>(); //arraylist to store speeches of creature
    private int currentStage;
    private String name;

    public Creature() //constructor
    {
        knownSpeech.add("I'm a Javamon!"); //stores a speech that all creatures have in common
        currentStage=1;
    }

    public void teach(String input) //this method adds an input of speech to the array list created before
    {
        knownSpeech.add(input);
    }

    public String speak() //this method picks a random speech from the array list to return
    {
        int random = (int)(Math.random() * (knownSpeech.size()));
        return knownSpeech.get(random);
    }

    public void setCurrentStage(int counter) //this method sets the current stage based on the counter from the applet
    {
        if (counter == 20)
        {
            currentStage = 2;
        }
        else if (counter == 50)
        {
            currentStage = 3;
        }
    }

    public int getCurrentStage() //returns the current stage of the creature
    {
        return currentStage;
    }

    public void setName(String userType) //this method sets the type that is from the drop down menu in applet
    {
        name = userType;
    }

    public String getStageName() //this method gets the name of the current stage so the object created in applets can access the name of the current stage
    {
        int stage = getCurrentStage();

        if (name.equals("air"))
        {
            if (stage == 1)
                return "Wingpup";
            else if (stage == 2)
                return "Chiroptavian";
            else
                return "Vamperion";
        }
        else if (name.equals("poison"))
        {
            if (stage == 1)
                return "Toxikitty";
            else if (stage == 2)
                return "Plaguecat";
            else
                return "Venompanther";
        }
        else 
        {
            if (stage == 1)
                return "Shockling";
            else if (stage == 2)
                return "Eleduck";
            else
                return "Thunderawk";
        }
    }
}
