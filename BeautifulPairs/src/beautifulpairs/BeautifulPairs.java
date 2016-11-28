/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifulpairs;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class BeautifulPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int arrA[] =  new int[n];
        int arrB[] = new int[n];
        for (int i=0;i<n;i++){
            arrA[i] = sc.nextInt();
        }
        for(int j=0; j<n;j++)
            {
            arrB[j] = sc.nextInt();
        }
        
        // main logic
        int counterResult =0;
        
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                if(arrA[k] == arrB[l]){
                    counterResult++;
                    arrB[l] = -1;
                    break;
                }
            }
        }
        if(counterResult == n){
            counterResult--;
        }else{
            counterResult++;
        }
        System.out.println(counterResult);
        
    }
    
}
