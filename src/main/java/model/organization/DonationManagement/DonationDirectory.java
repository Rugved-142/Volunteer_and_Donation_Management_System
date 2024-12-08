/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DonationManagement;

import AidRequest.Resource;
import DataConfiguration.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sahar
 */
public class DonationDirectory {
    private ArrayList<Donation> donations;
    private Resource resource;
    Organization organization;
    
    public DonationDirectory(Organization organization){
        this.organization = organization;
        donations = new ArrayList<>();
//        this.resource = organization.getResource();
//        if (this.resource == null) {
//            this.resource = new Resource();
//            organization.setResource(this.resource);
//        }
    }
    
    public void processDonation(double amount, Donor donor){
        // Create new donation
        Donation donation = new Donation(amount, donor);
        donations.add(donation);
        
        // Add funds to the organization's resource
        Resource resource = organization.getResource();
        resource.addFunds(amount);

        
        System.out.println("Donation processed - Updated funds: $" + resource.getAvailableFunds());
    }
    
    public double getAvailableFunds(){
        return organization.getResource().getAvailableFunds();
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }
    
    public List<DonationHistory> getDonationHistory() {
        return organization.getResource().getDonationHistory();
    }
    
    public double getTotalDonations() {
        return organization.getResource().getTotalDonations();
    }
    
    public int getDonationCount() {
        return organization.getResource().getTotalDonationCount();
    }
    
    public boolean allocateFunds(double amount) {
        return organization.getResource().allocateFunds(amount);
    }
    
    public Resource getResource() {
        return organization.getResource();
    }
    
    
}
