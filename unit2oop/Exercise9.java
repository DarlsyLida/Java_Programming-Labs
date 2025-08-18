/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */

class Box{
    int height, width;
    Box(int h, int w){
        height = h;
        width = w;
    }
    
    int area(){
        return (height*width);
    }
}



class MyBox extends Box{
    int depth;
    MyBox(int h, int w, int d){
        super(h,w);
        depth = d;
        
    }
    int volume(){
        return (height*width*depth);
    }
    
}


public class Exercise9 {
    public static void main(String[] args){
        Box a = new Box(2,3);
        System.out.println("Area " + a.area());
        MyBox b = new MyBox(5,7,10);
        System.out.println("Volume " + b.volume());
    }
}
