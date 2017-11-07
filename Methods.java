/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc_practices;

/**
 *
 * @author choip
 */
import java.util.Scanner;
        
public class Methods {
    
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        
        greet("Philip","Die");
        
        System.out.println("How many? ");
        int num = Integer.parseInt(reader.nextLine());
        while (num > 0){printText(); num -- ;}
        
        greetManyTimes("Martin", 7);
        
        
    }
    
    public static void greet(String name, String where){System.out.println("Greeting "+name + where);}
    //the method has a parameter name
    //this is how you define a method
    
    public static void printText() {
        System.out.println("Hi");}
    
    public static void greetManyTimes(String name, int times)
    {
    int i = 0;
    while (i < times)
    {greet(name, "Korea");
    i++;}
    }
}

