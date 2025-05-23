/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AidReceipient;

import DataConfiguration.Organization;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.organization.AidReceipent.AidReceipentProfile;
import model.organization.AidReceipent.AidRequest;
import model.organization.DonationManagement.Donation;

/**
 *
 * @author rugvedgundawar
 */
public class AidReceipientHistoryJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    AidReceipentProfile aidReceipentProfile;
    Organization organization;
    /**
     * Creates new form AidReceipientHistoryJPanel
     */
    public AidReceipientHistoryJPanel(JPanel userProcessContainer, AidReceipentProfile aidReceipentProfile, Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.aidReceipentProfile = aidReceipentProfile;
        this.organization = organization;
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        btnRemoveAidrequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sora ExtraBold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("AID Request History");

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Amount", "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);
        if (tblHistory.getColumnModel().getColumnCount() > 0) {
            tblHistory.getColumnModel().getColumn(0).setResizable(false);
            tblHistory.getColumnModel().getColumn(1).setResizable(false);
            tblHistory.getColumnModel().getColumn(2).setResizable(false);
            tblHistory.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRemoveAidrequest.setBackground(new java.awt.Color(255, 51, 51));
        btnRemoveAidrequest.setFont(new java.awt.Font("Sora Medium", 0, 14)); // NOI18N
        btnRemoveAidrequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveAidrequest.setText("Remove");
        btnRemoveAidrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAidrequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(btnRemoveAidrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRemoveAidrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveAidrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAidrequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHistory.getSelectedRow();

    if (selectedRow < 0) {
        // No row selected, show a message
        JOptionPane.showMessageDialog(this, "Please select a row to remove.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the corresponding AidRequest object from the table
    AidRequest selectedRequest = (AidRequest) tblHistory.getValueAt(selectedRow, 0);

    if (!selectedRequest.getStatus().equals(AidRequest.RequestStatus.PENDING)) {
        JOptionPane.showMessageDialog(this, "Only requests with status 'PENDING' can be removed.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Remove the AidRequest from the organization's AidRequest list
    organization.getAidRequestDirectory().getAidRequestList().remove(selectedRequest);

    // Refresh the table
    populateTable();

    // Show success message
    JOptionPane.showMessageDialog(this, "Aid Request removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRemoveAidrequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveAidrequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHistory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHistory.getModel();
        model.setRowCount(0);
        for (AidRequest ad : organization.getAidRequestDirectory().getAidRequestList()) {
            
            if(ad.getAidReceipentProfile() == this.aidReceipentProfile)
            {
                Object[] row = new Object[5];
                row[0] = ad;
                row[1] = ad.getAmountNeeded();
                row[2] = ad.getRequestDate();
                row[3] = ad.getStatus();
                ((DefaultTableModel) tblHistory.getModel()).addRow(row);
            }
        }
    }
}
