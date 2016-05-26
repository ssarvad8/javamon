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
    private String counter1, stage1;

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
        String name;
        Image wingpup, chiroptavian, vamperion,  shockling, toxikitty, eleduck, plaguecat, thunderawk, venompanther; //creates image objects
        if (stage == 1)
        {
            if (types.getSelectedItem() == "Air") 
            {
                wingpup = getImage(getCodeBase(),"wingpup.jpg"); //accesses image which is located in the same folder as the code
                g.drawImage(wingpup,200,200,this); //displays the image
                testCreature.setName("air"); //calls the method in creature class and sets the type name
                name = testCreature.getStageName(); //gets the current stage name from creature class
                g.drawString(name,600,400);
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                shockling = getImage(getCodeBase(),"shockling.jpg");
                g.drawImage(shockling,200,200,this);
                testCreature.setName("electricity");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
            else 
            {
                toxikitty = getImage(getCodeBase(),"toxikitty.jpg");
                g.drawImage(toxikitty,200,200,this);
                testCreature.setName("poison");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
        }
        else if (stage == 2)
        {
            if (types.getSelectedItem() == "Air")
            {
                chiroptavian = getImage(getCodeBase(),"chiroptavian.jpg");
                g.drawImage(chiroptavian,200,200,this);
                testCreature.setName("air");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                eleduck = getImage(getCodeBase(),"eleduck.jpg");
                g.drawImage(eleduck,200,200,this);
                testCreature.setName("electricity");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
            else 
            {
                plaguecat = getImage(getCodeBase(),"plaguecat.jpg");
                g.drawImage(plaguecat,200,200,this);
                testCreature.setName("poison");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
        }
        else
        {
            if (types.getSelectedItem() == "Air")
            {
                vamperion = getImage(getCodeBase(),"vamperion.jpg");
                g.drawImage(vamperion,200,200,this);
                testCreature.setName("air");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                thunderawk = getImage(getCodeBase(),"thunderawk.jpg");
                g.drawImage(thunderawk,200,200,this);
                testCreature.setName("electricity");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
            else 
            {
                venompanther = getImage(getCodeBase(),"venompanther.jpg");
                g.drawImage(venompanther,200,200,this);
                testCreature.setName("poison");
                name = testCreature.getStageName();
                g.drawString(name,600,400);
                repaint();
            }
        }
    }

    public void init() {
        button1 = new Button("Feed"); //creatues button to feed
        add(button1);
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
        }
        repaint();
    }
}
