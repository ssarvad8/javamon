import java.util.*;
import java.awt.*;
public class Air extends Creature
{
    public Air()
    {
        super();
        teach("I love flying~~~");
    }

    public String getStageName()
    {
        int stage = getCurrentStage();
        if (stage == 1)
            return "Wingpup";
        else if (stage == 2)
            return "Chiroptavian";
        else
            return "Vamperion";
    }
}
