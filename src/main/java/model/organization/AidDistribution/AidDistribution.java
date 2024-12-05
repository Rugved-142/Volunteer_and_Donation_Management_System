/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidDistribution;


import AidRequest.DistributionStatus;
import AidRequest.Resource;
import java.util.List;
import java.util.Map;
import model.organization.AidReceipent.AidRequest;
import model.organization.DonationManagement.Donation;

/**
 *
 * @author sahar
 */
public class AidDistribution {
    private Resource resource;
    private double remainingResources;
    private Map<Resource, Integer> requiredResources;
    private String id;
    private DistributionStatus status;

    public DistributionStatus getStatus() {
        return status;
    }

    public void setStatus(DistributionStatus status) {
        this.status = status;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Resource, Integer> getRequiredResources() {
        return requiredResources;
    }

    public void setRequiredResources(Map<Resource, Integer> requiredResources) {
        this.requiredResources = requiredResources;
    }
    
    public AidDistribution(Resource resource){
        this.resource = resource;
        this.remainingResources = resource.getAvailableFunds();
    }
    
    public void processNewDonation(Donation donation){
        resource.addFunds(donation.getAmount());
        this.remainingResources = resource.getAvailableFunds();
    }
    
    public boolean processAidRequest(AidRequest request){
        if(remainingResources >= request.getAmountNeeded()){
            request.setStatus(AidRequest.RequestStatus.PENDING);
            return true;
        } else {
        request.setStatus(AidRequest.RequestStatus.REJECTED);
        return false;
        }
    }
    
    public void approveRequest(AidRequest request) {
        if (resource.allocateFunds(request.getAmountNeeded())) {
            request.setStatus(AidRequest.RequestStatus.APPROVED);
            remainingResources = resource.getAvailableFunds();
        }
    }

    public void denyRequest(AidRequest request) {
        request.setStatus(AidRequest.RequestStatus.REJECTED);
    }

    public double getRemainingResources() {
        return remainingResources;
    }
    
}



//import java.util.*;
//import model.client.AidRecipient;
//
//public class AidDistribution {
//    private String id;
//    private AidRecipient recipient;
//    private Map<Resource, Integer> requiredResources;
//    private DistributionStatus status;
//    private Date distributionDate;
//    private Date completionDate;
//    private String distributionLocation;
//    private String notes;
//    private List<DistributionStatusUpdate> statusHistory;
//
//    public AidDistribution(String id, AidRecipient recipient, Map<Resource, Integer> requiredResources) {
//        this.id = id;
//        this.recipient = recipient;
//        this.requiredResources = requiredResources;
//        this.status = DistributionStatus.PENDING;
//        this.distributionDate = new Date();
//        this.statusHistory = new ArrayList<>();
//        addStatusUpdate(DistributionStatus.PENDING, "Distribution created");
//    }
//
//    // Status management
//    public void updateStatus(DistributionStatus newStatus, String comment) {
//        this.status = newStatus;
//        addStatusUpdate(newStatus, comment);
//    }
//
//    private void addStatusUpdate(DistributionStatus status, String comment) {
//        DistributionStatusUpdate update = new DistributionStatusUpdate(
//            status, 
//            new Date(), 
//            comment
//        );
//        statusHistory.add(update);
//    }
//
//    // Resource management
//    public void addResource(Resource resource, int quantity) {
//        requiredResources.put(resource, requiredResources.getOrDefault(resource, 0) + quantity);
//    }
//
//    public void removeResource(Resource resource) {
//        requiredResources.remove(resource);
//    }
//
//    // Getters and Setters
//    public String getId() {
//        return id;
//    }
//
//    public AidRecipient getRecipient() {
//        return recipient;
//    }
//
//    public Map<Resource, Integer> getRequiredResources() {
//        return new HashMap<>(requiredResources);
//    }
//
//    public DistributionStatus getCurrentStatus() {
//        return status;
//    }
//
//    public Date getDistributionDate() {
//        return distributionDate;
//    }
//
//    public void setDistributionLocation(String location) {
//        this.distributionLocation = location;
//    }
//
//    public String getDistributionLocation() {
//        return distributionLocation;
//    }
//
//    public List<DistributionStatusUpdate> getStatusHistory() {
//        return new ArrayList<>(statusHistory);
//    }
//
//    // Helper class for status updates
//    private static class DistributionStatusUpdate {
//        private DistributionStatus status;
//        private Date updateTime;
//        private String comment;
//
//        public DistributionStatusUpdate(DistributionStatus status, Date updateTime, String comment) {
//            this.status = status;
//            this.updateTime = updateTime;
//            this.comment = comment;
//        }
//    }
//}
