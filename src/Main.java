import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args){
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
        /*
        Chapter 3 Panels
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

         */
        /*
        Chapter 4 Buttons:
        MyFrame frame = new MyFrame();
         */
        /*
        Chapter 5: Border layout
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //---------sub panels------------------------------------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout(10,10));

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
         */
        /*
        Chapter 6: Flow Layout Manager
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
         */
        /*
        Chapter 7: Grid Layout Manager

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(4));
        layeredPane.add(label3, Integer.valueOf(3));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
         */
        /*
        Chapter 8: new Windows
        LaunchPage launchPage = new LaunchPage();
         */
        /*
        Chapter 9: Dialog Window
        //JOptionPane.showMessageDialog(null,"Test", "Computer", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"More Info", "Computer", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Question?", "Computer", JOptionPane.QUESTION_MESSAGE);
        //while(true){JOptionPane.showMessageDialog(null,"Your Computer has a virus!", "Hacker", JOptionPane.WARNING_MESSAGE);}
        //JOptionPane.showMessageDialog(null,"Something went wrong!", "Computer", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null,"Are you sure?", "Computer", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?");
        //JOptionPane.showMessageDialog(null,"Hello "+name, "Computer", JOptionPane.PLAIN_MESSAGE);
        String[] responses = {"Go back", "Restart", "Stop"};
        JOptionPane.showOptionDialog(null, "Choose an option", "Menu", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
         */

    }
}
