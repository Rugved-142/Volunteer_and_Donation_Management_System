/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

/**
 *
 * @author Sarthak
 */
import DataConfiguration.Organization;
import java.util.ArrayList;
import java.util.List;

public class CampaignDirectory {
    Organization org;
    private ArrayList<Campaign> campaigns;

    public CampaignDirectory(Organization org) {
        this.org = org;
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
    public void modifyCampaign(String name, String newDescription, String location, String newFromDate,String newToDate) {
        for (Campaign campaign : campaigns) {
            if (campaign.getName().equals(name)) {
                campaign.setDescription(newDescription);
                campaign.setLocation(location);
                campaign.setFromDate(newFromDate);
                campaign.setToDate(newToDate);
                break;
            }
        }
    }

    // Get all campaigns
    public ArrayList<Campaign> getAllCampaigns() {
        return campaigns;
    }

    @Override
    public String toString() {
        return "CampaignDirectory [campaigns=" + campaigns + "]";
    }
}

