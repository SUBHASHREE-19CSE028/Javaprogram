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
public class distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the values:");
       int x1=obj.nextInt();
       int x2=obj.nextInt();
       int y1=obj.nextInt();
       int y2=obj.nextInt();
       int d;
       d=((x1-x2)^2)+((y1-y2)^2);
       System.out.println("Distance is"+Math.sqrt(d));
       
    }
    
}
