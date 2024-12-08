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
        resource = new Resource();
    }
    
    public void processDonation(double amount, String donorName){
        Donation donation = new Donation(amount, donorName);
        donations.add(donation);
        
        resource.addFunds(amount);
    }
    
    public double getAvailableFunds(){
        return resource.getAvailableFunds();
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }
    
    public List<DonationHistory> getDonationHistory(){
        return resource.getDonationHistory();
    }
    
    public double getTotalDonations(){
        return resource.getTotalDonations();
    }
    
    public int getDonationCount(){
        return resource.getTotalDonationCount();
    }
    
    public boolean allocateFunds(double amount){
        return resource.allocateFunds(amount);
    }
    
    public Resource getResource() {
        return resource;
    }
    
    
}
