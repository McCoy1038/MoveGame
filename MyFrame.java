import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;

    public MyFrame(){
    this.setBounds(500,100,500,500);
    this.setTitle("MoveGame");
    this.setResizable(false);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.addKeyListener(this);

    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setBackground(Color.magenta);
    label.setOpaque(true);

    this.add(label);
    this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e){
        switch(e.getKeyChar()){
            case 'a':
            label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w':
            label.setLocation(label.getX(), label.getY()-10);
            break;
            case 's':
            label.setLocation(label.getX()-10,label.getY()+10);
            break;
            case 'd':
            label.setLocation(label.getX()+10, label.getY());
            break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyChar()){
            case 'a':
            label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w':
            label.setLocation(label.getX(), label.getY()-10);
            break;
            case 's':
            label.setLocation(label.getX()-10,label.getY()+10);
            break;
            case 'd':
            label.setLocation(label.getX()+10, label.getY());
            break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("You pressed: " + e.getKeyChar() + ". It has a key code of: " + e.getKeyCode() + ".");
    }
}