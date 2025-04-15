package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPage3 extends JFrame implements ActionListener {

    JRadioButton radioSavings, radioFixedDeposit, radiioCurrent, radioRecurDeposit;

    JCheckBox checkATM, checkInternetBanking, checkMobileBanking, checkEmailAlerts, checkChequeBook, checkEStatement;

    JButton submit, cancel;

    String formNo;

    SignupPage3(String formNo){
        super("Application Form");

        this.formNo = formNo;

        ImageIcon bank_image_orig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank = bank_image_orig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bank_image = new ImageIcon(bank);
        JLabel bankImage = new JLabel(bank_image);
        bankImage.setBounds(150, 0, 100, 100);
        add(bankImage);

        JLabel label1 = new JLabel("Page 3:");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        label1.setBounds(280,40,400,40);
        add(label1);

        JLabel label2 = new JLabel("Account Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(280,70,400,40);
        add(label2);

        JLabel label3 = new JLabel("Account Type");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        label3.setBounds(100,140,200,30);
        add(label3);

        radioSavings = new JRadioButton("Saving Account");
        radioSavings.setFont(new Font("Raleway",Font.BOLD,16));
        radioSavings.setBackground(new Color(215,252,252));
        radioSavings.setBounds(100,180,150,30);
        add(radioSavings);

        radioFixedDeposit = new JRadioButton("Fixed Deposit Account");
        radioFixedDeposit.setFont(new Font("Raleway",Font.BOLD,16));
        radioFixedDeposit.setBackground(new Color(215,252,252));
        radioFixedDeposit.setBounds(350,180,300,30);
        add(radioFixedDeposit);

        radiioCurrent = new JRadioButton("Current Account");
        radiioCurrent.setFont(new Font("Raleway",Font.BOLD,16));
        radiioCurrent.setBackground(new Color(215,252,252));
        radiioCurrent.setBounds(100,220,250,30);
        add(radiioCurrent);

        radioRecurDeposit = new JRadioButton("Recurring Deposit Account");
        radioRecurDeposit.setFont(new Font("Raleway",Font.BOLD,16));
        radioRecurDeposit.setBackground(new Color(215,252,252));
        radioRecurDeposit.setBounds(350,220,250,30);
        add(radioRecurDeposit);

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(radioSavings);
        accountTypeGroup.add(radioFixedDeposit);
        accountTypeGroup.add(radiioCurrent);
        accountTypeGroup.add(radioRecurDeposit);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        checkATM = new JCheckBox("ATM CARD");
        checkATM.setBackground(new Color(215,252,252));
        checkATM.setFont(new Font("Raleway",Font.BOLD,16));
        checkATM.setBounds(100,500,200,30);
        add(checkATM);

        checkInternetBanking = new JCheckBox("Internet Banking");
        checkInternetBanking.setBackground(new Color(215,252,252));
        checkInternetBanking.setFont(new Font("Raleway",Font.BOLD,16));
        checkInternetBanking.setBounds(350,500,200,30);
        add(checkInternetBanking);

        checkMobileBanking = new JCheckBox("Mobile Banking");
        checkMobileBanking.setBackground(new Color(215,252,252));
        checkMobileBanking.setFont(new Font("Raleway",Font.BOLD,16));
        checkMobileBanking.setBounds(100,550,200,30);
        add(checkMobileBanking);

        checkEmailAlerts = new JCheckBox("EMAIL Alerts");
        checkEmailAlerts.setBackground(new Color(215,252,252));
        checkEmailAlerts.setFont(new Font("Raleway",Font.BOLD,16));
        checkEmailAlerts.setBounds(350,550,200,30);
        add(checkEmailAlerts);

        checkChequeBook = new JCheckBox("Cheque Book");
        checkChequeBook.setBackground(new Color(215,252,252));
        checkChequeBook.setFont(new Font("Raleway",Font.BOLD,16));
        checkChequeBook.setBounds(100,600,200,30);
        add(checkChequeBook);

        checkEStatement = new JCheckBox("E-Statement");
        checkEStatement.setBackground(new Color(215,252,252));
        checkEStatement.setFont(new Font("Raleway",Font.BOLD,16));
        checkEStatement.setBounds(350,600,200,30);
        add(checkEStatement);

        JCheckBox checkDeclaration = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        checkDeclaration.setBackground(new Color(215,252,252));
        checkDeclaration.setFont(new Font("Raleway",Font.BOLD,12));
        checkDeclaration.setBounds(100,680,600,20);
        add(checkDeclaration);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

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
