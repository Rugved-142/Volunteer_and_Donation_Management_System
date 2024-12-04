/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import AidRequest.AidRequest;
import Campaign.Campaign;
import java.util.ArrayList;
import model.client.User;

/**
 *
 * @author sahar
 */
public class NonProfitAdmin extends User {
    private ArrayList<Campaign> managedCampaigns;
    private ArrayList<AidRequest> pendingRequests;

    public NonProfitAdmin(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
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
    
}