package com.mycompany.lap3;

import javax.swing.JOptionPane;

/**
 *
 * @author msi3
 */
public class Lap3 {

    public static void main(String[] args) {
        //String name = JOptionPane.showInputDialog("enter the number one for Sq. or tow for Tre. or three for Cir.");
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter the number one for Sq. \nor tow for Tre. \nor three for Cir."));
        
        int l = 0;
        int w = 0;
        int s = 0;
        /*if("+".equals(name))
            s = n + m;
        else if ("-".equals(name))
            s = n - m;
        else if ("*".equals(name))
            s = n*m;
        else if ("/".equals(name))
            s = n/m;
        else
            System.out.println("the inpute is rowng");*/
        if (num == 1){
            int n = Integer.parseInt(JOptionPane.showInputDialog("enter lenghe "));
            int m = Integer.parseInt(JOptionPane.showInputDialog("enter weidth"));
            s = n*m;
        }
        else if (num == 2){
            int n = Integer.parseInt(JOptionPane.showInputDialog("enter heghe"));
            int m = Integer.parseInt(JOptionPane.showInputDialog("enter helf weidth"));
            s = n*m;
        }
        else if (num == 3){
            int r = Integer.parseInt(JOptionPane.showInputDialog("enter r"));
            s = (int) (2*3.14*r);
        }
        JOptionPane.showMessageDialog(null, "Result " + s, "Tareq", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Hello World!");
    }
}
