package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Adding {
    private JPanel p1,p2,p3,p4;
    private JTextField t1,t2,t3;
    private JLabel l1,l2,l3;
    private JButton b;
    

    public Adding(){
        JFrame jf = new JFrame("Adding 2 numbers");
        
        jf.setSize(400,400);
        jf.setLocation(50,100);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf. setLayout(new GridLayout(2,2,8,8));
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
        l1=new JLabel("First Namber: ");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
        p1.setBackground(new Color(200,120,200));
        jf.add(p1);
        
        p2 = new JPanel();
        p2.setBackground(Color.gray);
        p2.setLayout(new FlowLayout(0,20,30));
        l2=new JLabel("second Number: ");
        t2 = new JTextField(15);
        p2.add(l2);
        p2.add(t2);
        jf.add(p2);
        
        p3 = new JPanel();
        p3.setBackground(new Color(250, 120, 200));
        b=new JButton("ADD");
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,0,40));
        p3.add(b);
        jf.add(p3);
        
        p4 = new JPanel();
        p4.setBackground(new Color(50,150,200));
        p4.setLayout(new FlowLayout(0,20,30));
        l3=new JLabel("Result: ");
        t3 = new JTextField(20);
        p4.add(l3);
        p4.add(t3);
        jf.add(p4);
        
        ActionListener a = new ActionListener(
        
        ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int s = n1 + n2;
                t3.setText("" + s);
            }
        };
        
        b.addActionListener(a);
        
        jf.setVisible(true);
        
    }
}
