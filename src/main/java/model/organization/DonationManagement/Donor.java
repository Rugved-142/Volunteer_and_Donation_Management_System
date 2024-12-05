/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DonationManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sahar
 */
public class Donor {
    private String loginName;
    private String loginId;
    private List<Donation> donationHistory;
    
    public Donor(String loginName, String loginId){
        this.loginName = loginName;
        this.loginId = loginId;
        this.donationHistory = new ArrayList<>();
    }
    
    public Donation makeDonation(double amount){
        Donation donation = new Donation(amount, this.loginName);
        donationHistory.add(donation);
        return donation;
    }
    
    public List<Donation> getDonationHistory(){
        return new ArrayList<>(donationHistory);
    }

    public String getLoginName() {
        return loginName;
    }

    public String getLoginId() {
        return loginId;
    }
    
    
}
