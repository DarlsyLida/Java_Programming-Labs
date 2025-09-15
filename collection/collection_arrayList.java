/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author fymsc49
 */
/*
1. It implements the List interface.
2. It uses a dynamic array to store the duplicate element of different data types.
3. The ArrayList class maintains the insertion order.
4. It is non-synchronized.
5. The elements stored in the ArrayList class can be randomly accessed.
*/

import java.util.*;

class collection_arrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
        list.add("Ravi");  // Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
