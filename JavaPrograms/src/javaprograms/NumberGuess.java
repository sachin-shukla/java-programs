/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class NumberGuess {
    int theNumber;
    int max;
    Scanner sc = new Scanner(System.in);
    
    public NumberGuess(){
        Random rand = new Random();
        System.out.println("Enter the max no value in whch range you want to guess");
        max = sc.nextInt();// 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1) ; // to get the number below the max value inclusive.
    }
    
    public void  play(){
        System.out.println("Welcome to my game  \nEnter the no to guess, between 0 and " + max );
        while(true){
            int userInput =  sc.nextInt();
            if( userInput < theNumber ){
                System.out.println("The no is too small.");
            }else if(userInput > theNumber){
                System.out.println("The no is too big.");
            }else{
                System.out.println("You got IT.!!!!");
                break;
            }
        }
    }
}
