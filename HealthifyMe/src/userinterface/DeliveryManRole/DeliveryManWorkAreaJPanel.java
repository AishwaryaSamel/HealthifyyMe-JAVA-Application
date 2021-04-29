/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.StoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private EcoSystem business;
    private Enterprise enterprise;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */

    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        greetLbl.setText(account.getEmployee().getName() + "!!");
        delManTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
      
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) delManTbl.getModel();
        dtm.setRowCount(0);
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(WorkRequest request: o.getWorkQueue().getWorkRequestList() ) {
            if(request.getReceiver() != null && request.getReceiver().getEmployee().getName().equals(userAccount.getEmployee().getName())){
            Object row[] = new Object[4];
            row[0] = request.getRequestID();
            row[1] = request.getSender().getCustomer().getName();
            row[2] = request;
            row[3] = request.getStatus();
            dtm.addRow(row);
        }
    }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        delManTbl = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delManTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        delManTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer Name", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(delManTbl);
        if (delManTbl.getColumnModel().getColumnCount() > 0) {
            delManTbl.getColumnModel().getColumn(0).setResizable(false);
            delManTbl.getColumnModel().getColumn(1).setResizable(false);
            delManTbl.getColumnModel().getColumn(2).setResizable(false);
            delManTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 730, 96));

        processJButton.setBackground(new java.awt.Color(102, 153, 0));
        processJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        processJButton.setText("Mark as Delivered");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 270, 150, 50));

        refreshJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 120, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Welcome,");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -40, 120, 140));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -50, 320, 160));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/deliveryBg.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1230, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = delManTbl.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        StoreWorkRequest request = (StoreWorkRequest) delManTbl.getValueAt(selectedRow, 2);
        if(request.getStatus() == "Delivered"){
            JOptionPane.showMessageDialog(null, "The order has been already Delivered.","Error",JOptionPane.ERROR_MESSAGE);
            populateTable();
        }else{
             request.setStatus("Delivered");
            JOptionPane.showMessageDialog(null, "The order has been delivered successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable delManTbl;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}