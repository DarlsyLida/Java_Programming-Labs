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
public class collection_linklist {
    public static void main(String args[]){
        LinkedList<String> al  = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
    
    
    Iterator<String> itr = al.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
