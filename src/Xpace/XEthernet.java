
package Xpace;

public class XEthernet extends XPort {
        public XEthernet(){
            System.out.println("Build XEthernet");
        }
   
        public String toString(){
        return device+" IP : "+this.ip + " : "+"MAC : "+this.mac+" connected to "+port.device+" IP : "+this.port.ip+" MAC : "+this.port.mac ;
    }
    
    
}
