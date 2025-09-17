/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandling;

/**
 *
 * @author fymsc49
 */
import java.io.File;
import java.io.IOException;


public class CreateFileDir {
    public static void main(String[] args){
        try{
            File myObj = new File("Z:\\core_java\\FileHandling\\f1.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
                System.out.println("Absolute path: "+myObj.getAbsolutePath());
            }
            else{
                System.out.println("File already exists.");
            }
        }
            catch(IOException e){
                    System.out.println("An error occured");
                    e.printStackTrace();
                    }
        
    }
    
}
