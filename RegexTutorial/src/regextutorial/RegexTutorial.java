/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextutorial;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author sachin
 * 
 * Input=
 * 1 3 3 3 XOX XXX XOO

1 3 5 3 XOXXO XXXOX XOOXX

1 5 2 2 XO XX OX XX OX 


4 
3 3 3
 XOX 
XOX
 XXX 
3 3 3 
X-X 
O-O 
X-X
 3 3 3 
O-X
 XOO
 XOO
 3 3 3
 O-X 
O-X
 O-X
 */
public class RegexTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int g,n,m,k=0; 
         String horizontal="",vertical="",diagonal="",temp="";
         
         Scanner sc= new Scanner(System.in);
          g = sc.nextInt();
          
          // main logic of program
          while(g>0)
          {
              g--;
              n=sc.nextInt();
              m=sc.nextInt();
              k=sc.nextInt();
              
              horizontal=vertical=diagonal="";
              
             char arr[][] = new char[n][m]; // initializing array
              
              for(int i=0;i<n;i++){
                  temp = sc.next();
                  horizontal += temp + " ";
                  
                  for(int j=0;j<m;j++){
                      arr[i][j] = temp.charAt(j);
                  }
                  temp = "";
              }
              
              String xPattern="" , oPattern = "";
              
              for(int r=0;r<k;r++){
                  xPattern += 'X';
                  oPattern += 'O';
              }
              System.out.println("Xpattern= " +xPattern );
              System.out.println("oPattern= " +oPattern );
              
               System.out.println("horizontal= " + horizontal);
               
              // section to determime output on horizontal string
               boolean conditionResultForO_hz = horizontal.contains(oPattern);
               boolean conditionResultForX_hz = horizontal.contains(xPattern);
               
               System.out.println("conditionResultForO_hz= "+conditionResultForO_hz);
               System.out.println("conditionResultForX_hz= "+conditionResultForX_hz);
               
               if(conditionResultForO_hz && conditionResultForX_hz){
                   System.out.println("NONE");
                   continue;
               }
               
               // section to determime output on veryical  string
                vertical = getVerticalString(n,m,arr);
                System.out.println("vertical= " + vertical);
                
                boolean conditionResultForO_vz = vertical.contains(oPattern);
                boolean conditionResultForX_vz = vertical.contains(xPattern);
                
                
               
               if(conditionResultForO_vz && conditionResultForX_vz){
                   System.out.println("NONE");
                    continue;
               }
               
               // section to determine the output for diagonal
               diagonal = DiagonalString(n,m,arr);
               System.out.println("diagonal= " + diagonal);
                
               boolean conditionResultForO_dg = diagonal.contains(oPattern);
               boolean conditionResultForX_dg = diagonal.contains(xPattern);
               
               if(conditionResultForO_dg && conditionResultForX_dg){
                   System.out.println("NONE");
                    continue;
               }
               
               if(conditionResultForO_hz || conditionResultForO_vz || conditionResultForO_dg)
               {
                   if(conditionResultForX_hz || conditionResultForX_vz || conditionResultForX_dg ){
                       System.out.println("NONE");
                        continue;
                   }
                   else{
                       System.out.println("WIN");
                        continue;
                   }
               }
               else
               {
                 if(conditionResultForX_hz || conditionResultForX_vz || conditionResultForX_vz)
                 {
                     System.out.println("LOSE");
                 }
                 else
                 {
                    System.out.println("NONE");  
                 }
               }
                                           
          }
    }
    
    static String  getVerticalString(int n,int m, char[][] arr){
        String temp = "";
        String verticalString = "";
        
        for(int i=0;i<m;i++){
            temp = "";
            for(int j=0;j<n;j++){
                temp += arr[j][i];
            }
            temp = temp + " ";
            
            verticalString += temp;
        }
        return verticalString;
    }
    
    static String DiagonalString(int m,int n,char[][] arr){

        String temp="";
        String diagonalResult= "";
        
        for(int j=n-1; j>=0; j--){
            temp="";
            for(int k=0; k<m; k++){
                if((j + k) < n){
                    temp += arr[k][j + k];
                } else {
                    break;
                }
            }
            diagonalResult +=  temp + " ";
        }
        for(int i=1; i<m; i++){
            temp = "";
            for(int j=i, k=0; j<m && k<n; j++, k++){
               temp += arr[j][k];
            }
            diagonalResult = diagonalResult + temp + " "; 
        }
        
        // other side of diagonal 
        int i, j, t;
         for( t = 0; t<m+n; ++t)
         {
             temp = "";
              for( i=t, j=0; i>=0 ; --i, ++j)
              {
                     if( (i<m) && (j<n) ){
                         temp += arr[i][j];
                     }
              }
              diagonalResult += temp + " ";
         }
        return diagonalResult;
    }
    
}
