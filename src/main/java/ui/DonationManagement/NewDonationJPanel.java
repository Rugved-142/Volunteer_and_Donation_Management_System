/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DonationManagement;

import DataConfiguration.Enterprise;
import DataConfiguration.Network;
import DataConfiguration.Organization;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.organization.DonationManagement.Donation;
import model.organization.DonationManagement.DonationHistory;
import model.organization.DonationManagement.Donor;

/**
 *
 * @author sahar
 */
public class NewDonationJPanel extends javax.swing.JPanel {
        JPanel userProcessContainer;
    Network network;
    Donor donor;
    /**
     * Creates new form NewDonationJPanel
     */
    public NewDonationJPanel(JPanel userProcessContainer, Network network, Donor donor) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network = network;
        this.donor = donor;
        
        txtDonorName.setText(donor.getLoginName());
        txtDonorId.setText(donor.getPerson().getPersonId());
        
        txtDonorName.setEditable(false);
        txtDonorId.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDonate = new javax.swing.JButton();
        txtDonationAmt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDonorId = new javax.swing.JTextField();
        txtDonorName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Sora ExtraBold", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Donation");

        jPanel1.setBackground(new java.awt.Color(221, 246, 226));

        btnDonate.setBackground(new java.awt.Color(0, 204, 0));
        btnDonate.setFont(new java.awt.Font("Sora ExtraBold", 0, 14)); // NOI18N
        btnDonate.setForeground(new java.awt.Color(255, 255, 255));
        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        txtDonationAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonationAmtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel5.setText("Amount");

        jLabel3.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel3.setText("Donor Id");

        txtDonorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorIdActionPerformed(evt);
            }
        });

        txtDonorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        jLabel1.setText("Donor Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonorName, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtDonorId)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(txtDonationAmt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDonorId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDonationAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorNameActionPerformed

    private void txtDonorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorIdActionPerformed

    private void txtDonationAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonationAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonationAmtActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        try{
            String amountTxt = txtDonationAmt.getText();
            if(amountTxt.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter amount", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double amount;
            try{
                amount = Double.parseDouble(amountTxt);
                if(amount<=0){
                    JOptionPane.showMessageDialog(this, "Pleaase enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Pleaase enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Enterprise communityEnterprise = null;
            Organization donationOrg = null;
            
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getName().equals("Community Support Enterprise")) {
                    communityEnterprise = enterprise;
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (org.getName().equals("Donation Management")) {
                            donationOrg = org;
                            break;
                        }
                    }
                    break;
                }
            }
            if (donationOrg == null) {
                JOptionPane.showMessageDialog(this, "Donation organization not found", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            donationOrg.processNewDonation(amount, donor);
            
            String message = String.format("Thank you for your donation of $%.2f\n" + "Total funds available: $%.2f",amount, donationOrg.getResource().getAvailableFunds());
            JOptionPane.showMessageDialog(this, message, "Donation Successful", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, donationOrg.getResource().getAvailableFunds(), "Donation Successful", JOptionPane.INFORMATION_MESSAGE);
            txtDonationAmt.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error Processing Donation" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDonateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDonationAmt;
    private javax.swing.JTextField txtDonorId;
    private javax.swing.JTextField txtDonorName;
    // End of variables declaration//GEN-END:variables
}
