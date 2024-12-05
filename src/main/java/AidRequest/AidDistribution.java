/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

/**
 *
 * @author sahar
 */

import java.util.*;
import model.client.AidRecipient;

public class AidDistribution {
    private String id;
    private AidRecipient recipient;
    private Map<Resource, Integer> requiredResources;
    private DistributionStatus status;
    private Date distributionDate;
    private Date completionDate;
    private String distributionLocation;
    private String notes;
    private List<DistributionStatusUpdate> statusHistory;

    public AidDistribution(String id, AidRecipient recipient, Map<Resource, Integer> requiredResources) {
        this.id = id;
        this.recipient = recipient;
        this.requiredResources = requiredResources;
        this.status = DistributionStatus.PENDING;
        this.distributionDate = new Date();
        this.statusHistory = new ArrayList<>();
        addStatusUpdate(DistributionStatus.PENDING, "Distribution created");
    }

    // Status management
    public void updateStatus(DistributionStatus newStatus, String comment) {
        this.status = newStatus;
        addStatusUpdate(newStatus, comment);
    }

    private void addStatusUpdate(DistributionStatus status, String comment) {
        DistributionStatusUpdate update = new DistributionStatusUpdate(
            status, 
            new Date(), 
            comment
        );
        statusHistory.add(update);
    }

    // Resource management
    public void addResource(Resource resource, int quantity) {
        requiredResources.put(resource, requiredResources.getOrDefault(resource, 0) + quantity);
    }

    public void removeResource(Resource resource) {
        requiredResources.remove(resource);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public AidRecipient getRecipient() {
        return recipient;
    }

    public Map<Resource, Integer> getRequiredResources() {
        return new HashMap<>(requiredResources);
    }

    public DistributionStatus getCurrentStatus() {
        return status;
    }

    public Date getDistributionDate() {
        return distributionDate;
    }

    public void setDistributionLocation(String location) {
        this.distributionLocation = location;
    }

    public String getDistributionLocation() {
        return distributionLocation;
    }

    public List<DistributionStatusUpdate> getStatusHistory() {
        return new ArrayList<>(statusHistory);
    }

    // Helper class for status updates
    private static class DistributionStatusUpdate {
        private DistributionStatus status;
        private Date updateTime;
        private String comment;

        public DistributionStatusUpdate(DistributionStatus status, Date updateTime, String comment) {
            this.status = status;
            this.updateTime = updateTime;
            this.comment = comment;
        }
    }
}
