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
public class MOOC_Practices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        //System.out.print does not print a line break
        //after a line break after printing the text
        // \n stands for a line braek
        int month = 12;
        String text = "include text";
        int wholeNumber = 123;
        double decimalNumber = 3.14;
        boolean isTrue = true;
        System.out.println("The variable's type is text. Its value is " + text);
        System.out.println("The variable's type is integer. Its value is "+ wholeNumber);
        System.out.println("The variable's type is deciaml number. Its value is "+ decimalNumber);
        System.out.println("The variable's type is truth value. Its value is "+ isTrue);
        //when a variable is declared with a data type, it cannot be cahnged later
        //For example, a text varible cannot be changed into an integer varible
        //but integer values can be assigned to decimal number variables
        //because whole numbers are also decimal numbers
        
        int x = 3;
        double y = 12.5;
        double xy = x+y; //cannot be declared as int
        System.out.println(xy);
        
        //naming convetion
        //use camelCase
        //similar to Python naming convention
        
        //some complicated calculation
        
        int n = (1+1)+3*(2+5);
        int m = 1+1+1;
        int sum = n+m;
        System.out.println(sum);
        int first = 3;
        int second = 2;
        int remainder = first % second;
        System.out.println(remainder);
        double division = first / second * 1.0;
        System.out.println(division);
        
        double result3 = (double)(first/second);
        System.out.println(result3);
        
        int dayYear = 365;
        int hour = 24;
        int minute = 60;
        int seconds = 60;
        int answer = dayYear*hour*minute*seconds;
        System.out.println("There are " + answer + " seconds in a year");
         
        String greeting = "Hi ";
        String name = "John";
        String sentence  = greeting+name;
        System.out.println(sentence);
        //stringt concentation silimar to Python

              
                
        
        
        
        
        
        
        
        
        
         
    }
    
}
