/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import AidRequest.Resource;
import DataConfiguration.Enterprise;
import DataConfiguration.Network;
import DataConfiguration.Organization;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.organization.DonationManagement.DonationHistory;

/**
 *
 * @author rugvedgundawar
 */
public class AdminResourcesJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    Organization organization;
    Resource resource;
    /**
     * Creates new form AdminResources
     */
    public AdminResourcesJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        
        Enterprise enterprise = network.getEnterpriseDirectory().findEnterprise("Community Support Enterprise");
        System.out.println("Found enterprise: " + (enterprise!= null? "yes":"no"));
        
        this.organization = enterprise.getOrganizationDirectory().findOrganization("Donation Management");
        System.out.println("Found organization: " + (this.organization!= null? "yes":"no"));
        
        resource = organization.getResource();
        System.out.println("Found resource: " + (resource!= null? "yes":"no"));
        
        List<DonationHistory> history = resource.getDonationHistory();
        System.out.println("Donation history size: " + history.size());
        
        for(DonationHistory dh: history){
            System.out.println("Donation amount: " + dh.getAmount());
        }
        txtAmount.setText(Double.toString(resource.getTotalDonations()));
        txtCount.setText(Integer.toString(resource.getTotalDonationCount()));
        txtRemainingRes.setText(Double.toString(resource.getAvailableFunds()));
        populateTable();
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
        tblDonationHistory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRemainingRes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tblDonationHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donation Amount", "Donation Received"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonationHistory);

        jLabel2.setFont(new java.awt.Font("Sora ExtraBold", 0, 14)); // NOI18N
        jLabel2.setText("Donation History");

        jPanel1.setBackground(new java.awt.Color(221, 246, 226));

        jLabel3.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel3.setText("Total Donation:");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel5.setText("Remaining Resources");

        txtRemainingRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemainingResActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel4.setText("Donation Count:");

        txtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtRemainingRes, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemainingRes))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountActionPerformed

    private void txtRemainingResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemainingResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemainingResActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDonationHistory;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtRemainingRes;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel tableModel = (DefaultTableModel) tblDonationHistory.getModel();
        tableModel.setRowCount(0);
        System.out.println("Populating table with history size: " + resource.getDonationHistory().size());
        
        for (DonationHistory dh : resource.getDonationHistory()) {
                Object[] row ={
                            String.format("$%.2f", dh.getAmount()),
                            dh.getTimestamp()
                        };
                        tableModel.addRow(row);        
                        System.out.println("Added row: " + row[0] + "at" + row[1]);
        }
    }
}
