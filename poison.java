import java.util.*;
public class poison extends creature
{
    ArrayList<String> phrases = new ArrayList<String>();
    public poison(String name1, int stage1)
    {
        super(name1,stage1);
    }

    public String toString()
    {
        return "Stage: " + getStage() + "\n" + "Name: " + getName();
    }
}
