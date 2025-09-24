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
public class Label {
    public static void main(String[] args){
        JFrame f = new JFrame("Label Example");
        
        JLabel l1 = new JLabel("Firstname");
        l1.setBounds(50,50,100,30);
        
        JLabel l2 = new JLabel("Second name");
        l2.setBounds(50,10,100,30);
        
        f.add(l1);
        f.add(l2);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
