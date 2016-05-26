import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.io.*;
/**
 * This applet class displays all the information collected through the creature class and also prints the images depending on the type and stage you choose.
 * 
 * @Authors: annidhi and Lesya 
 * @5/26/16
 */
public class javamon extends Applet implements ActionListener
{
    Button button1, button2, button3; //creating buttons
    private int counter, stage;
    private String counter1, stage1 ,speak;
    final JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JComboBox<String> comboLanguage = new JComboBox<String>();
    Choice types = new Choice();

    Creature testCreature = new Creature(); //creating a creature object
    public void paint(Graphics g)
    {
        g.setColor(Color.white); //creates a white background
        g.fillRect(0,0,1000,1000);     

        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.setColor(Color.black);
        counter1 = "Counter: "+ counter; //prints counter
        stage1 = "Stage: " + testCreature.getCurrentStage(); //prints current stage
        g.drawString(stage1,25,75);
        g.drawString(counter1,25,100);

        stage = testCreature.getCurrentStage(); //accesses the current stage from the creature class
        //teaching the creature a few phrases to say
        testCreature.teach("I love speaking!");
        testCreature.teach("Hello World");
        testCreature.teach("I want more food!");
        testCreature.teach("I love food!");
        testCreature.teach("Bye!");

        g.drawString(speak, 600,450); //draws the phrase on panel
        String name;
        Image wingpup, chiroptavian, vamperion,  shockling, toxikitty, eleduck, plaguecat, thunderawk, venompanther; //creates image objects
        if (stage == 1)
        {
            if (types.getSelectedItem() == "Air") 
            {
                wingpup = getImage(getCodeBase(),"wingpup.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(wingpup,200,200,this); //displays the image
                testCreature.setName("air"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                shockling = getImage(getCodeBase(),"shockling.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(shockling,200,200,this);  //displays the image
                testCreature.setName("electricity"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint(); 
            }
            else 
            {
                toxikitty = getImage(getCodeBase(),"toxikitty.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(toxikitty,200,200,this);  //displays the image
                testCreature.setName("poison"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
        }

        else if (stage == 2)
        {
            if (types.getSelectedItem() == "Air")
            {
                chiroptavian = getImage(getCodeBase(),"chiroptavian.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(chiroptavian,200,200,this);  //displays the image
                testCreature.setName("air"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                eleduck = getImage(getCodeBase(),"eleduck.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(eleduck,200,200,this);  //displays the image
                testCreature.setName("electricity"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
            else 
            {
                plaguecat = getImage(getCodeBase(),"plaguecat.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(plaguecat,200,200,this);  //displays the image
                testCreature.setName("poison"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
        }
        else
        {
            if (types.getSelectedItem() == "Air")
            {
                vamperion = getImage(getCodeBase(),"vamperion.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(vamperion,200,200,this);  //displays the image
                testCreature.setName("air"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                thunderawk = getImage(getCodeBase(),"thunderawk.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(thunderawk,200,200,this);  //displays the image
                testCreature.setName("electricity"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
            else 
            {
                venompanther = getImage(getCodeBase(),"venompanther.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(venompanther,200,200,this);  //displays the image
                testCreature.setName("poison"); //calls the method in creature class and sets the type name
                name = "Name: " + testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400); //draws the string name on applet
                repaint();
            }
        }
    }

    public void init() {
        button1 = new Button("Feed"); //creatues button to feed
        add(button1); //adds button to panel
        button1.addActionListener(this);
        //creating the drop down menu of types of creature
        types.add("Air");
        types.add("Poison");        
        types.add("Electricity");
        add(new Label ("Types:"));
        add(types);
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button1) //counter increases everytime the feed button is clicked
        {
            counter++; 
            testCreature.setCurrentStage(counter); //this is where the counter is sent to the creature class to see if the stage can change
            speak = testCreature.speak(); //stores a phrases in speak to print on panel
        }
        repaint();
    }
}
