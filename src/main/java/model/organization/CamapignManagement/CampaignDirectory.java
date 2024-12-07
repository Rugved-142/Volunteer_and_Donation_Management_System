/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

/**
 *
 * @author Sarthak
 */
import java.util.ArrayList;
import java.util.List;

public class CampaignDirectory {
    private List<Campaign> campaigns;

    public CampaignDirectory() {
        this.campaigns = new ArrayList<>();
    }

    // Add a campaign
    public void addCampaign(Campaign campaign) {
        campaigns.add(campaign);
    }

    public void removeCampaign(Campaign campaign) {
        campaigns.remove(campaign);
    }

    // Modify a campaign
    public void modifyCampaign(String name, String newDescription, String newDate) {
        for (Campaign campaign : campaigns) {
            if (campaign.getName().equals(name)) {
                campaign.setDescription(newDescription);
                campaign.setDate(newDate);
                break;
            }
        }
    }

    // Get all campaigns
    public List<Campaign> getAllCampaigns() {
        return campaigns;
    }

    @Override
    public String toString() {
        return "CampaignDirectory [campaigns=" + campaigns + "]";
    }
}

