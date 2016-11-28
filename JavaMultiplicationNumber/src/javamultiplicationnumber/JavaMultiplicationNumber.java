/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultiplicationnumber;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class JavaMultiplicationNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrNumberMulticand, arrMultiplyer[];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of Multiplicand");
//        int noMulpnd = sc.nextInt();
//        arrNumberMulticand = new int[noMulpnd];
//        System.out.println("Enter the"+noMulpnd+"Number");
//        for(int i =0;i<noMulpnd;i++){
//            arrNumberMulticand[i] = sc.nextInt();
//        }
        
        arrNumberMulticand = sc.nextInt();
        
        
        System.out.println("Enter the no of Multiplyer");
        int noMlpr = sc.nextInt();
        arrMultiplyer = new int[noMlpr];
        System.out.println("Enter the"+noMlpr+"Number");
        for(int i =0;i<noMlpr;i++){
            arrMultiplyer[i] = sc.nextInt();
        }
        
//        for(int i =0;i<noMulpnd;i++){
//            System.out.print(arrNumberMulticand[i] + " ");
//        }
        System.out.println("Result =" );
        System.out.println(arrNumberMulticand);
        System.out.print("X  ");
        
         String  totalMultiplyer = "";
         
        for(int i =0;i<noMlpr;i++){
             totalMultiplyer += arrMultiplyer[i];
            System.out.print(arrMultiplyer[i]);
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        
       
        for(int j=noMlpr-1;j>=0;j--){
           
            System.out.println(arrNumberMulticand*arrMultiplyer[j]);
        }
        System.out.println("---------------------------------------------");
        System.out.println(totalMultiplyer);
        System.out.println(arrNumberMulticand* Integer.parseInt(totalMultiplyer));
    }

}
