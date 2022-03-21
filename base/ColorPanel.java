package colorpanel.base;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorPanel extends JFrame implements ActionListener{

    private JRadioButton red;
    private JRadioButton blue;
    private JRadioButton green;
    private JPanel panel;


public ColorPanel(){
    
    setTitle("Color Panel");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100, 600, 300);
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

     red = new JRadioButton("Red");
     blue = new JRadioButton("blue");
     green = new JRadioButton("green");

     ButtonGroup buttons = new ButtonGroup();

       buttons.add(red);
       buttons.add(blue);
       buttons.add(green);

       red.setBounds(100, 200, 100, 20);
       blue.setBounds(250, 200, 100, 20);
       green.setBounds(400, 200, 100, 20);


       panel.add(red);
       panel.add(blue);
       panel.add(green);

       red.addActionListener(this);
       blue.addActionListener(this);
       green.addActionListener(this);

       setVisible(true);


}

public void actionPerformed(ActionEvent e){

      if (e.getSource() == red){
        panel.setBackground(Color.red);
       }

       if (e.getSource() == blue){
        panel.setBackground(Color.blue);
       }

       if (e.getSource() == green){
        panel.setBackground(Color.green);
       }
  

}
   
}
