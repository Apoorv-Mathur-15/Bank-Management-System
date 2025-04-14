package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {
    String formNo;

    JComboBox comboBox;

    Signup2(String first){
        super("Application Form");

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(150, 0, 100, 100);
        add(bankImage);

        this.formNo = formNo;

        JLabel label1 = new JLabel("Page 2:");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(300, 0, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("Additional Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(300, 60, 600, 40);
        add(label2);

        JLabel label3 = new JLabel("Religion");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        label3.setBounds(100, 120, 100, 30);
        add(label3);

        String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252, 208, 076));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);


        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 076));
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
