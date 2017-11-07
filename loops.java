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
public class loops { 
    public static void main(String arg[]){
    
        Scanner reader = new Scanner(System.in);
        //while loop
        while (true) {System.out.println("I can program");
        System.out.println("Continue?");
        String command = reader.nextLine();
        if (command.equals("no")){break;}
        
        }
        
        
        
        int age = 1;
     
        System.out.println(age);
        age = age + 1;
        //or age++;
        //in the same vein
        //age --;
        System.out.println(age);
        // changing variables
        
        int sum = 0;
        System.out.println("Input your three numbers");
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        int c = Integer.parseInt(reader.nextLine());
        sum = a+b+c;
        System.out.println("Sum: " + sum);
        
        while (true) {System.out.println("Type the password");
        String tries = reader.nextLine();
        if (tries.equals("Ha")){System.out.println("The secret is your mom");
        break;}
        else {System.out.println("Wrong");}
        }
        
        Scanner hello = new Scanner(System.in);
        int sum1 = 0;
        while (true) {
            System.out.println("Enter integers");
            int read = Integer.parseInt(hello.nextLine());
            if (read == 0){break;} 
            else {sum1 = sum1 + read;}
            System.out.println("Sum now: "+ sum1);
            }
         
         System.out.println("Sum in the end: "+sum1);
                
         int number = 1;
         while (number<11) {
             System.out.println(number);
             number++;
         }
         System.out.println("Input two integers");
         int num1 = Integer.parseInt(hello.nextLine());
         int num2 = Integer.parseInt(hello.nextLine());
         while (num1 <= num2){
             System.out.println(num1);
             num1 ++;
         }
        //+= -= same as Python
        //*= multiplication
        // /= divison
        // %= modulos operation
        
        System.out.println("Type a number");
        int num4 = Integer.parseInt(hello.nextLine());
        int result = 1;
        while (num4 > 0)
        {result = result * num4;
            num4 --;}
         System.out.println("Factor is "+result);
         
             
        
             
         
   }
}

