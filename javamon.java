import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
        
        if (stage == 1)
        {
            g.setColor(Color.black);
            g.fillOval(200,200,150,150);
            g.fillPolygon(new int[] {325, 375, 350}, new int[] {275, 275, 375}, 3);
            g.fillPolygon(new int[] {225, 175, 200}, new int[] {275, 275, 375}, 3);
            
            g.setColor(Color.white);
            g.fillOval(240,240,25,30);
            g.fillOval(280,240,25,30);
            g.fillArc(220, 255, 100, 60, 0, -180); 
        }
    }

    public void init() {
        button1 = new Button("Feed");
        add(button1);
        button1.addActionListener(this);

        types.add("Air");
        types.add("Poison");        
        types.add("Electicity");
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
            else if (counter == 100)
            {
                stage = 3;
                repaint();
                JOptionPane.showMessageDialog(frame.getComponent(0), "You have reached the final stage!");
            }
        }
        repaint();
    }
}
