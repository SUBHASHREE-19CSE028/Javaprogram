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
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the limit:");
       int n=obj.nextInt();
       int count=1,s=0,x;
       System.out.println("Enter the values:");
       while(count<=n)
       {
           System.out.println("value:"+count);
           x=obj.nextInt();
           s=s+x;
           count++;
       }
       System.out.println("Sum of "+n+" numbers is"+s);
      
    
    }
    
}
