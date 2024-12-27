import javax.swing.*;
import java.awt.*;

public class Button1{
  public static void main(String[] args){
    Button1 btn=new Button1();
    btn.go();
  }

  public void go(){
    JFrame frame=new JFrame();
    JButton button=new JButton("click me");
    Font bigfont=new Font("serif",Font.BOLD,28);
    button.setFont(bigfont);
    frame.getContentPane().add(BorderLayout.NORTH,button);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}
  
