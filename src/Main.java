import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        //MyFrame mF = new MyFrame();
        /*
        JFrame frame = new JFrame(); //Creates a Frame
        frame.setTitle("This is the title");

        ImageIcon img = new ImageIcon("Icon");
        frame.setIconImage(img.getImage()); //change image of icon
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when the x Button is pressed, exit out of application
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //disables people from exiting with the x button

        frame.setVisible(true);
        frame.setSize(420,420);
        frame.getContentPane().setBackground(new Color(204,204,170));
        //frame.setResizable(false); //prevents frame from being resized
        */
        /*
        ImageIcon image = new ImageIcon("Evolution, digital art.png");
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        JLabel label = new JLabel();        //text can also be given in the constructor
        label.setText("This is text");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN,40));
        label.setIconTextGap(5);            //set gap of text to img
        label.setBackground(Color.black);
        label.setOpaque(true);              //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds((420-250)/2,(420-250)/2,250,250); //set x and y position within frame as well as dimensions
        */
        JLabel label = new JLabel();
        label.setText("This is grass");
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,50,50);

        JPanel panel1  = new JPanel();
        panel1.setBackground(new Color(138, 184, 99));
        panel1.setBounds(0,0,100,100);
        panel1.setLayout(null);

        JPanel panel2  = new JPanel();
        panel2.setBackground(new Color(112, 156, 63));
        panel2.setBounds(100,0,100,100);
        panel2.setLayout(null);

        JPanel panel3  = new JPanel();
        panel3.setBackground(new Color(55, 94, 42));
        panel3.setBounds(0,100,200,100);
        panel3.setLayout(null);

        JFrame frame = new JFrame();        //Creates a Frame
        frame.setVisible(true);
        frame.setTitle("This is the title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when the x Button is pressed, exit out of application
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(179, 212, 142));
        panel3.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        //frame.add(label);
        //add components before packing otherwise won't work
        //frame.pack();                       //makes the frame the minimum needed size to fit all components

    }
}
