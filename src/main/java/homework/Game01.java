package homework;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

    public class Game01 extends JFrame {
        int x = 0, y = 0;

        int a = 0;

        int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;;

        boolean l = true, m = true, result = false;

        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;

        int s[] = new int[10], jj[] = new int[10];

        JButton restart, change;

        JLabel jl;

        public Game01() {
            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            restart = new JButton("重新开始");
            c.add(restart);
            change = new JButton("重新开始并先手");
            c.add(change);
            jl = new JLabel();
            c.add(jl, BorderLayout.SOUTH);
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent event) {
                    if (event.isAltDown()) {
                        repaint();
                    }
                    x = event.getPoint().x;
                    y = event.getPoint().y;
                    int a = mm(x, y);
                    if (result) {
                        jl.setForeground(Color.RED);
                        jl
                                .setText(" 游戏已结束,请重新开始 ");

                    }

                    else {
                        if (s[a] == 1) {
                            jl.setForeground(Color.RED);
                            jl.setText(" 此位置有棋子,请另选位置重新下棋 ");
                        } else {
                            l = false;
                            if (a == 1)
                                a1 = 1;
                            if (a == 2)
                                a2 = 1;
                            if (a == 3)
                                a3 = 1;
                            if (a == 4)
                                a4 = 1;
                            if (a == 5)
                                a5 = 1;
                            if (a == 6)
                                a6 = 1;
                            if (a == 7)
                                a7 = 1;
                            if (a == 8)
                                a8 = 1;
                            if (a == 9)
                                a9 = 1;
                            jl.setText("");
                            repaint();
                        }
                    }
                    s[a] = 1;
                }
            });

            change.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    for (int i = 0; i < s.length; i++) {
                        s[i] = 0;
                        jj[i] = 0;
                    }
                    l = true;
                    repaint();
                    result = false;
                    m = true;
                    jl.setForeground(Color.black);
                    jl
                            .setText(" 红队先下 ");
                }
            });

            change.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    for (int i = 0; i < s.length; i++) {
                        s[i] = 0;
                        jj[i] = 0;
                    }
                    l = true;
                    repaint();
                    result = false;
                    m = false;
                    jl.setForeground(Color.black);
                    jl
                            .setText(" 蓝队先下 ");
                }
            });

            setSize(500, 500);
            setVisible(true);
        }
            //棋
        public void paint(Graphics g) {
            if (l) {
                super.paint(g);
                int x = 100, y = 100, c = 300, k = 300;
                for (int i = 0; i < 300; i += 100)
                    g.drawRect(x, y + i, c, k - i);
                for (int i = 0; i < 300; i += 100)
                    g.drawRect(x + i, y, c - i, k);
            } else {
                jl.setForeground(Color.black);
                if (m) {
                    g.setColor(Color.red);
                    if (a1 == 1) {
                        g.drawLine(120, 120, 180, 180);
                        g.drawLine(180, 120, 120, 180);
                        a1 = 0;
                        jj[1] = 1;
                    }
                    if (a2 == 1) {
                        g.drawLine(220, 120, 280, 180);
                        g.drawLine(280, 120, 220, 180);
                        a2 = 0;
                        jj[2] = 1;
                    }

                    if (a3 == 1) {
                        g.drawLine(320, 120, 380, 180);
                        g.drawLine(380, 120, 320, 180);
                        a3 = 0;
                        jj[3] = 1;
                    }
                    if (a4 == 1) {
                        g.drawLine(120, 220, 180, 280);
                        g.drawLine(180, 220, 120, 280);
                        a4 = 0;
                        jj[4] = 1;
                    }
                    if (a5 == 1) {
                        g.drawLine(220, 220, 280, 280);
                        g.drawLine(280, 220, 220, 280);
                        a5 = 0;
                        jj[5] = 1;
                    }
                    if (a6 == 1) {
                        g.drawLine(320, 220, 380, 280);
                        g.drawLine(380, 220, 320, 280);
                        a6 = 0;
                        jj[6] = 1;
                    }
                    if (a7 == 1) {
                        g.drawLine(120, 320, 180, 380);
                        g.drawLine(180, 320, 120, 380);
                        a7 = 0;
                        jj[7] = 1;
                    }
                    if (a8 == 1) {
                        g.drawLine(220, 320, 280, 380);
                        g.drawLine(280, 320, 220, 380);
                        a8 = 0;
                        jj[8] = 1;
                    }
                    if (a9 == 1) {
                        g.drawLine(320, 320, 380, 380);
                        g.drawLine(380, 320, 320, 380);
                        a9 = 0;
                        jj[9] = 1;
                    }
                    m = false;
                    jl
                            .setText(" 蓝队下棋 ");
                } else {
                    g.setColor(Color.blue);
                    if (a1 == 1) {
                        g.drawOval(125, 125, 50, 50);
                        a1 = 0;
                        jj[1] = 2;
                    }
                    if (a2 == 1) {
                        g.drawOval(225, 125, 50, 50);
                        a2 = 0;
                        jj[2] = 2;
                    }
                    if (a3 == 1) {
                        g.drawOval(325, 125, 50, 50);
                        a3 = 0;
                        jj[3] = 2;
                    }
                    if (a4 == 1) {
                        g.drawOval(125, 225, 50, 50);
                        a4 = 0;
                        jj[4] = 2;
                    }
                    if (a5 == 1) {
                        g.drawOval(225, 225, 50, 50);
                        a5 = 0;
                        jj[5] = 2;
                    }
                    if (a6 == 1) {
                        g.drawOval(325, 225, 50, 50);
                        a6 = 0;
                        jj[6] = 2;
                    }
                    if (a7 == 1) {
                        g.drawOval(125, 325, 50, 50);
                        a7 = 0;
                        jj[7] = 2;
                    }
                    if (a8 == 1) {
                        g.drawOval(225, 325, 50, 50);
                        a8 = 0;
                        jj[8] = 2;
                    }
                    if (a9 == 1) {
                        g.drawOval(325, 325, 50, 50);
                        a9 = 0;
                        jj[9] = 2;
                    }
                    m = true;
                    jl
                            .setText(" 红队下棋 ");
                }
                dd();
            }
        }

        public int mm(int x, int y) {
            if (x >= 100 && x < 200 && y >= 100 && y < 200)
                a = 1;
            else if (x >= 200 && x < 300 && y >= 100 && y < 200)
                a = 2;
            else if (x >= 300 && x < 400 && y >= 100 && y < 200)
                a = 3;
            else if (x >= 100 && x < 200 && y >= 200 && y < 300)
                a = 4;
            else if (x >= 200 && x < 300 && y >= 200 && y < 300)
                a = 5;
            else if (x >= 300 && x < 400 && y >= 200 && y < 300)
                a = 6;
            else if (x >= 100 && x < 200 && y >= 300 && y < 400)
                a = 7;
            else if (x >= 200 && x < 300 && y >= 300 && y < 400)
                a = 8;
            else if (x >= 300 && x < 400 && y >= 300 && y < 400)
                a = 9;
            else
                a = 0;
            return a;
        }

            //胜负判断
        public void dd() {

            if (jj[1] == 1 && jj[2] == 1 && jj[3] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[4] == 1 && jj[5] == 1 && jj[6] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[7] == 1 && jj[8] == 1 && jj[9] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[1] == 1 && jj[5] == 1 && jj[9] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获获胜 ");
                result = true;
            }
            if (jj[3] == 1 && jj[5] == 1 && jj[7] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[1] == 1 && jj[4] == 1 && jj[7] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[2] == 1 && jj[5] == 1 && jj[8] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }
            if (jj[3] == 1 && jj[6] == 1 && jj[9] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 红方获胜 ");
                result = true;
            }

            if (jj[1] == 2 && jj[2] == 2 && jj[3] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[4] == 2 && jj[5] == 2 && jj[6] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[7] == 2 && jj[8] == 2 && jj[9] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[1] == 2 && jj[5] == 2 && jj[9] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[3] == 2 && jj[5] == 2 && jj[7] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[1] == 2 && jj[4] == 2 && jj[7] == 2) {
                jl.setForeground(Color.RED);
                jl.setText("蓝方获胜 ");
                result = true;
            }
            if (jj[2] == 2 && jj[5] == 2 && jj[8] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (jj[3] == 2 && jj[6] == 2 && jj[9] == 2) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 蓝方获胜 ");
                result = true;
            }
            if (s[1] == 1 && s[2] == 1 && s[3] == 1 && s[4] == 1 && s[5] == 1
                    && s[6] == 1 && s[7] == 1 && s[8] == 1 && s[9] == 1) {
                jl.setForeground(Color.RED);
                jl
                        .setText(" 双方都没获胜,游戏结束 ");
                result = true;
            }
            System.out.println(jj[2]);
        }

        public static void main(String[] args) {
            Game01 s = new Game01();
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }



