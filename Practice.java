/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author satyaki dixit
 */
public class Practice {
    Number pp ;
    Integer op = 34;
    Float qp;
    public static void main(String kk[])
    {  
        Object pop = new Object()
        {
           public int hashcode()
           {
               return 42;
           }
           
        };   
        System.out.println(pop.hashCode());
        String po = "satyaki";
        System.out.print(po.hashCode());
       
        Practice i = new Practice();
        System.out.print(i.op);
        
    }

   
    
    
    
}
