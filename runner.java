/**
 * This runner class tests the methods created in the creature class
 * 
 * @Authors: annidhi and Lesya 
 * @5/26/16
 */
public class runner
{
    private int FIRST_EVOLVE, SECOND_EVOLVE;
    public static void main (String[] args)
    {
        //testing creature (parent) class methods
        Creature testCreat=new Creature();
        testCreat.teach("I am a test creature!");
        testCreat.teach("Hello World!");
        System.out.println(testCreat.speak());

        //testing the stages and the creature names 
        System.out.println("\nAir Creatures");
        testCreat.setName("air");
        System.out.println("Current Stage: " + testCreat.getCurrentStage() + "\n" + testCreat.getStageName());
        testCreat.setCurrentStage(20);
        System.out.println("Current Stage: " + testCreat.getCurrentStage()+ "\n" + testCreat.getStageName());
        testCreat.setCurrentStage(50);
        System.out.println("Current Stage: " + testCreat.getCurrentStage()+ "\n" + testCreat.getStageName());
        
              
    }
}

