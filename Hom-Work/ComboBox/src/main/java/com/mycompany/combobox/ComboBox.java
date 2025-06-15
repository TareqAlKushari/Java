/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.combobox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
/**
 *
 * @author msi3
 */
public class ComboBox {

    JFrame frame;
    
    ComboBox(){
        frame = new JFrame("ComboBox");
        
        String [] names = {"Tareq","Mohammed","Husen","Ali","Al kushari"};
        
        JComboBox box = new JComboBox(names);
        box.setBounds(60, 60, 100, 30);
        frame.add(box);
        
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new ComboBox();
    }
}
