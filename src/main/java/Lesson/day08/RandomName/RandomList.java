package Lesson.day08.RandomName;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomList implements ActionListener {

    private JTextField  jame ;
    private JButton jButton;

    private RandomList(){   //构造方法 视图
        JFrame list = new JFrame("随机点名");
        list.setSize(500,500);

    }



    @Override   //    逻辑
    public void actionPerformed(ActionEvent e) {
    }



}
