public class runner
{
    public static void main (String[] args)
    {
        Creature testCreat=new Creature();
        testCreat.teach("I am a test creature");
        System.out.println(testCreat.speak());
        
        System.out.println(testCreat.getCurrentStage());
        for (int i=0; i<102; i++)
        {
            testCreat.levelUp();
        }
        System.out.println(testCreat.getCurrentStage());
    }
}

