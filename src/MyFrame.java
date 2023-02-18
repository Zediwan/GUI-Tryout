import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("This is the title");

        ImageIcon img = new ImageIcon("Icon");
        this.setIconImage(img.getImage()); //change image of icon
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when the x Button is pressed, exit out of application
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //disables people from exiting with the x button

        this.setVisible(true);
        this.setSize(420,420);
        this.getContentPane().setBackground(new Color(204,204,170));
        //frame.setResizable(false); //prevents frame from being resized
    }
}
