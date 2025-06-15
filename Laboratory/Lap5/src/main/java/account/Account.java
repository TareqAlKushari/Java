package account;

import date.MyDate;

/**
 *
 * @author msi3
 */
public class Account {
    private String custamerName;
    private int AccNo;
    private double balance;
    private MyDate date;

    //public Account() {
    //}
 
    public Account(){
        Adding ad = new Adding();
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
