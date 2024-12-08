/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

/**
 *
 * @author sahar
 */
import DataConfiguration.Enterprise;
import DataConfiguration.Network;
import DataConfiguration.Organization;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.organization.DonationManagement.DonationHistory;

public class ResourceInventory {
    private Map<Resource, Integer> inventory;
    private Map<Resource, Integer> minimumThresholds;
    private ArrayList<InventoryUpdateListener> updateListeners;
    private final Object lockObject = new Object();

    public ResourceInventory() {
        this.inventory = new ConcurrentHashMap<>();
        this.minimumThresholds = new HashMap<>();
        this.updateListeners = new ArrayList<>();
    }

    // Resource Management
    public void addResource(Resource resource, int quantity) {
        synchronized(lockObject) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            inventory.put(resource, inventory.getOrDefault(resource, 0) + quantity);
            checkThresholds(resource);
            notifyListeners(resource);
        }
    }

    public boolean deductResources(Map<Resource, Integer> resources) {
        synchronized(lockObject) {
            // First check if we have enough of all resources
            if (!hasAvailableResources(resources)) {
                return false;
            }

            // If we have enough, deduct them
            for (Map.Entry<Resource, Integer> entry : resources.entrySet()) {
                Resource resource = entry.getKey();
                int quantity = entry.getValue();
                int currentQuantity = inventory.getOrDefault(resource, 0);
                inventory.put(resource, currentQuantity - quantity);
                checkThresholds(resource);
                notifyListeners(resource);
            }
            return true;
        }
    }

    // Availability Checking
    public boolean hasAvailableResources(Map<Resource, Integer> requiredResources) {
        for (Map.Entry<Resource, Integer> entry : requiredResources.entrySet()) {
            Resource resource = entry.getKey();
            int requiredQuantity = entry.getValue();
            int availableQuantity = inventory.getOrDefault(resource, 0);
            if (availableQuantity < requiredQuantity) {
                return false;
            }
        }
        return true;
    }

    public boolean checkAvailability(Resource resource) {
        return inventory.getOrDefault(resource, 0) > minimumThresholds.getOrDefault(resource, 0);
    }

    // Threshold Management
    public void setMinimumThreshold(Resource resource, int threshold) {
        minimumThresholds.put(resource, threshold);
        checkThresholds(resource);
    }

    private void checkThresholds(Resource resource) {
        int currentQuantity = inventory.getOrDefault(resource, 0);
        int threshold = minimumThresholds.getOrDefault(resource, 0);
        if (currentQuantity <= threshold) {
            notifyLowStock(resource, currentQuantity, threshold);
        }
    }

    // Update Management
    public void updateResourceQuantity(Resource resource, int newQuantity) {
        synchronized(lockObject) {
            if (newQuantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            inventory.put(resource, newQuantity);
            checkThresholds(resource);
            notifyListeners(resource);
        }
    }

    // Listener Pattern Implementation
    public void addUpdateListener(InventoryUpdateListener listener) {
        updateListeners.add(listener);
    }

    public void removeUpdateListener(InventoryUpdateListener listener) {
        updateListeners.remove(listener);
    }

    private void notifyListeners(Resource resource) {
        int quantity = inventory.getOrDefault(resource, 0);
        for (InventoryUpdateListener listener : updateListeners) {
            listener.onInventoryUpdate(resource, quantity);
        }
    }

    private void notifyLowStock(Resource resource, int currentQuantity, int threshold) {
        for (InventoryUpdateListener listener : updateListeners) {
            listener.onLowStock(resource, currentQuantity, threshold);
        }
    }

    // Getters
    public Map<Resource, Integer> getCurrentInventory() {
        return new HashMap<>(inventory);
    }

    public int getResourceQuantity(Resource resource) {
        return inventory.getOrDefault(resource, 0);
    }

    // Interface for inventory updates
    public interface InventoryUpdateListener {
        void onInventoryUpdate(Resource resource, int newQuantity);
        void onLowStock(Resource resource, int currentQuantity, int threshold);
    }
}
//
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
// */
//package ui.DataAnalyst;
//
//import AidRequest.Resource;
//import DataConfiguration.Enterprise;
//import DataConfiguration.Network;
//import DataConfiguration.Organization;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//import javax.swing.JPanel;
//import javax.swing.table.DefaultTableModel;
//import model.organization.DonationManagement.Donation;
//import model.organization.DonationManagement.DonationHistory;
//
///**
// *
// * @author rugvedgundawar
// */
//public class ResourcesReportJPanel extends javax.swing.JPanel {
//
//    JPanel userProcessContainer;
//    Network network;
//    Organization organization;
//    Resource resource;
//    /**
//     * Creates new form ResourcesReport
//     */
//    public ResourcesReportJPanel(JPanel userProcessContainer, Network network, Organization organization) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.network = network;
//        this.organization = organization;
//       
//        Enterprise enterprise = network.getEnterpriseDirectory().findEnterprise("Community Support Enterprise");
//        System.out.println("Found enterprise: " + (enterprise!= null? "yes":"no"));
//        
//        this.organization = enterprise.getOrganizationDirectory().findOrganization("Donation Management");
//        System.out.println("Found organization: " + (this.organization!= null? "yes":"no"));
//        
//        resource = organization.getResource();
//        System.out.println("Found resource: " + (resource!= null? "yes":"no"));
//        
//        List<DonationHistory> history = resource.getDonationHistory();
//        System.out.println("Donation history size: " + history.size());
//        
//        for(DonationHistory dh: history){
//            System.out.println("Donation amount: " + dh.getAmount());
//        }
//        txtAmount.setText(Double.toString(resource.getTotalDonations()));
//        txtCount.setText(Integer.toString(resource.getTotalDonationCount()));
//        populateTable();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        jLabel1 = new javax.swing.JLabel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        tblDonationHistory = new javax.swing.JTable();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        txtAmount = new javax.swing.JTextField();
//        txtCount = new javax.swing.JTextField();
//        jLabel4 = new javax.swing.JLabel();
//
//        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
//        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel1.setText("Resources Report");
//
//        tblDonationHistory.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null},
//                {null, null},
//                {null, null},
//                {null, null}
//            },
//            new String [] {
//                "Donation Amount", "Donation Received"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jScrollPane1.setViewportView(tblDonationHistory);
//        if (tblDonationHistory.getColumnModel().getColumnCount() > 0) {
//            tblDonationHistory.getColumnModel().getColumn(0).setResizable(false);
//            tblDonationHistory.getColumnModel().getColumn(1).setResizable(false);
//        }
//
//        jLabel2.setText("Donation History");
//
//        jLabel3.setText("Total Donation:");
//
//        txtAmount.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                txtAmountActionPerformed(evt);
//            }
//        });
//
//        txtCount.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                txtCountActionPerformed(evt);
//            }
//        });
//
//        jLabel4.setText("Donation Count:");
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//        this.setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addGroup(layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jLabel2)
//                            .addGroup(layout.createSequentialGroup()
//                                .addComponent(jLabel3)
//                                .addGap(18, 18, 18)
//                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(18, 18, 18)
//                                .addComponent(jLabel4)
//                                .addGap(18, 18, 18)
//                                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                        .addGap(0, 201, Short.MAX_VALUE)))
//                .addContainerGap())
//        );
//
//        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, txtAmount, txtCount});
//
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(17, 17, 17)
//                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addComponent(jLabel2)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                        .addComponent(jLabel4)
//                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                        .addComponent(jLabel3)
//                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addContainerGap(256, Short.MAX_VALUE))
//        );
//
//        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, txtAmount, txtCount});
//
//    }// </editor-fold>                        
//
//    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        // TODO add your handling code here:
//    }                                         
//
//    private void txtCountActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//    }                                        
//
//
//    // Variables declaration - do not modify                     
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JTable tblDonationHistory;
//    private javax.swing.JTextField txtAmount;
//    private javax.swing.JTextField txtCount;
//    // End of variables declaration                   
//
//    private void populateTable() {
//        DefaultTableModel tableModel = (DefaultTableModel) tblDonationHistory.getModel();
//        tableModel.setRowCount(0);
//        System.out.println("Populating table with history size: " + resource.getDonationHistory().size());
//        
//        for (DonationHistory dh : resource.getDonationHistory()) {
//                Object[] row ={
//                            String.format("$%.2f", dh.getAmount()),
//                            dh.getTimestamp()
//                        };
//                        tableModel.addRow(row);        
//                        System.out.println("Added row: " + row[0] + "at" + row[1]);
//        }
//    }
//}
