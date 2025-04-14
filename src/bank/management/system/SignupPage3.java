package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPage3 extends JFrame implements ActionListener {


    SignupPage3(String first){
        super("Application Form");

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(150, 0, 100, 100);
        add(bankImage);



        setSize(850, 800);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupPage3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
