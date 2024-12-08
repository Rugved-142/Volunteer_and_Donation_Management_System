/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DonationManagement;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author sarthak deshmukh
 */
public class Donation {
   private String donationId;
   private double amount;
   private Donor donor;
   private LocalDateTime timestamp;
   
   public Donation(double amount, Donor donor){
       this.donationId = UUID.randomUUID().toString();
       this.amount = amount;
       this.donor = donor;
       this.timestamp = LocalDateTime.now();
   }

    public String getDonationId() {
        return donationId;
    }

    public double getAmount() {
        return amount;
    }

    public Donor getDonor() {
        return donor;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }
   
   
}   
