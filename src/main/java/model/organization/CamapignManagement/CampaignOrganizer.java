/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

import DataConfiguration.Organization;

/**
 *
 * @author Sarthak
 */
public class CampaignOrganizer {
    Organization org;
    private CampaignDirectory directory;

    public CampaignOrganizer(Organization org) {
        this.org = org;
    }   
    

    // Add a campaign
    private void addCampaign(String name, String location,String description, String fromDate,String toDate) {
        Campaign campaign = new Campaign(name, location,description, fromDate, toDate);
        directory.addCampaign(campaign);
    }

    // Delete a campaign
    private void deleteCampaign(Campaign c) {
        directory.removeCampaign(c);
    }

    // Modify a campaign
    private void modifyCampaign(String name, String location,String newDescription, String fromDate,String toDate) {
        directory.modifyCampaign(name, location,newDescription, fromDate,toDate);
    }

    // Show all campaigns
    private void showAllCampaigns() {
        for (Campaign campaign : directory.getAllCampaigns()) {
            System.out.println(campaign);
        }
    }
    
}
