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
public class TextArea {
    TextArea(){
        JFrame f = new JFrame();
        
        JTextArea area = new JTextArea("Welcome to Java");
        area.setBounds(10,30,200,200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new TextArea();
    }
}
