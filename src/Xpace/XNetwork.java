/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xpace;

/**
 *
 * @author User
 */
public class XNetwork extends Xpace {
    XRouter router1;
    XRouter router2;
    XPort port1;
    XPort port2;
    XMedia media1;
    XMedia media2;
    
    
    public XNetwork(){
          
              // buildNetwork();    
           
    }
    public boolean buildNetwork(){
         router1=new XRouter();
           router2=new XRouter();
           port1=new XEthernet();
           port2=new XEthernet();
           media1=new XMedia();
           media2=new XMedia();
           
           router1.hostname="CISCO_ROUTER1";
           port1.ip="192.168.1.1";
           port1.mac="00:11:22:33:44:55";
           port1.mode=XPort.Mode.DUPLEX;
        
           router1.addXPorts(port1);
           port1.device=router1;
           port1.port=port2;
           
           
           router2.hostname="CISCO_ROUTER2";
           port2.ip="192.168.1.2";
           port2.mac="11:22:33:44:55:66";
           port2.mode=XPort.Mode.DUPLEX;
           router2.addXPorts(port2);
           port2.device=router2;
           port2.port=port1;
          
           return true;
    }
    public static void main(String []args){
         XNetwork network1=new XNetwork();
         network1.buildNetwork();
         network1.router1.showXPorts();
           network1.router2.showXPorts();
           
           XGui gui=new XGui();
           gui.setVisible(true);
           gui.addXDevice(network1.router1);
             gui.addXDevice(network1.router2);
             gui.isNet=true;
          gui.addXPort(network1.port1);
           
        
    }
}
