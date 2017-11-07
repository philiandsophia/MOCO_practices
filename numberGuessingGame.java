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
import java.util.Random;
public class numberGuessingGame {
    
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101);
        boolean sentinel = true;
        int tries = 0;
        int a = 1;
        while (sentinel){
            System.out.println("Guess a number");
            int guess = Integer.parseInt(reader.nextLine());
            guessGame(guess,num,tries);
            tries ++ ;
            if (guess == num){break;}
            
            
            
            
        }
         
        
    
    }
    


public static void guessGame(int guess, int theNum, int tries){
    
    if (guess > theNum){
        tries = tries + 1; System.out.println("The number is lesser, guesses made: "+ tries );}
    else if(guess < theNum) {tries = tries+1;System.out.println("The number is greater, guesses made: "+ tries);}
    else if (guess == theNum){System.out.println("Congrat, you're right");}
    
    
    }

}