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
public class large {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the values:");
       int a=obj.nextInt();
       int b=obj.nextInt();
       int c=obj.nextInt();
       if(a>b && a>c)
           System.out.println("Largest is:"+a);
       else if(b>a && b>c)
           System.out.println("Largest is:"+b);
       else
           System.out.println("Largest is:"+c);
    }
    
}
