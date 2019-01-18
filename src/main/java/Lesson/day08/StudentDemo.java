package Lesson.day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDemo extends JFrame implements ActionListener {

    private JPanel main;
    private JTextField account;
    private JTextField password ;
    private CardLayout cardLayout;

    private StudentDemo() {
        initComponent();
    }

    private void initComponent() {
        setTitle("Student Demo");
        setSize(500, 500);

        cardLayout = new CardLayout();

        main = new JPanel(cardLayout);

        JLabel lb1 = new JLabel("account");
        lb1.setBounds(100,100,50,50);

        JLabel lb2 = new JLabel("password");
        lb2.setBounds(90,200,100,50);


        JTextField account = new JTextField();
        account.setBounds(150,100,300,50);
        account.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField password = new JTextField();
        password.setBounds(150,200,300,50);
        password.setHorizontalAlignment(SwingConstants.CENTER);


        JPanel login = new JPanel();
        JPanel home = new JPanel();

        JButton loginButton = new JButton("LOGIN");
        loginButton.addActionListener(this);
        login.add(loginButton);

        JLabel homeLabel = new JLabel("HOME");
        home.add(homeLabel);

        main.add(login, "login");
        main.add(home, "home");

        add(lb1);
        add(account);
        add(lb2);
        add(password);
        add(main);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x = account.getText();
        String y = password.getText();
        String accountx = "user";
        String passwordy = "123456";
        if (x.equals(accountx) && y.equals(passwordy)) {

            cardLayout.show(main, "home");
        }
    }

    public static void main(String[] args) {
        new StudentDemo();
    }
}
