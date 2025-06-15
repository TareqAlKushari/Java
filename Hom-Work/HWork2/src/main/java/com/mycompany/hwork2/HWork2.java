package com.mycompany.hwork2;

import javax.swing.JOptionPane;

public class HWork2 {

    public static void main(String[] args) {
        String num,rsult = new String();
        int sum = 0;
        int t = 0;
        int numInt = 0;
        
        num = JOptionPane.showInputDialog("Enter the number: ");
        numInt = Integer.parseInt(num);
        
        while(numInt < 100 || numInt > 999){
            num = JOptionPane.showInputDialog("Enter the number the greden 100 and less 999 ");
            numInt = Integer.parseInt(num);
        }
        
        t =  Integer.parseInt(num);
        
        while(t > 10) {
            if(t%10 == 0){
                t = t / 10;
            }else {
                sum += t % 10;
                t = t / 10;
            }
        }
        sum += t;
        
        for(int i = 1; i <= num.length(); i++) {
            if(i-1 == 0)
                rsult = rsult + (char) num.charAt(i-1) ;
            else if (i == num.length())
                rsult =  rsult + " + " + (char) num.charAt(i-1) + " = " + sum;
            else
                rsult =  rsult + " + " + (char) num.charAt(i-1);
        }
        
        JOptionPane.showMessageDialog(null, "Result " + rsult, "Tareq", JOptionPane.PLAIN_MESSAGE);
       
        System.out.println(rsult);
    }
}
