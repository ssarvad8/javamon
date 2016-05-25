import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.io.*;

public class javamon extends Applet implements ActionListener
{
    Button button1, button2, button3;
    private int counter, stage = 1;
    private String counter1, stage1;

    final JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JComboBox<String> comboLanguage = new JComboBox<String>();
    Choice types = new Choice();

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0,0,1000,1000);     

        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.setColor(Color.black);
        counter1 = "Counter: "+ counter;
        stage1 = "Stage: " + stage;
        g.drawString(stage1,25,75);
        g.drawString(counter1,25,100);

        Image wingpup, chiroptavian, vamperion,  shockling, toxikitty, eleduck, plaguecat, thunderawk, venompanther; 
        if (stage == 1)
        {
            if (types.getSelectedItem() == "Air")
            {
                wingpup = getImage(getCodeBase(),"wingpup.jpg");
                g.drawImage(wingpup,200,200,this);
                repaint();
            }
            else if (types.getSelectedItem() == "Electricity")
            {
                shockling = getImage(getCodeBase(),"shockling.jpg");
                g.drawImage(shockling,200,200,this);
                repaint();
            }
            else 
            {
                toxikitty = getImage(getCodeBase(),"toxikitty.jpg");
                g.drawImage(toxikitty,200,200,this);
                repaint();
            }
        }
        else if (stage == 2)
        {
            if (types.getSelectedItem() == "Air")
            {
                chiroptavian = getImage(getCodeBase(),"chiroptavian.jpg");
                g.drawImage(chiroptavian,200,200,this);
                repaint();
            }
            else if (types.getSelectedItem() == "Electric")
            {
                eleduck = getImage(getCodeBase(),"eleduck.jpg");
                g.drawImage(eleduck,200,200,this);
                repaint();
            }
            else 
            {
                plaguecat = getImage(getCodeBase(),"plaguecat.jpg");
                g.drawImage(plaguecat,200,200,this);
                repaint();
            }
        }
        else
        {
            if (types.getSelectedItem() == "Air")
            {
                vamperion = getImage(getCodeBase(),"vamperion.jpg");
                g.drawImage(vamperion,200,200,this);
                repaint();
            }
            else if (types.getSelectedItem() == "Electric")
            {
                thunderawk = getImage(getCodeBase(),"thunderawk.jpg");
                g.drawImage(thunderawk,200,200,this);
                repaint();
            }
            else 
            {
                venompanther = getImage(getCodeBase(),"venompanther.jpg");
                g.drawImage(venompanther,200,200,this);
                repaint();
            }
        }
    }

    public void init() {
        button1 = new Button("Feed");
        add(button1);
        button1.addActionListener(this);

        types.add("Air");
        types.add("Poison");        
        types.add("Electricity");
        add(new Label ("Types:"));
        add(types);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) 
        {
            counter++;
            if (counter == 20)
            {
                stage = 2;
            }
            else if (counter == 50)
            {
                stage = 3;
                repaint();
                JOptionPane.showMessageDialog(frame.getComponent(0), "You have reached the final stage!");
            }
        }
        repaint();
    }
}
