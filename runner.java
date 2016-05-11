public class runner
{
    public static void main (String [] args)
    {
         air bat = new bat("wingpup", 1, "black");
         electricity duck = new duck("ducking", 1, "yellow");
         
         System.out.println(bat.toString() + "\n" + bat.phrases("hi"));
         System.out.println(duck.toString() + "\n" + duck.phrases("quack"));
    }
}
