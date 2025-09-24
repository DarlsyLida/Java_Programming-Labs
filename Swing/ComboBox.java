/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

/**
 *
 * @author fymsc49
 */
import javax.swing.*;
public class ComboBox {
    JFrame f;
    ComboBox(){
        f = new JFrame("ComboBox Example");
        
        String name[]= {"a","b1","c1","d1","e1"};
        JComboBox cb = new JComboBox(name);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
                
                
                
                
    }
    
    public static void main(String[] args){
        new ComboBox();
    }
    
}
