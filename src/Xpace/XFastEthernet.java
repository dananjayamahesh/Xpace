
package Xpace;

public class XFastEthernet extends XPort {
      public XFastEthernet(){
           System.out.println("Build XFastEthernet");
      }
      public String toString(){
        return device.hostname+"IP : "+this.ip + " : "+"MAC : "+this.mac+"\nIP : "+this.port.ip+" MAC : "+this.port.mac ;
    }
    
    
}
