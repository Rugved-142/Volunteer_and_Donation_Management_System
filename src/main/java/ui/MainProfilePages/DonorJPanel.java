/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.MainProfilePages;

import DataConfiguration.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.organization.DonationManagement.Donor;
import model.organization.VolunteerManagement.VolunteerProfile;
import ui.DonationManagement.DonationHistoryJPanel;
import ui.DonationManagement.NewDonationJPanel;
import ui.LoginPageJPanel;
import ui.RegistrationPanels.DonorRegistrationJPanel;

/**
 *
 * @author Sarthak
 */
public class DonorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    Donor donor;
    
    /**
     * Creates new form VolunteerCoordinatorJPanel
     */
    public DonorJPanel(JPanel userProcessContainer, Network network, Donor donor) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network = network;
        this.donor = donor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        DonorOptionsJPanel = new javax.swing.JPanel();
        btnDonateMoney = new javax.swing.JButton();
        btnDonateResources = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DonorWorkArea = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(150);

        DonorOptionsJPanel.setBackground(new java.awt.Color(0, 32, 41));
        DonorOptionsJPanel.setMinimumSize(new java.awt.Dimension(238, 0));
        DonorOptionsJPanel.setPreferredSize(new java.awt.Dimension(238, 518));

        btnDonateMoney.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        btnDonateMoney.setText("Donate Money");
        btnDonateMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateMoneyActionPerformed(evt);
            }
        });

        btnDonateResources.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        btnDonateResources.setText("Donation History");
        btnDonateResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateResourcesActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 30, 0));
        btnLogout.setFont(new java.awt.Font("Sora Medium", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sora ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>Donor Panel</html>");

        javax.swing.GroupLayout DonorOptionsJPanelLayout = new javax.swing.GroupLayout(DonorOptionsJPanel);
        DonorOptionsJPanel.setLayout(DonorOptionsJPanelLayout);
        DonorOptionsJPanelLayout.setHorizontalGroup(
            DonorOptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorOptionsJPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DonorOptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDonateMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonateResources, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        DonorOptionsJPanelLayout.setVerticalGroup(
            DonorOptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorOptionsJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonateMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonateResources, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jSplitPane1.setLeftComponent(DonorOptionsJPanel);

        DonorWorkArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(DonorWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateResourcesActionPerformed
        // TODO add your handling code here:
        DonationHistoryJPanel dnthstry = new DonationHistoryJPanel(DonorWorkArea, network , donor);
        DonorWorkArea.removeAll();
        DonorWorkArea.add(dnthstry);
        CardLayout layout = (CardLayout) DonorWorkArea.getLayout();
        layout.next(DonorWorkArea);
    }//GEN-LAST:event_btnDonateResourcesActionPerformed

    private void btnDonateMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateMoneyActionPerformed
        // TODO add your handling code here:
        NewDonationJPanel newdnt = new NewDonationJPanel(DonorWorkArea, network , donor);
        DonorWorkArea.removeAll();
        DonorWorkArea.add(newdnt);
        CardLayout layout = (CardLayout) DonorWorkArea.getLayout();
        layout.next(DonorWorkArea);
    }//GEN-LAST:event_btnDonateMoneyActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
            // Clear the current DonorWorkArea
        DonorWorkArea.removeAll();

        // Clear the parent container
        userProcessContainer.removeAll();

        // Create and show login panel (or whatever your initial panel is)
        // Assuming your login panel is called LoginJPanel
        LoginPageJPanel loginPanel = new LoginPageJPanel(userProcessContainer, network);
        userProcessContainer.add(loginPanel);

        // Refresh the container
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // Optional: Reset any session data
        this.donor = null;
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DonorOptionsJPanel;
    private javax.swing.JPanel DonorWorkArea;
    private javax.swing.JButton btnDonateMoney;
    private javax.swing.JButton btnDonateResources;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
