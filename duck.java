public class duck extends electricity
{
    private String color;
    
    public duck(String name, int stage, String color1)
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
       
