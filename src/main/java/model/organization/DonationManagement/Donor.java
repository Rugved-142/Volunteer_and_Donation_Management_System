/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DonationManagement;

import java.util.ArrayList;
import java.util.List;
import model.client.Person;
import model.client.PersonProfile;

/**
 *
 * @author sahar
 */
public class Donor extends PersonProfile {
    private String loginName;
    private String email;
    private String password;
    private List<Donation> donationHistory;
    
    public Donor(Person p, String loginName, String email, String password){
        super(p);
        this.loginName = loginName;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getRole() {
        return  "Donor";
    }

   
    
    
}
