public class runner
{
    public static void main (String [] args)
    {
        creature air1 = new air ("wingpup",1);
        creature poison1 = new poison ("toxikitty",1);
        creature electricity1 = new electricity("shockling",1);
        
        air1.phrases("hi");
        poison1.phrases("quack");
        electricity1.phrases("meow");
        
        air1.getPhrases();
        poison1.getPhrases();
        electricity1.getPhrases();
        
        air1.toString();
        poison1.toString();
        electricity1.toString();
    }
}

