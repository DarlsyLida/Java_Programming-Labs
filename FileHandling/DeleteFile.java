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

public class DeleteFile {
    public static void main(String[] args){
        File f0 = new File("Z:\\core_java\\FileHandling\\f1.txt");
        
        if (f0.delete()){
            System.out.println(f0.getName()+" file deleted successfully.");
        }
        else{
            System.out.println("Unexpected error found in deletion of the file.");
        }
    }
    
}
