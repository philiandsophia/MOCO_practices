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

public class ConditionalStatement {
                
    public static void main(String[] args){
        
        Scanner reader = new Scanner (System.in);
        
        
        int number = 11;
        
        if (number > 10)
        {System.out.println("The number was greater than 10");}
        
        if (number>0) {System.out.println("The number is positive!");
            if (number > 10){System.out.println("The numebr is greater than 10");}
        }
        //to use multiple if statments
        //put the if in the curly brakets
        
        int first = 1;
        int second = 3;
        boolean isGreater = first > second;
        //the value os isGreater is false
        
        System.out.println("Type a number");
        int anumber = Integer.parseInt(reader.nextLine());
        if (anumber % 2 == 0){System.out.println("The number is even");}
        else {System.out.println("The number is odd");}
        
         //comparing text
         //use equlas command
         //you can't use ==
         
         String text = "abccourse";
         if (text.equals("course")){System.out.println("The text is the text course");}
         
         //only evulates to true if the text are exactly the same
           
         
         //logical opeerator
         // && --> equivalnet to 'and' in Python
         // || --> equivalent to 'or' in Python
         // ! --> equivalent to 'not' in Python
         
         int d = 7;
         if (d > 4 && d < 11) { System.out.println("Yes!");}
         else {System.out.println("No");}
         
         int e = 50;
         if (e < 0 || e > 100){System.out.println("Yes! ");}
         else {System.out.println("no");}
         
         String water = "water";
         
         
    }
        
        
        
        
        
         
    
}
