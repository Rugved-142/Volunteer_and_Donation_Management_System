/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidDistribution;

import model.organization.AidReceipent.AidRequest;

/**
 *
 * @author sahar
 */
public class DistributionAnalysis {
    private AidDistribution distribution;
    
    public DistributionAnalysis(AidDistribution distribution) {
        this.distribution = distribution;
    }
    
    public double getTotalAllocatedAmount() {
        return distribution.getAssociatedRequests().stream()
            .filter(r -> r.getStatus() == AidRequest.RequestStatus.APPROVED)
            .mapToDouble(AidRequest::getAmountNeeded)
            .sum();
    }
    
    public int getTotalRequestsProcessed() {
        return distribution.getAssociatedRequests().size();
    }
    
    public int getApprovedRequestsCount() {
        return (int) distribution.getAssociatedRequests().stream()
            .filter(r -> r.getStatus() == AidRequest.RequestStatus.APPROVED)
            .count();
    }
    
    public int getRejectedRequestsCount() {
        return (int) distribution.getAssociatedRequests().stream()
            .filter(r -> r.getStatus() == AidRequest.RequestStatus.REJECTED)
            .count();
    }
}
