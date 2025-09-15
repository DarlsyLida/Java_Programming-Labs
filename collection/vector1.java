/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author fymsc49
 */
import java.util.*;
public class vector1 {
    public static void main(String args[]){
        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Arpit");
        v.add("Jiya");
        
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
