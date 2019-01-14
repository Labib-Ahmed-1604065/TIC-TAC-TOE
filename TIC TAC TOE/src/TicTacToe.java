
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author L
 */
public class TicTacToe extends JFrame implements ActionListener {

    public int playerSelector = 1;
    public String[] win = new String[9];
    public int draw = 1;

    public TicTacToe() {

        JFrame jf = new JFrame("Tic Tac Toe by Labib Ahmed 1604065");
        JPanel jp = new JPanel(new GridLayout(3, 3));
        JButton[] jb = new JButton[9];
        Font f=new Font("Times New Roman",Font.BOLD,72);
        for (int i = 0; i < 9; i++) {
            jb[i] = new JButton("");
            jb[i].setFont(f);
        }
        for (int i = 0; i < 9; i++) {
            jp.add(jb[i]);
        }

        jb[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[0].setText("O");
                    jb[0].setEnabled(false);
                    playerSelector += 1;
                    win[0] = "o";

                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {

                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[0].setText("X");
                    jb[0].setEnabled(false);
                    playerSelector += 1;
                    win[0] = "x";

                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[1].setText("O");
                    jb[1].setEnabled(false);
                    playerSelector += 1;
                    win[1] = "o";

                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[1].setText("X");
                    jb[1].setEnabled(false);
                    playerSelector += 1;
                    win[1] = "x";

                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[2].setText("O");
                    jb[2].setEnabled(false);
                    playerSelector += 1;
                    win[2] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[2].setText("X");
                    jb[2].setEnabled(false);
                    playerSelector += 1;
                    win[2] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw ");
                    System.exit(0);
                }
            }
        });

        jb[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[3].setText("O");
                    jb[3].setEnabled(false);
                    playerSelector += 1;
                    win[3] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[3].setText("X");
                    jb[3].setEnabled(false);
                    playerSelector += 1;
                    win[3] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[4].setText("O");
                    jb[4].setEnabled(false);
                    playerSelector += 1;
                    win[4] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[4].setText("X");
                    jb[4].setEnabled(false);
                    playerSelector += 1;
                    win[4] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[5].setText("O");
                    jb[5].setEnabled(false);
                    playerSelector += 1;
                    win[5] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[5].setText("X");
                    jb[5].setEnabled(false);
                    playerSelector += 1;
                    win[5] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[6].setText("O");
                    jb[6].setEnabled(false);
                    playerSelector += 1;
                    win[6] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[6].setText("X");
                    jb[6].setEnabled(false);
                    playerSelector += 1;
                    win[6] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[7].setText("O");
                    jb[7].setEnabled(false);
                    playerSelector += 1;
                    win[7] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[7].setText("X");
                    jb[7].setEnabled(false);
                    playerSelector += 1;
                    win[7] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }
            }
        });

        jb[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if (playerSelector % 2 == 1) {
                    jb[8].setText("O");
                    jb[8].setEnabled(false);
                    playerSelector += 1;
                    win[8] = "o";
                    if (win[0] == "o" && win[1] == "o" && win[2] == "o" || win[3] == "o" && win[4] == "o" && win[5] == "o" || win[6] == "o" && win[7] == "o" && win[8] == "o" || win[0] == "o" && win[3] == "o" && win[6] == "o" || win[1] == "o" && win[4] == "o" && win[7] == "o" || win[2] == "o" && win[5] == "o" && win[8] == "o" || win[0] == "o" && win[4] == "o" && win[8] == "o" || win[2] == "o" && win[4] == "o" && win[6] == "o") {
                        JOptionPane.showMessageDialog(null, "Player 1 won ");
                        System.exit(0);
                    }
                } else {
                    jb[8].setText("X");
                    jb[8].setEnabled(false);
                    playerSelector += 1;
                    win[8] = "x";
                    if (win[0] == "x" && win[1] == "x" && win[2] == "x" || win[3] == "x" && win[4] == "x" && win[5] == "x" || win[6] == "x" && win[7] == "x" && win[8] == "x" || win[0] == "x" && win[3] == "x" && win[6] == "x" || win[1] == "x" && win[4] == "x" && win[7] == "x" || win[2] == "x" && win[5] == "x" && win[8] == "x" || win[0] == "x" && win[4] == "x" && win[8] == "x" || win[2] == "x" && win[4] == "x" && win[6] == "x") {
                        JOptionPane.showMessageDialog(null, "Player 2 won ");
                        System.exit(0);
                    }
                }
                if (playerSelector == 10) {
                    JOptionPane.showMessageDialog(null, "Draw");
                    System.exit(0);
                }

            }
        });

        jf.add(jp);
        jf.setSize(720, 720);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
         catch (ClassNotFoundException e) {}
         catch (InstantiationException e) {}
         catch (IllegalAccessException e) {}
         catch (UnsupportedLookAndFeelException e) {}
        TicTacToe ttt = new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
