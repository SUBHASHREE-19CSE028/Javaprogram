/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class fibonaccis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter a limit:");
     int n=obj.nextInt();
     int a=0;
     int b=1;
     int i,c;
     System.out.println("Fibonacci Series:"+a+" "+b);
     for(i=2;i<n;i++)
     {
         c=a+b;
         System.out.println(""+c);
         a=b;
         b=c;
     }
         
     }
     
    }
    

