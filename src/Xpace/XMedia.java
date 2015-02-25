/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xpace;

/**
 *
 * @author User
 */
public class XMedia extends Xpace {
    public static enum mode{SIMPLEX,DUPLEX,HALF_DUPLEX};
    public static enum flow{INPUT,OUTPUT,INOUT};
    public static enum operation{ON,OFF,SLEEP,SHUTDOWN};
    public double speed;
    public XPort inport;
    public XPort outport;
    
   public XMedia(){
         System.out.println("Build XMedia");
    }
    
}
