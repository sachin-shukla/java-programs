/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hourglasssum;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class HourGlassSum {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        //logic for implementing this
        
        // variable declaration
        int hourGlassRow = 0, hourGlassColumn = 0 , hgValSum=0, MaxHgValSum= -500 , currentGlassRowIndex=0 , currentGlassColumnIndex = 0 ;
        
        for(int k=0; k<16; k++){
            if(k%4==0 && k>0){
                hourGlassColumn = 0;
                hourGlassRow++;
            }
                
            hgValSum =currentGlassRowIndex  = 0;
            for(int i= hourGlassRow; i <= (hourGlassRow+2); i++){
                  currentGlassColumnIndex =0;
                for(int j=hourGlassColumn; j <= (hourGlassColumn+2); j++){
                    if(currentGlassRowIndex % 2 == 0){
                       hgValSum += arr[i][j];
                    }
                    else{
                        if(currentGlassColumnIndex == 1){
                            hgValSum += arr[i][j];
                        }
                    }
                    currentGlassColumnIndex++;
                }
                currentGlassRowIndex++;
            }
            if(MaxHgValSum < hgValSum){
                MaxHgValSum = hgValSum;
            }
            hourGlassColumn ++;
        }
        System.out.println(MaxHgValSum);
    }
    
}
