/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xpace;

/**
 *
 * @author User
 */
public class XSwitch extends XDevice {
        public String hostname;
    public XSwitch(){
         this.hostname="XSwitch";
         System.out.println("Build XSwitch");
    }
     public String toString(){
        return this.hostname;
    }
    
}
