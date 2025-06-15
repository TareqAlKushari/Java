package account;

import date.MyDate;
import java.awt.*;
import javax.swing.*;


public class Account {
    private JPanel p1,p2,p3,p4;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JLabel l1,l2,l3,l4;
    private JButton b;
    
    private String custamerName;
    private int AccNo;
    private double balance;
    private MyDate date;
    

    //public Account() {
    //}
 
    public Account(){
        JFrame jf = new JFrame("Adding 2 numbers");
        
        jf.setSize(400,400);
        jf.setLocation(50,100);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf. setLayout(null);
        
        l1=new JLabel("Custamer Name: ");
        l1.setBounds(5, 20, 100, 15);
        t1 = new JTextField(15);
        t1.setBounds(110, 20, 150, 20);
      
        l2=new JLabel("AccountNo: ");
        l2.setBounds(5, 45, 100, 15);
        t2 = new JTextField(15);
        t2.setBounds(110, 45, 150, 20);
        
        l3 = new JLabel("Balance: ");
        l3.setBounds(5, 70, 100, 15);
        t3 = new JTextField(15);
        t3.setBounds(110, 70, 150, 20);
        
        l4 = new JLabel("Date: ");
        l4.setBounds(5, 105, 100, 15);
        
        t4 = new JTextField(15);
        t4.setBounds(110, 105, 50, 20);
        t5 = new JTextField(15);
        t5.setBounds(162, 105, 50, 20);
        t6 = new JTextField(15);
        t6.setBounds(214, 105, 50, 20);
        
        b=new JButton("Log Up");
        b.setBounds(150, 200, 90, 20);
        
        
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        jf.add(l4);
        jf.add(t4);
        jf.add(t5);
        jf.add(t6);
        jf.add(b);
        
        
        jf.setVisible(true);
    }
    /*public Account(String custamerName, int AccNo, double balance, MyDate date) {
        this.custamerName = custamerName;
        this.AccNo = AccNo;
        this.balance = balance;
        this.date = date;
    }*/
    
    

    public String getCustamerName() {
        return custamerName;
    }

    public void setCustamerName(String custamerName) {
        this.custamerName = custamerName;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int AccNo) {
        this.AccNo = AccNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }
    
    public void deposit(double amont){
        if(amont > 0)
            this.balance += amont;
    }
    
    public void withdrow(double amont){
        if(amont < this.balance){
            this.balance -= amont;
        }
    }

    @Override
    public String toString() {
        return "Account{" + "custamerName=" + custamerName + ", AccNo=" + AccNo + ", balance=" + balance  + date.toString() + '}';
    }
    
    
}
