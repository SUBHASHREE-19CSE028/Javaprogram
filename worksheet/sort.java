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
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i,j,t;
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        System.out.println("Enter the elements:");
        int a[];
        a = new int[n];
        for(i=0;i<n;i++)
        { 
            a[i]=obj.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            System.out.println("The element "+i+":"+a[i]);
        }
        for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
              }
          }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
    }
    
}
