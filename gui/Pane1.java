import javax.swing.*;
import java.awt.*;

public class Pane1{
  public static void main(String[] args){
    Pane1 pane=new Pane1();
    pane.go();
  }

  public void  go(){
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button=new JButton("shock me");
    panel.add(button);
    frame.getContentPane().add(BorderLayout.CENTER,panel);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}
