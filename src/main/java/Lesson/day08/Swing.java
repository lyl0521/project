package Lesson.day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    public static void main(String[] args) {
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField("0",5);

        JFrame jFrame = new JFrame("加法运算");
        jFrame.setSize(500,500);

        JLabel jb = new JLabel("+");
        jb.setVisible(true);
        JPanel p1=new JPanel();
        jFrame.setContentPane(p1);
        p1.setLayout(new FlowLayout());

        p1.add(field1 );
        p1.add(jb);
        p1.add(field2);
        p1.add(field3);

        JButton jButton = new JButton("add");
        jButton.addActionListener(new ActionListener() {   // 匿名内部类

            @Override
            public void actionPerformed(ActionEvent e) {
                int x,y;
                x = Integer.parseInt(field1.getText());
                y = Integer.parseInt(field2.getText());
                field3.setText(String.valueOf(x + y));



            }

        });

        jFrame.add(jButton);


        jFrame.setVisible(true);
    }
}
