// Sannidhi Sarvadhavabhatla
// 12-8-14
// graphics Ex 9

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class graphicsEx9 extends Applet implements ActionListener
{
/*  Note:  required for interface ActionListener: 
    actionPerformed(ActionEvent ae)  Invoked when an action occurs */
    private int selection;

    private Choice colorChoice;
    private Choice shapeChoice;
    private Color color;
    private Button button1;

    public void actionPerformed(ActionEvent ae) {
       selection=0;
       if (ae.getSource().equals(button1)) {
            ;
        }    //clear the screen
                repaint();
    }
    public void init()
    {
//         4 requirements for adding a Button to an Applet:
//         private Button button1;//declare button as a Button
//         button1=new Button("red circle");//initializes button1 as a new button object
//         add(button1);//adds button1 to the screen, actually shows it
//         button1.addActionListener(this);//add a listener object so this button

//         4 requirements for adding a Choice to an Applet 
//         private Choice colorChoice;//declare choice as a Choice      
//         Choice rgb = new Choice();//creates a new pop-up menu for rgb choices 
//         rgb.add("Red");//creates choice “Red” 
//         rgb.add("Green");//creates choice “Green”  
//         rgb.add("Blue"); //creates choice “Blue” 
//         add(rgb);//last step to add the choices to rgb

        selection=0;
        button1=new Button("redraw");
        add(button1);
        button1.addActionListener(this);
        colorChoice = new Choice();
        colorChoice.add("blue");
        colorChoice.add("black");        
        colorChoice.add("green");
        colorChoice.add("random");        
        add(new Label ("color:"));
        add(colorChoice);
        color=Color.blue;
        
        shapeChoice = new Choice();
        shapeChoice.add("circle");
        shapeChoice.add("square");        
        shapeChoice.add("line");

        add(new Label ("shape:"));
        add(shapeChoice);       
    }
  
    public void paint(Graphics g)
    {
            String colorch=colorChoice.getSelectedItem();
            if(colorch.equals ("blue")){
                color=Color.blue;
                g.setColor(color);
            }
            else if (colorch.equals ("black")){
                color=Color.black;
                g.setColor(color);
            }
            else if (colorch.equals ("green")){
                color=Color.green;
                g.setColor(color);
            }
            else if (colorch.equals ("random")){
               int red= (int) (Math.random()*256);
               int green= (int) (Math.random()*256);
               int blue =(int) (Math.random()*256);
               Color randomColor = new Color(red,green,blue);
               g.setColor(randomColor);
            }
            String shapech=shapeChoice.getSelectedItem();
            
            if(shapech.equals ("circle")){
                g.fillOval(30,100,50,50);
            }
            else if (shapech.equals ("square")){
                g.fillRect(100,250,20,20);
            }
            else if (shapech.equals ("line")){
                g.drawLine(400,300,420,100);
            }    
        }
}


