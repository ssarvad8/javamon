public class bat extends air
{
    private String color;
    
    public bat(String name, int stage, String color1)
    {
        super (name, stage);
        color = color1;
    }
    
    public String getColor()
    {
       return color; 
    }
    
    public void  setColor(String newColor)
    {
        color = newColor;
    }
}
       
