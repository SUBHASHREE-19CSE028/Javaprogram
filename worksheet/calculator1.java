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
public class calculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2,b=4;
      Scanner obj=new Scanner(System.in);
      char c=obj.next().charAt(0);
      switch(c)
      {
          case '+':
              System.out.println(a+b);
              break;
          case '-':
              System.out.println(a-b);
              break;
          case '*':
              System.out.println(a*b);
              break;
          case '/':
              System.out.println(a/b);
              break;
          default:System.out.println("no");
      }
    }
    
    }
    

