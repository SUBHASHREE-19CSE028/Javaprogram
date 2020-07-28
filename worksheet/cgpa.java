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
public class cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double s[]=new double[10];
        double c[]=new double[10];
        double sum=0,cresum=0;
        System.out.println("Enter the number of subjects:");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Grade and Credit of"+(i+1)+"Subject");
            s[i]=obj.nextDouble();
            c[i]=obj.nextDouble();
            sum=sum+s[i]*c[i];
            cresum=cresum+c[i];
        }
        System.out.println("CGPA is:"+(sum/cresum));
        
    }
    
}
