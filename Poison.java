import java.util.*;
import java.awt.*;
public class Poison extends Creature
{
    public Poison()
    {
        super();
        teach("I love to meow");
    }

    public String getStageName()
    {
        int stage = getCurrentStage();
        if (stage == 1)
            return "Toxikitty";
        else if (stage == 2)
            return "Plaguecat";
        else
            return "Venompanther";
    }
}
