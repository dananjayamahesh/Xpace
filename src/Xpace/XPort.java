/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xpace;

/**
 *
 * @author User
 */
public class XPort {
    public static enum Mode{SIMPLEX,HALF_DUPLEX,DUPLEX};
    public String ip;
    public String mac;
    public Mode mode;
    public XMedia media;
    public XPort port;
    public XDevice device;    
    
    public XPort(){
        
    }
    
   public String toString(){
        return device+"IP : "+this.ip + " : "+"MAC : "+this.mac+"\nIP : "+this.port.ip+" MAC : "+this.port.mac ;
    }
    
}
