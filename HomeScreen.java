import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;

public class HomeScreen extends JPanel implements ActionListener{

    public HomeScreen(){
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel title = new JLabel("The Rooms");
    JButton start = new JButton("Start");
    
    start.setBackground(Color.BLACK);
    start.setForeground(Color.RED);
    start.setBounds(250,450,200,200);
    start.addActionListener(this);

    title.setBounds(250,50,300,250);
    title.setFont(new java.awt.Font("", 0, 50));
    title.setForeground(Color.RED);

    panel.setBounds(0,0,500,500);
    panel.setBackground(Color.black);
    panel.add(title);
    panel.add(start);

    frame.setBounds(500,100,500,500);
    frame.setTitle("Rooms");
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);

    frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
     new MyFrame();
    }
}