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
    private int phoneNumber;
    private List<Donation> donationHistory;
    
    public Donor(Person p, String loginName, String email, int phonenumber, String password){
        super(p);
        this.loginName = loginName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phonenumber;
        this.donationHistory = new ArrayList<>();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Donation makeDonation(double amount){
        Donation donation = new Donation(amount, this);
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
