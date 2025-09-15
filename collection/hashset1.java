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
public class hashset1 {
    public static void main(String args[]){
        Set<String> set = new HashSet<String>();
        
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        
        // Traversing elements
        Iterator<String>itr = set.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
        
 