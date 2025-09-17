/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fymsc49
 */
public class ReadFile {
    public static void main(String[] args){
    try{
        File myObj = new File("Z:\\core_java\\FileHandling\\f1.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
      }
    catch(FileNotFoundException e){
        System.out.println("An error occured");
            e.printStackTrace();
}
    
}
}