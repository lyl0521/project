package day09;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame implements ActionListener {

    public Client(){
        initComponent();
    }

    private void initComponent() {
        setTitle("MySQL Client");
        setExtendedState(MAXIMIZED_BOTH);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Font font = new Font("consolas",Font.PLAIN,24);

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

        TextArea sqlTextArea = new TextArea();
        sqlTextArea.setPreferredSize(new Dimension(dimension.width,dimension.height/2));
        sqlTextArea.setFont(font);
        sqlTextArea.setBackground(Color.lightGray);
        sqlTextArea.setForeground(Color.BLACK);

        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(dimension.width,dimension.height/2));

        north.add(sqlTextArea);

        TextArea outputTextArea = new TextArea();
        outputTextArea.setPreferredSize(new Dimension(dimension.width/3,dimension.height/2));
        outputTextArea.setBackground(Color.WHITE);
        outputTextArea.setFont(font);
        outputTextArea.setForeground(Color.BLACK);

        JTable resultTable = new JTable();
        resultTable.setPreferredSize(new Dimension(dimension.width/3*2,dimension.height/2));
        resultTable.setFont(font);
        resultTable.setBackground(Color.WHITE);
        resultTable.setForeground(Color.BLACK);

        JPanel south = new JPanel();
        south.setLayout(new BorderLayout());
        south.setPreferredSize(new Dimension(dimension.width,dimension.height/2));



        south.add(outputTextArea,BorderLayout.WEST);
        south.add(resultTable,BorderLayout.EAST);

        main.add(north,BorderLayout.NORTH);
        main.add(south,BorderLayout.SOUTH);

        add(main);
        setVisible(true);


    }

    public static void main(String[] args) {
        Client client = new Client();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
