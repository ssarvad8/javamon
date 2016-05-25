import java.util.*;
import java.awt.*;
public class Electricity extends Creature
{
    public Electricity()
    {
        super();
        teach("I love to shock things!");
    }

    public String getStageName()
    {
        int stage = getCurrentStage();
        if (stage == 1)
            return "Shockling";
        else if (stage == 2)
            return "Eleduck";
        else
            return "Thunderawk";
    }
}
