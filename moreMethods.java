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
public class moreMethods {
    
    public static void main(String[] args){
        
        int number = alwaysReturnTen();
        //the value of the number is 10
        int sumNumbers = sum(2,7);
        //the value of sumNumbers is 9
        
    }
   
    //if the function wants to return something
    //it needs to be specified
    //void meaning nothing is being returned
    //if the method is not void, then it must have a return statement
    
    public static int alwaysReturnTen(){
        return 10;
    }
    public static int sum(int first, int second){
        return first + second;
    }
    public static double average(int num1, int num2, int num3){
        int sum = num1+num2+num3;
        double average = sum/3.0;
        
        return average;
        
    }
    
    
}
