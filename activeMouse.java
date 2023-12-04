import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class activeMouse {
  public static void main(String[] args) throws InterruptedException{
    JLabel label = new JLabel("mouse pointer location: ");
    label.setFont(new Font("Serif",Font.ITALIC,20));
    label.setForeground(Color.RED);
    JFrame frame = new JFrame("Mouse Location finder :");
    frame.setUndecorated(true);
    frame.setBackground(new Color(0, 0, 0, 0));
    frame.setSize(240, 120);
    frame.add(label);
    frame.setLocation(1400, 83);
    frame.setAlwaysOnTop(true);
    frame.setVisible(true);
    //frame.toFront();
    while(true){
      //Thread.sleep(100);
      label.setText("(" + MouseInfo.getPointerInfo().getLocation().x + 
             ", " + 
           MouseInfo.getPointerInfo().getLocation().y + ")");
    }
  }
}