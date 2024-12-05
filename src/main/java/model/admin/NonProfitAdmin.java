/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import AidRequest.AidRequest;
import Campaign.Campaign;
import java.util.ArrayList;
import model.client.Person;
import model.client.PersonProfile;

/**
 *
 * @author sahar
 */
public class NonProfitAdmin extends PersonProfile {
    private ArrayList<Campaign> managedCampaigns;
    private ArrayList<AidRequest> pendingRequests;

    public NonProfitAdmin(Person p,String name, String email, String password, String phoneNumber) {
        super(p);
        this.managedCampaigns = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
    }

    public ArrayList<Campaign> getManagedCampaigns() {
        return managedCampaigns;
    }

    public void setManagedCampaigns(ArrayList<Campaign> managedCampaigns) {
        this.managedCampaigns = managedCampaigns;
    }

    public ArrayList<AidRequest> getPendingRequests() {
        return pendingRequests;
    }

    public void setPendingRequests(ArrayList<AidRequest> pendingRequests) {
        this.pendingRequests = pendingRequests;
    }

    @Override
    public String getRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}