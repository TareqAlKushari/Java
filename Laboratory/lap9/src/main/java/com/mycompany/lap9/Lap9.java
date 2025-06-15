package com.mycompany.lap9;

import javax.swing.JFrame;

public class Lap9 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(450,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        DROW Dr = new DROW();
        jf.add(Dr);
    }
}
