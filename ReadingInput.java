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

public class ReadingInput {
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("name?");
        String name = reader.nextLine();
        //reads input
        System.out.println("Hi, " + name);
        
        System.out.println("Age?");
        int number = Integer.parseInt(reader.nextLine());
        //same as int(input())
        System.out.println("You age is " + number);
                
        System.out.println("number?");
        int anumber = Integer.parseInt(reader.nextLine());
        System.out.println("Another one?");
        int number2 = Integer.parseInt(reader.nextLine());
        
        if (anumber > number2) {System.out.println("The bigger number was "+ anumber);}
        else if (anumber < number2) { System.out.println("The bigger number was "+ number2);}
        else if (anumber == number2) {System.out.println("The numbers are the same");}
        
       System.out.println("raidus?");
       int radius = Integer.parseInt(reader.nextLine());
       double circumference = 2 * radius * Math.PI;
        System.out.println("Circumference of the circle: " + circumference);
        
      
                
        
    }
}
