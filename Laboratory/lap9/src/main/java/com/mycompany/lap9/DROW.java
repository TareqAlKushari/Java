package com.mycompany.lap9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DROW extends JPanel {
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(200,100,120));
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        g.setColor(Color.white);
        g.fillOval(65, 70, 10, 15);
        g.fillOval(145, 70, 10, 15);
        g.setColor(Color.black);
        g.fillOval(50, 120, 120, 40);
        g.setColor(Color.white);
        g.fillRect(90, 121, 20, 20);
        g.fillRect(113, 121, 20, 20);
        g.fillRect(100, 144, 20, 15);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 24));
        g.drawString("Done By Tareq", 250, 220);
        

        
    }
}
