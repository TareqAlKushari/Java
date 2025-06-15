package com.mycompany.passingobjectstomethod;

public class Math {
    int val;
    //int val2;
    
    public Math() {}
    public Math(int val) {
        this.val = val;
        //this.val2 = val2;
    }
    
    //Math n3 = n1.add(n2);
    Math add(Math n2) {
        Math n3 = new Math();
        n3.val = this.val + n2.val;
        //n3.val2 = this.val2 + n2.val2;
        return n3;
    }
    
    boolean isEqual(Math n2) {
        if(this.val == n2.val)
            return true;
        else
            return false;
    }
}
