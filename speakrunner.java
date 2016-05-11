public class speakrunner
{
    public static void main (String [] args)
    {
         air bat = new bat("wingpup", 1, "black");
         electricity duck = new duck("ducking", 1, "yellow");
         poison cat = new cat("toxikity", 1, "gold");
         
         System.out.println(bat.toString() + "\n" + bat.phrases("hi") +"\n");
         System.out.println(duck.toString() + "\n" + duck.phrases("quack") + "\n");
         System.out.println(cat.toString() + "\n" + duck.phrases("meow") + "\n");
    }
}
