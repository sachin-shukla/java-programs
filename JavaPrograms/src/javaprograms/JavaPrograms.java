/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class JavaPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to The Set of Good And usefull Java Programs by Sachin.");
        JavaPrograms jp = new JavaPrograms();
        jp.switchProgram();
    }
    public void switchProgram(){
        System.out.println("Please Enter the following Number to run that program");
        System.out.println("1 for Cointoss \n2 for NumberGuessGame.");
        
        Scanner sc = new Scanner(System.in);
        int gameOption = sc.nextInt();
        switch(gameOption){
            case 1:   CoinToss ct = new CoinToss();
                      ct.printResult();
                      break;
            case 2:  NumberGuess ng = new NumberGuess();
                     ng.play();
                     break;
            default: System.out.println("Please select Valid Option. Thank You.");
        }
    }
    
}
