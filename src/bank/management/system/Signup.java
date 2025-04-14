package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName, textFathersName, textEmail, textAddress, textCity, textPin, textState;

    JDateChooser dateChooser;

    Random random = new Random();

    long first4 = ( random.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    JRadioButton maleButton, femaleButton, married, unmarried, other;

    JButton next;

    Signup() {
        super("Application Form");

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(25, 10, 100, 100);
        add(bankImage);

        JLabel jLabel1 = new JLabel("Application Form Number: " + first);
        jLabel1.setBounds(130, 20, 600, 40);
        jLabel1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Page 1");
        jLabel2.setFont(new Font("Raleway", Font.BOLD, 22));
        jLabel2.setBounds(300, 70, 600, 30);
        add(jLabel2);

        JLabel jLabel3 = new JLabel("Personal Details");
        jLabel3.setFont(new Font("Raleway", Font.BOLD, 22));
        jLabel3.setBounds(275, 100, 600, 30);
        add(jLabel3);

        JLabel name1 = new JLabel("Name:");
        name1.setFont(new Font("Raleway", Font.BOLD, 20));
        name1.setBounds(100, 190, 100, 30);
        add(name1);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel fathersName1 = new JLabel("Father's Name:");
        fathersName1.setFont(new Font("Raleway", Font.BOLD, 20));
        fathersName1.setBounds(100, 240, 200, 30);
        add(fathersName1);

        textFathersName = new JTextField();
        textFathersName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFathersName.setBounds(300, 240, 400, 30);
        add(textFathersName);

        JLabel DOB1 = new JLabel("Date Of Birth:");
        DOB1.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB1.setBounds(100, 330, 200, 30);
        add(DOB1);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("Raleway", Font.BOLD, 14));
        maleButton.setBounds(300, 290, 60, 30);
        maleButton.setBackground(new Color(222, 255, 228));
        add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("Raleway", Font.BOLD, 14));
        femaleButton.setBounds(450, 290, 120, 30);
        femaleButton.setBackground(new Color(222, 255, 228));
        add(femaleButton);

        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(maleButton);
        groupGender.add(femaleButton);

        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailLabel.setBounds(100, 390, 200, 30);
        add(emailLabel);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel maritialLabel = new JLabel("Marital Status:");
        maritialLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        maritialLabel.setBounds(100, 440, 200, 30);
        add(maritialLabel);

        married = new JRadioButton("Married");
        married.setBounds(300,440,100,30);
        married.setBackground(new Color(222,255,228));
        married.setFont(new Font("Raleway", Font.BOLD,14));
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(new Color(222,255,228));
        unmarried.setBounds(450,440,100,30);
        unmarried.setFont(new Font("Raleway", Font.BOLD,14));
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBackground(new Color(222,255,228));
        other.setBounds(635,440,100,30);
        other.setFont(new Font("Raleway", Font.BOLD,14));
        add(other);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(married);
        buttonGroup1.add(unmarried);
        buttonGroup1.add(other);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setBounds(100, 490, 200, 30);
        add(addressLabel);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(100, 540, 200, 30);
        add(cityLabel);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel pinLabel = new JLabel("Pin Code:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinLabel.setBounds(100, 590, 200, 30);
        add(pinLabel);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(100, 640, 200, 30);
        add(stateLabel);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fathersName = textFathersName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(maleButton.isSelected())
            gender = "Male";
        else if(femaleButton.isSelected())
            gender = "Female";
        String email = textEmail.getText();
        String maritial = null;
        if(married.isSelected())
            maritial = "Married";
        else if(unmarried.isSelected())
            maritial = "Unmarried";
        else if(other.isSelected())
            maritial = "Other";
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Conn con1 = new Conn();
                String q = "insert into signup values('"+formNo+"', '"+name+"','"+fathersName+"','"+dob+"','"+gender+"','"+email+"','"+maritial+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                con1.statement.executeUpdate(q);
                new SignupPage2(first);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
