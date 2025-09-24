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
public class CheckBox {
    CheckBox(){
        JFrame  f = new JFrame("CheckBox Example");
        
        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        
        JCheckBox checkbox2 = new JCheckBox("Java");
        checkbox2.setBounds(100, 150, 50, 50);
        
        f.add(checkbox1);
        f.add(checkbox2);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args){
        new CheckBox();
    }
    
}
