/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Random;

/**
 * Coin Toss Program 
 * @author sachin
 */
public class CoinToss {
    
    public String tossACoin()
    {
        Random rnd = new Random();
        int toss =  Math.abs(rnd.nextInt()) % 2;
        if(toss == 1){
            return "HEAD";
        }else{
            return "TAIL";
        }
    }
    public void printResult()
    {
       for(int i=0;i<10;i++){
           System.out.println(tossACoin());
       }
    }
}
