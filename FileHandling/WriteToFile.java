/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandling;

/**
 *
 * @author fymsc49
 */

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("Z:\\core_java\\FileHandling\\f1.txt");
            myWriter.write("Kunal \n");
            myWriter.write("Ravi");
            myWriter.close();
            
            System.out.println("Sucessfully wrote to file");
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        }
    
}
