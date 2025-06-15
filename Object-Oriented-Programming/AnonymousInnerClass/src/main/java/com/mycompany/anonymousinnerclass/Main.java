package com.mycompany.anonymousinnerclass;

public class Main {
    public interface Showable{
        public void print();
    }
    
    static void display(Showable s) {
        s.print();
    }
    
    public static void main(String[] args) {
        TestClass test = new TestClass(){
    
            @Override
            public void testMethod(){
                System.out.println("Test 2");
            }
        };
        test.testMethod();
        
        
        /*display(new Showable() {
            @Override
            public void print(){
                System.out.println("Showable");
            }
            });
        
        Showable showable;
            showable= new Showable() {
            @Override
            public void print(){
                System.out.println("Showable");
            }
            };
            
            showable = () -> System.out.println("Showable");
        
        showable.print();*/
        
        
        
        /*RewardClass emp1 = new RewardClass();
        RewardClass emp2 = new RewardClass();
        
        RewardClass emp3 = new RewardClass(){
            @Override
            public void rewardMethod() {
                System.out.println("your reward is $20");
            }
        };
        System.out.println(emp1.getClass());
        System.out.println(emp3.getClass());
        
        emp1.rewardMethod();
        emp2.rewardMethod();
        emp3.rewardMethod();*/
        
        
    }
}
