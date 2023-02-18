import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    public MyFrame(){
        /*
        Chapter 1 frames
        this.setTitle("This is the title");

        ImageIcon img = new ImageIcon("Icon");
        this.setIconImage(img.getImage()); //change image of icon
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when the x Button is pressed, exit out of application
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //disables people from exiting with the x button

        this.setVisible(true);
        this.setSize(420,420);
        this.getContentPane().setBackground(new Color(204,204,170));
        //frame.setResizable(false); //prevents frame from being resized
         */
        this.label = new JLabel();
        ImageIcon icon = new ImageIcon("Evolution, digital art.png");
        this.label.setIcon(icon);
        this.label.setBounds(150,250,150,150);
        this.label.setVisible(false);

        this.button = new JButton();
        this.button.setBounds(100, 100,250,100);
        this.button.setText("Toilet");
        //button.addActionListener(e -> System.out.println("poo"));
        this.button.addActionListener(this);
        this.button.setFocusable(false);
        this.button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //System.out.println("poo");
            //button.setEnabled(false);
            this.label.setVisible(true);
        }
    }
}
