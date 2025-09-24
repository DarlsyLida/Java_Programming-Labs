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
public class Button {
    public static void main(String[] args){
        JFrame f = new JFrame("Example button");
        JButton b = new JButton("Click Here...");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
