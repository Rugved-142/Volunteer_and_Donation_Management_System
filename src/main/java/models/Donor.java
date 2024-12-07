/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import Campaign.Donation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarthak deshmukh
 */
public class Donor extends User {
    private List<Donation> donationHistory;

    public Donor(String id, String name, String email, String password) {
        super(id, name, email, password);
        this.donationHistory = new ArrayList<>();
    }

    public void makeDonation(Donation donation) {
        donationHistory.add(donation);
        System.out.println("Donation of $" + donation.getAmount() + " made.");
    }

    public List<Donation> getDonationHistory() {
        return donationHistory;
    }
}
