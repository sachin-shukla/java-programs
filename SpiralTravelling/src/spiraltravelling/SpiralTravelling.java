/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiraltravelling;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class SpiralTravelling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array data");
        n = sc.nextInt();
        m = sc.nextInt();
        char arr[][] = new char[n][m];
        String strLine = ""; 
        
        for(int i=0;i<n;i++){
            strLine = sc.next();
           for(int j=0;j<m;j++){
                arr[i][j] = strLine.charAt(j);
            }
        }
         printMatrix(n,m, arr);

                    
        spiralPrint(n,m,arr);
    }
   
        
    
   static void spiralPrint(int m, int n, char[][] arr)
    {
        int i,  k = 0, l = 0;
        
       /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
       String result = " ";
        while(k < m && l < n)
        {
             // Print the column bottom to top
            if(l < n)
            {
                for(i = m-1; i >= k; --i)
                {
                    System.out.print(arr[i][l]+" ");
                    result = result + arr[i][l];
                }
                l++;
            }
             System.out.println();
            // Print the row left to right
            for(i = l; i < n; ++i)
            {
               System.out.print(arr[k][i] +" ");
                result = result + arr[k][i];
            }
            System.out.println();
            
            // Print the column top to bottom
            k++;
            for(i = k; i < m; ++i)
            {
               System.out.print(arr[i][n-1] + " ");
               result = result + arr[i][n-1];
            }
            System.out.println();
            
            // Print the row right to left
            n--;
            if(k < m)
            {
                for(i = n-1; i >= l; --i)
                {
                   System.out.print(arr[m-1][i]+" ");
                   result = result + arr[m-1][i];
                }
                m--;
            }
           System.out.println();
         }
        String result1 = " 4 1 c # a #";
         System.out.println(result);
         int count = 0;
         
         String[] parts = result1.split("#");
//         for(int j=0;j < result.length();j++){
//             if(j==0 && result.charAt(j) != '#' ) {
////                 count++;
//             }
//             else if( j>0 && result.charAt(j) == '#' && result.charAt(j-1) == '#' ){
//                    count++;
//             }
//             else if(result.charAt(j)=='#' && j>0   )
//             {
//                 count++;
//             }
//         }

        for (int s=0;s<parts.length;s++)
        {
            System.out.println("part" + s + "=" + parts[s]);
            if(!parts[s].isEmpty())
                count++;
        }
         System.out.println(parts.length);
         System.out.println(count);

    }
   
    static void printMatrix(int n, int m,char[][] ar){
        System.out.println("Printing the matrix =");
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print(ar[i][j]+" ");
           }
           System.out.println();
       }
        System.out.println("Matrix printed");
   }
}
