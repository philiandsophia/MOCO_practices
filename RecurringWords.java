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
import java.util.ArrayList;
import java.util.Collections;
    
public class RecurringWords {
    
    public static void main(String arg[])
    {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    boolean found = false;
    int i = 0;
    while (!found){
        System.out.println("Enter your word");
        String aword = reader.nextLine();
        words.add(aword);
        
        for (String word: words)
        {
            if (word.equals(aword)){
                i ++;
            }
        }
        if (i == 2){
            found = true;
            System.out.println("You gave the word "+aword + " twice");
        } else if (i != 2){
            i = 0;
        }
        }
        
    }
    
    }

    

