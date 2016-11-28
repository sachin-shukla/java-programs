/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketssequence;

import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class BracketsSequence {

    /**
     * @param args the command line arguments
     */
//    static String result= "";
    static int  resultCount = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       
        int q = sc.nextInt();
        
        int n,k;
        while(q > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            
            generateSequence(n/2,0,"",k);
            
            //            System.out.println(result);
            
//            String resultArr[] = result.split("ss");
            
//            System.out.println( "Valid Condition =" + isSuperValid(result,k));
            System.out.println(resultCount % ( 1000000000 + 7) );
            q--;
            resultCount = 0;
        }
    }
    
    // method to generate vallid sequences.
    static void generateSequence(int ost, int cst, String str , int k){
        if (ost == 0 && cst == 0) {
            System.out.println(str);
//            result = result + str + "ss";
            isSuperValid(str,k);
        }
        if (ost > 0) {
            generateSequence(ost-1, cst+1, str + "(" , k);
        }
        if (cst > 0) {
            generateSequence(ost, cst-1, str + ")", k);
        }
    }
    
    static void isSuperValid(String str, int k){
        int count =0;
        for(int i=0; i<= str.length()-2;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                count += 1;
            }
        }
        if(count>=k)
           resultCount++;
    }
}
