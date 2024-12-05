/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidDistribution;

import AidRequest.AidRequest;
import AidRequest.Resource;
import java.util.List;
import model.organization.DonationManagement.Donation;

/**
 *
 * @author sahar
 */
public class AidDistribution {
    private Resource resource;
    private double remainingResources;
    
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
