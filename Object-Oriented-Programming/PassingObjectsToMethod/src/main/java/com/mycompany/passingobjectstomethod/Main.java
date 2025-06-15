/*
    Passing Objects to Method
        - Arguments to Methods
        - Returning Objects
 */
package com.mycompany.passingobjectstomethod;

public class Main {
    //Part-1 -> Arguments to Methods:
    static void fun(Test n) {
        n.number++;
    }
    
    //Part-2 -> Returning Objects:
    static int add(int n1, int n2) {
        int n3 = n1 + n2;
        return n3;
    }
    
    public static void main(String args[]) {
        //Part-1 -> Arguments to Methods:
        
        Test obj = new Test();
        obj.number = 1;
        fun(obj);
        //System.out.println("Number = "+ obj.number);
        
        //Part-2 -> Returning Objects:
        
        int res = add(2,5);
        Math n1 = new Math(5);
        Math n2 = new Math(5);
        Math n4 = new Math();
        //Math n3 = Math.add(n1, n2);
        Math n3 = n1.add(n2);
        //System.out.println("n3 = "+ n3.val1);
        
        //Comparing Objects:
        
        if(n1 == n2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        
        
        System.out.println(n1.isEqual(n2));
    }
}
