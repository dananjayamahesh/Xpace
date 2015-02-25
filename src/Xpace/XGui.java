
package Xpace;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class XGui extends javax.swing.JFrame {
  public int  graph [][];
  
    public XGui() {
        initComponents();
        setSize(1000, 1000);
        setBackground(Color.white);
        setVisible(true);
    }
     public boolean isSet;
    public boolean isNet;
    public boolean addXDevice(XDevice device){
        if(!isNet){
        if(!isSet){
        JPanel panel=new JPanel();
        panel.setBackground(Color.green);
        panel.setBounds(30, 30, 100, 100);
            JButton routerLabel=new JButton();       
        routerLabel.setBounds(30, 30, 200, 100);
        routerLabel.setText(device+"");
        routerLabel.setBackground(Color.green);
        add(routerLabel);
        isSet=true;
        }else{
          JPanel panel=new JPanel();
        panel.setBackground(Color.green);
        panel.setBounds(530, 30, 100, 100);
            JButton routerLabel=new JButton();        
        routerLabel.setBounds(530, 30, 200, 100);
        routerLabel.setText(device+"");
        routerLabel.setBackground(Color.green);
        add(routerLabel);  
        }
        }
        else{
            
        }
        return true;
    }
    
    
    public boolean addXPort(XPort port){
         JPanel panel=new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(230, 65, 300, 20);
            JButton routerLabel=new JButton();        
        routerLabel.setBounds(230, 65, 300, 20);
        routerLabel.setText("Ethernet"+"");
        routerLabel.setBackground(Color.red);
        add(routerLabel);
       return true; 
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
