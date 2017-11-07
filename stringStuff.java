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
public class stringStuff {
    
    public static void main(String args[]){
                
        Scanner reader = new Scanner(System.in);
        
        String banana = "banana";
        System.out.println("THe length of banana is "+banana.length());
        //.length is equivalent to len() in Python
        
        char character = banana.charAt(3);
        //Java has a dat type called char
        //which can only store one character
        //charAt(3) returns character at index 3
        //just like Python's .index()
        //index starts at 0
        System.out.println("The 4th character of the word is "+ character);
        System.out.println("Type your name, you idiot");
        String name = reader.nextLine();
        int length = name.length();
        String reverseName = "";
        int i = 1;
        while (true){
            reverseName = reverseName + name.charAt(length-i);
            i ++;
            if (i - 1 ==length)
            {break;}
            
        }
        System.out.println(reverseName);
        
        String hi = "HiIamyou";
        System.out.println(hi.substring(3));//print out substring from index 3
        System.out.println(hi.substring(2,4));//print out substring from 2 to 3
        
        String book = "Mary Poppins";
        String endpart = book.substring(5);
        //end part is a new string that is a substring of book
        
        //indexOf() returns the starting position of a substring
        //returns negtaive 1 if the value is not found
        
        int index = book.indexOf("Po");
        System.out.println(index);
        
        
        System.out.println("Enter your words");
        String w1 = reader.nextLine();
        String w2 = reader.nextLine();
        In_a_word(w1,w2);
         
        //an object haas a value and methods assocuaated with them
        //a string is an object (it has methods like .lemgth()
        //an integer is not an object
        //an object must be created using the new command
        //but string is an exception to this
        //one example of new command is
        // Scanner reader new Scanner(System.in)
        
       
    }
    
    public static void In_a_word(String first, String second){
        
        if (first.indexOf(second) == -1){
            System.out.println("The string "+ second  + " is not in the " + first);}
            else if (first.indexOf(second) != -1) {System.out.println("The string "+ second + " is in the "+ first);}
    }
    
}
