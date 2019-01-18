package Lesson.day08.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends JFrame implements ActionListener {
    private JPanel main;
    private JTextField account;
    private JTextField password ;
    private CardLayout cardLayout;

    private First() {
        initComponent(cardLayout);
    }

    private void initComponent(CardLayout cardLayout) {

        setTitle("Login");
        setSize(500,500);
        cardLayout = new CardLayout();


        JLabel lb1 = new JLabel("account");
        lb1.setBounds(100,100,50,50);

        JLabel lb2 = new JLabel("password");
        lb2.setBounds(90,200,100,50);


        account = new JTextField();
        account.setBounds(150,100,300,50);
        account.setHorizontalAlignment(SwingConstants.CENTER);

        password = new JTextField();
        password.setBounds(150,200,300,50);
        password.setHorizontalAlignment(SwingConstants.CENTER);

        JButton jButton = new JButton("Log");
        jButton.setBounds(225,280,50,30);
        jButton.addActionListener(this);
        setVisible(true);



        add(lb1);
        add(account);
        add(lb2);
        add(password);
        add(jButton);

        add(main);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x = account.getText();
        String y = password.getText();
        String accountx = "user";
        String passwordy = "123456";
        if(x.equals(accountx) && y.equals(passwordy)){

            cardLayout.show(main, "home");


        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new First();

    }
}