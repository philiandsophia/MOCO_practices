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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class WordsInReverse {
   
    public static void main(String arg[]){
        Scanner reader = new Scanner(System.in);
        String a = " ";
        ArrayList<String> words = new ArrayList<String>();
       
        
        while (true){
            System.out.println("Type a word");
            a = reader.nextLine();
            if (a.equals("")){
                break;
                
            }else if (!a.equals("")){
                words.add(a);
            }
            
        }
        Collections.reverse(words);
        System.out.println("You typed the following words");
        for (String word: words){
            System.out.println(word);
        }
    }
    
}
