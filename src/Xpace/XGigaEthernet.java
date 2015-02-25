
package Xpace;

public class XGigaEthernet extends XPort{
    public XGigaEthernet(){
         System.out.println("Build XGigaEthernet");
    }
    public String toString(){
        return device.hostname+"IP : "+this.ip + " : "+"MAC : "+this.mac+"\nIP : "+this.port.ip+" MAC : "+this.port.mac ;
    }
    
    
}
