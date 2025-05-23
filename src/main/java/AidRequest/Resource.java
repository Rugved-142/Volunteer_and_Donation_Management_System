/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

import DataConfiguration.Organization;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.organization.DonationManagement.DonationHistory;

/**
 *
 * @author sahar
 */
public class Resource {
    private double availableFunds;
    private List<DonationHistory> donationHistory;
    Organization organization;

    public Resource() {
        this.availableFunds = 0.0;
        this.donationHistory = new ArrayList<>();
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            this.availableFunds += amount;
            donationHistory.add(new DonationHistory(amount));
            System.out.println("Added donation to history: $" + amount);
            System.out.println("Current history size: $" + donationHistory.size());
            
        }
    }

    public boolean allocateFunds(double amount) {
        if (amount > 0 && availableFunds >= amount) {
            availableFunds -= amount;
            return true;
        }
        return false;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public List<DonationHistory> getDonationHistory() {
        return new ArrayList<>(donationHistory);
    }

    public double getTotalDonations() {
        return donationHistory.stream()
                .mapToDouble(DonationHistory::getAmount)
                .sum();
    }

    public int getTotalDonationCount() {
        return donationHistory.size();
    }

    
    
}