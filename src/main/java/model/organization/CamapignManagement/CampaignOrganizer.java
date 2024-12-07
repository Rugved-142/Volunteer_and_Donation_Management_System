/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

/**
 *
 * @author Sarthak
 */
public class CampaignOrganizer {
    private CampaignDirectory directory;

    public CampaignOrganizer() {
        directory = new CampaignDirectory();   
    }   
    

    // Add a campaign
    private void addCampaign(String name, String description, String date) {
        Campaign campaign = new Campaign(name, description, date);
        directory.addCampaign(campaign);
    }

    // Delete a campaign
    private void deleteCampaign(Campaign c) {
        directory.removeCampaign(c);
    }

    // Modify a campaign
    private void modifyCampaign(String name, String newDescription, String newDate) {
        directory.modifyCampaign(name, newDescription, newDate);
    }

    // Show all campaigns
    private void showAllCampaigns() {
        for (Campaign campaign : directory.getAllCampaigns()) {
            System.out.println(campaign);
        }
    }
    
}
