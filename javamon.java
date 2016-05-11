import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class javamon extends Applet implements ActionListener
{
    Button button1, button2, button3;

    final JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    boolean drawBat = false;
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0,0,500,500);     

        g.setColor(Color.yellow);

        
       
    }

    public void init() {
        button1 = new Button("Stage 1");
        add(button1);
        button1.addActionListener(this);

        button2 = new Button("Stage 2");
        add(button2);
        button2.addActionListener(this);

        button3 = new Button("Stage 3");
        add(button3);
        button3.addActionListener(this);

        JComboBox<String> comboLanguage = new JComboBox<String>();
        
        Choice types = new Choice();
        types.add("Air");
        types.add("Poison");        
        types.add("Electicity");
        add(new Label ("Types:"));
        add(types);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) 
        {
            JOptionPane.showMessageDialog(frame.getComponent(0), "Baby Stage");
        }
        else if (e.getSource() == button2)
        {
            JOptionPane.showMessageDialog(frame.getComponent(0), "Middle Stage");
        }
        else if (e.getSource() == button3)
        {
            JOptionPane.showMessageDialog(frame.getComponent(0), "Adult Stage");
        }
    }

}
