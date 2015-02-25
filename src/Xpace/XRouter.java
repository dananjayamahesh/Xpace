/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xpace;

/**
 *
 * @author User
 */
public class XRouter extends XDevice{
    public String hostname;
     public XRouter(){
         
         this.hostname="XRouter";
         System.out.println("Build XRouter");
     }
      public String toString(){
        return this.hostname;
    }
      
    
}
