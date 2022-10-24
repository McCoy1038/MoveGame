import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener {

    JPanel label;
    HomeScreen homeScreen;

    public MyFrame(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
        this.setBounds(500, 100, 500, 500);
        this.setTitle("MoveGame");
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        label = new JPanel();
        label.setBounds(250, 250, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);

        while (this.homeScreen.running == true){
            this.checkCollisions();
            this.homeScreen.running = false;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX() - 1, label.getY());
                }
                break;
            case 'w':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX(), label.getY() - 1);
                }
                break;
            case 's':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX(), label.getY() + 1);
                }
                break;
            case 'd':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX() + 1, label.getY());
                }
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX() - 1, label.getY());
                }
                break;
            case 'w':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX(), label.getY() - 1);
                }
                break;
            case 's':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX(), label.getY() + 1);
                }
                break;
            case 'd':
                for (int i = 0; i < 25; i++) {
                    label.setLocation(label.getX() + 1, label.getY());
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You pressed: " + e.getKeyChar() + ". It has a key code of: " + e.getKeyCode() + ".");
    }

    public void checkCollisions() {

        if (label.getY() > this.getY()) {
            new MyFrame(this.homeScreen);
        }
        if (label.getY() < this.getY()) {
            new MyFrame(this.homeScreen);
        }
        if (label.getX() > this.getX()-500) {
            new MyFrame(this.homeScreen);
        }
        if (label.getX() < this.getX()-500) {
            new MyFrame(this.homeScreen);
        }

    }
}