package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPage2 extends JFrame implements ActionListener {
    String formNo;

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

    JTextField textPan, textAadhaar;

    JRadioButton seniorYes, seniorNo, existingYes, existingNo;

    JButton next;

    SignupPage2(String first){
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
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel label4 = new JLabel("Category");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        label4.setBounds(100, 170, 100, 30);
        add(label4);

        String[] category = {"General", "OBC", "SC", "ST", "Other" };
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel label5 = new JLabel("Income");
        label5.setFont(new Font("Raleway", Font.BOLD, 18));
        label5.setBounds(100, 220, 100, 30);
        add(label5);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel label6 = new JLabel("Educational");
        label6.setFont(new Font("Raleway", Font.BOLD, 18));
        label6.setBounds(100, 270, 150, 30);
        add(label6);

        String[] educational = {"Non Graduate", "Graduate", "Post Graduation", "Doctorate", "Other" };
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel label7 = new JLabel("Educational");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        label7.setBounds(100, 320, 150, 30);
        add(label7);

        String[] occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other" };
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 18));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        JLabel label8 = new JLabel("PAN Number : ");
        label8.setFont(new Font("Raleway", Font.BOLD,18));
        label8.setBounds(100,390,150,30);
        add(label8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel label9 = new JLabel("Aadhaar Number : ");
        label9.setFont(new Font("Raleway", Font.BOLD,18));
        label9.setBounds(100,440,180,30);
        add(label9);

        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhaar.setBounds(350,440,320,30);
        add(textAadhaar);

        JLabel label10 = new JLabel("Senior Citizen : ");
        label10.setFont(new Font("Raleway", Font.BOLD,18));
        label10.setBounds(100,490,180,30);
        add(label10);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setFont(new Font("Raleway", Font.BOLD,14));
        seniorYes.setBackground(new Color(252,208,76));
        seniorYes.setBounds(350,490,100,30);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setFont(new Font("Raleway", Font.BOLD,14));
        seniorNo.setBackground(new Color(252,208,76));
        seniorNo.setBounds(460,490,100,30);
        add(seniorNo);

        JLabel label11 = new JLabel("Existing Account : ");
        label11.setFont(new Font("Raleway", Font.BOLD,18));
        label11.setBounds(100,540,180,30);
        add(label11);

        existingYes = new JRadioButton("Yes");
        existingYes.setFont(new Font("Raleway", Font.BOLD,14));
        existingYes.setBackground(new Color(252,208,76));
        existingYes.setBounds(350,540,100,30);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo.setFont(new Font("Raleway", Font.BOLD,14));
        existingNo.setBackground(new Color(252,208,76));
        existingNo.setBounds(460,540,100,30);
        add(existingNo);

        ButtonGroup seniorButton = new ButtonGroup();
        seniorButton.add(seniorYes);
        seniorButton.add(seniorNo);

        ButtonGroup existingAccButton = new ButtonGroup();
        existingAccButton.add(existingYes);
        existingAccButton.add(existingNo);

        JLabel label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Raleway", Font.BOLD,18));
        label12.setBounds(700,10,100,30);
        add(label12);

        JLabel label13 = new JLabel(formNo);
        label13.setFont(new Font("Raleway", Font.BOLD,18));
        label13.setBounds(760,10,60,30);
        add(label13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupPage2("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
