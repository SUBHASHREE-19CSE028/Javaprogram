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
public class noofcount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a limit:");
        int n=obj.nextInt();
        int pos=0,neg=0,zer=0,count;
        for(count=1;count<=n;count++)
        {
         System.out.println();
         int x=obj.nextInt();
        if(x>0)
            pos++;
        else if(x<0)
            neg++;
        else
            zer++;
        }
        System.out.println("No of positive numbers"+pos);
        System.out.println("No of negative numbers"+neg);
        System.out.println("No of zeros"+zer);
    
    }
    
}
