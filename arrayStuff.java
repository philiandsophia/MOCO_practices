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
import java.util.Collections;
public class arrayStuff {
    
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("Z");
        words.add("K");
        words.add("V");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.get(0));
        words.remove("C");
        if (words.contains("A"));{
        System.out.println("A is in the list");
        System.out.println(words);
        
        //going through a list
        int place = 0;
        while (place<words.size()){
            System.out.println(words.get(place));
            place++;
        }
        for (String word: words){
            System.out.println(word);
        }
        Collections.sort(words);
        //sorts by alphabetical order, just like Python sort
        for (String word: words){
            System.out.println(word);
        }
        // reverse reverse the order of list item
        //shuffl shuffles the list items
        
        
        //integer can be stored in an ArrayList
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(4);
        numbers.add(8);
        
        //numbers.remove(4) won't work as it will try to remove the 5th element
        //instead, we must use
        
        numbers.remove(Integer.valueOf(4));
        System.out.println(numbers);
        
        //other kinds of varibles
        ArrayList<Double> doubles = new ArrayList<Double>();
        ArrayLIst<Character> characters = new ArrayList<Character>();
    }
               
        
    //array list can be given to a method as a parameter    
        
    }
    public static void print(ArrayList<String> list){
        for(String word: list){
            System.out.println(word);
        }
    }
    
}
