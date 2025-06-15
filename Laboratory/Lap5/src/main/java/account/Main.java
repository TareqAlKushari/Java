package account;

import date.MyDate;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
//        Account account = new Account("tareq",123,2000,new MyDate(3,4,2020));
        Scanner in = new Scanner(System.in);
        Account ac = new Account();
        for(int i = 0; i < 1; i++){
            ac.setCustamerName(in.nextLine());
            ac.setAccNo(in.nextInt());
            ac.setBalance(in.nextDouble());
            ac.setDate(new MyDate(in.nextInt(),in.nextInt(),in.nextInt()));
        }
        //Account account = new Account("tareq",123,2000,new MyDate(3,4,2020));
        System.out.println("if you do deposit many enteer 1 or 2 to withdrow:");
        if(in.nextInt() == 1){
            System.out.println("Enteer the many for deposit:");
            ac.deposit(in.nextInt());
        }else{
            System.out.println("Enteer the many for withdrow:");
            ac.withdrow(in.nextInt());
        }
        
        
        System.out.println(ac.toString());
    }
}
