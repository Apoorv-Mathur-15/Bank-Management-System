package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {
    String formNo;

    Signup2(String first){
        super("Application Form");

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(150, 0, 100, 100);
        add(bankImage);

        this.formNo = formNo;
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(2, 250, 155));
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
