package day10;

import day09.MySQL;
import javafx.scene.chart.XYChart;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;


public class SQLClient extends JFrame {

    private JTextArea sqlJTextArea;
    private JTextField outputJTextArea;
    private JTable resultTable;
    private JScrollPane sqlJScrollPane,outputJScrollPane,resultJScrollPane;
    private JPanel main,south;
    private Object DefaultTableModel;


    public SQLClient(){
        initComponent();
        initlistener();
    }

    public void initComponent(){
        setTitle("MySQL Client");
        setExtendedState(MAXIMIZED_BOTH);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = dimension.width;
        int height = dimension.height;
        Font font = new Font("consolas",Font.PLAIN,25);

//        sqlJTextField
        sqlJTextArea = new JTextArea();
        sqlJTextArea.setBackground(Color.BLACK);
        sqlJTextArea.setForeground(Color.WHITE);
        sqlJTextArea.setFont(font);
        sqlJTextArea.setCaretColor(Color.WHITE);
        sqlJTextArea.setCaretPosition(sqlJTextArea.getDocument().getLength());

        sqlJScrollPane = new JScrollPane(sqlJTextArea);
        sqlJScrollPane.setPreferredSize(new Dimension(width,height/2));

//       outputJTextField
        outputJTextArea = new JTextField();
        outputJTextArea.setBackground(Color.WHITE);
        outputJTextArea.setForeground(Color.BLACK);
        outputJTextArea.setFont(font);
        outputJTextArea.setEditable(false);

        outputJScrollPane = new JScrollPane(outputJScrollPane);
        outputJScrollPane.setPreferredSize(new Dimension(width/2,(int)(height/2.5)));

//        result
        String[] columnsNames = {
                "ID",
                "USERNAME",
                "PASSWORD"
        };
        String[][] data = {
                {"1", "Tom", "123"},
                {"2", "Jerry", "abc"}
        };

        DefaultTableModel defaultTableModel= new DefaultTableModel(data,columnsNames);

        resultTable = new JTable(defaultTableModel);
        resultTable.setBackground(Color.GRAY);
        resultTable.setForeground(Color.BLACK);
        resultTable.setFont(font);
        resultTable.getTableHeader().setFont(font);
        resultTable.setRowHeight(30);

        resultJScrollPane = new JScrollPane(resultTable);
        resultJScrollPane.setPreferredSize(new Dimension(width/2,(int)(height/2.5)));



        south = new JPanel();
        south.setLayout(new BorderLayout());
        south.setPreferredSize(new Dimension(width,(int)(height/2.5)));
        south.add(outputJScrollPane,BorderLayout.WEST);
        south.add(resultJScrollPane,BorderLayout.EAST);



        main = new JPanel();
        main.setLayout(new BorderLayout());
        main.add(sqlJScrollPane,BorderLayout.NORTH);
        main.add(south,BorderLayout.SOUTH);

        add(main);
        setVisible(true);
    }

    public void initlistener(){

    }

    public static void main(String[] args) {
        new SQLClient();
    }
}
