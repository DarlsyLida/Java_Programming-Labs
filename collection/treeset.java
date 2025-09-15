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
public class treeset {
    public static void main(String args[]){
        TreeSet<String> set = new TreeSet<String>();
        
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        
        Iterator<String>itr = set.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
