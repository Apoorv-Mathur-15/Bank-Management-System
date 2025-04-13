package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel jLabel1, jLabel2, jLabel3;

    JTextField textField;

    JPasswordField passwordField;

    JButton signInButton, clearButton, signUpButton;
    Login() {
        super("Banking Management System");

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(350, 10, 100, 100);
        add(bankImage);

        ImageIcon card_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image card = card_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon card_image = new ImageIcon(card);
        JLabel cardImage = new JLabel(card_image);
        cardImage.setBounds(630, 350, 100, 100);
        add(cardImage);

        jLabel1 = new JLabel("WELCOME TO ATM");
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setFont(new Font("Aptos Narrow", Font.BOLD, 38));
        jLabel1.setBounds(230, 125, 450, 40);
        add(jLabel1);

        jLabel2 = new JLabel("Card No.:");
        jLabel2.setFont(new Font("Ralway", Font.BOLD, 28));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setBounds(150, 190, 375, 30);
        add(jLabel2);

        textField = new JTextField(15);
        textField.setBounds(325, 190, 230, 30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        jLabel3 = new JLabel("Pin:");
        jLabel3.setFont(new Font("Ralway", Font.BOLD, 28));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setBounds(150, 250, 375, 30);
        add(jLabel3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        signInButton = new JButton("Sign In");
        signInButton.setFont(new Font("Arial", Font.BOLD, 14));
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(Color.BLACK);
        signInButton.setBounds(325, 300, 100, 30);
        signInButton.addActionListener(this);
        add(signInButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        clearButton.setBounds(455, 300, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 14));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(Color.BLACK);
        signUpButton.setBounds(325, 350, 230, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        ImageIcon bg_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image background = bg_image_orig.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon bg_image = new ImageIcon(background);
        JLabel bgImage = new JLabel(bg_image);
        bgImage.setBounds(0,0,850,480);
        add(bgImage);

        setLayout(null);
        setSize(850, 480);
        setLocation(475, 250);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == signInButton){
                
            } else if (e.getSource() == clearButton) {
                textField.setText("");
                passwordField.setText("");
            } else if(e.getSource() == signUpButton) {

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
