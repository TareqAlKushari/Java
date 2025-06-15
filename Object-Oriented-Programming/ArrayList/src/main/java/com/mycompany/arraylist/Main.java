/*
    *ArrayList:-
    
 */

package com.mycompany.arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    
    
    public static void main(String[] args) { 
        //ArrayList list = new ArrayList();
        //List list2 = new ArrayList();
        
        //ArrayList list = new ArrayList();
        //ArrayList <Integer> list = new ArrayList();
        //ArrayList <Integer> list = new ArrayList<>();
        //ArrayList <Integer> list = new ArrayList<Integer>();
        //List <Integer> list = new ArrayList<Integer>();
        
        /*ArrayList <Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.add(0, 40);
        list.add(list.size(), 50);
        System.out.println(list);
        
        ArrayList <Integer> list2 = new ArrayList();
        list2.add(10);
        list2.add(50);
        list2.addAll(1,Arrays.asList(20,30,40));
        System.out.println(list2);*/
        
        
        /*int s = list.size();
        for(int i = 0; i < s; i++) {
            System.out.println(list.get(i));
        }
        
        for(int num : list) {
            System.out.println(num);
        }
        */
        
        /*ArrayList <Integer> lis1 = new ArrayList(Arrays.asList(10,20,30));
        //ArrayList <Integer> lis2 = new ArrayList(lis1);
        ArrayList <Integer> lis2;
        lis2 = (ArrayList) lis1.clone();
        System.out.println(lis2);*/
        
        
        
        /*ArrayList <Integer> list1 = new ArrayList(Arrays.asList(10,20,30));
        //list1.remove(0);
        
        //list1.remove(new Integer(10));
        //list1.remove((Integer) 10);
        list1.remove(Integer.valueOf(10));
        System.out.println(list1);*/
        
        /*ArrayList <String> list1 = new ArrayList(Arrays.asList("A","B","C","A","A"));
        ArrayList <String> list2 = new ArrayList(Arrays.asList("A","C"));
        
        //list1.removeAll(Arrays.asList("A","C"));
        //list1.removeAll(list2);
        list1.removeAll(Collections.singleton("A"));
        
        System.out.println(list1);*/
        
        /*ArrayList <Integer> list1 = new ArrayList(Arrays.asList("1",'2',true,5,6));
        //list1.removeIf(num->num%2==0);
        
        Object []arr = new Object[5];
        arr[0]="AA";
        arr[1]='C';
        arr[2]=true;
        arr[3]=10;
        
        for(Object el:arr){
            System.out.println(el);
        }
        
        
        System.out.println(list1);*/
        
        
        ArrayList <Integer> list1 = new ArrayList(Arrays.asList(10,20,30,100,70,90,40,50,80,50));
        //list1.forEach(el -> System.out.print(el+" - "));
        
        //Collections.sort(list1,Collections.reverseOrder());
        //Collections.reverse(list1);
        System.out.println(Collections.min(list1));
        System.out.println(Collections.max(list1));
        
        
    }
}
