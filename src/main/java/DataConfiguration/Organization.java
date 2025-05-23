/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

import AidRequest.Resource;
import java.util.ArrayList;
import model.admin.AidCoordinatorDirectory;


import model.organization.VolunteerManagement.VolunteerCoordinatorDirectory;


import model.organization.AidReceipent.AidReceipentDirectory;
import model.organization.AidReceipent.AidRequestDirectory;
import model.organization.CamapignManagement.Campaign;
import model.organization.CamapignManagement.CampaignDirectory;
import model.organization.CamapignManagement.CampaignOrganizerDirectory;
import model.organization.DataAnalyst.DataAnalystDirectory;
import model.organization.DonationManagement.Donation;
import model.organization.DonationManagement.DonationDirectory;
import model.organization.DonationManagement.Donor;
import model.organization.DonationManagement.DonorDirectory;

import model.organization.VolunteerManagement.VolunteerDirectory;

/**
 *
 * @author Sarthak
 */
public class Organization {
    
    int id;
    String name;
    ArrayList<Campaign> campaigns;    
    VolunteerDirectory volunteerDirectory;
    VolunteerCoordinatorDirectory volunteerCoordinatorDirectory;   
    DonorDirectory donorDirectory;
    AidReceipentDirectory aidReceipentDirectory;
    AidRequestDirectory aidRequestDirectory;
    CampaignOrganizerDirectory campaignOrganizerDirectory;   
    DonationDirectory donationDirectory;
    Resource resource;
    AidCoordinatorDirectory coordinatorDirectory;

    CampaignDirectory campaignDirectory;

    DataAnalystDirectory dataAnalystDirectory;


    public Organization(int id, String name) {
        this.id = id;
        this.name = name;
        this.campaigns = campaigns;
        this.volunteerDirectory = new VolunteerDirectory(this);
        this.volunteerCoordinatorDirectory = new VolunteerCoordinatorDirectory(this);
        this.donorDirectory = new DonorDirectory(this);
        this.campaignOrganizerDirectory = new CampaignOrganizerDirectory(this);
        this.aidReceipentDirectory = new AidReceipentDirectory(this);
        this.aidRequestDirectory = new AidRequestDirectory(this);
        this.donationDirectory = new DonationDirectory(this);
        this.coordinatorDirectory = new AidCoordinatorDirectory(this);
        this.campaignDirectory = new CampaignDirectory(this);
        this.resource = new Resource();
        this.dataAnalystDirectory = new DataAnalystDirectory(this);
    }     
    

    public CampaignDirectory getCampaignDirectory() {
        return campaignDirectory;
    }

    public void setCampaignDirectory(CampaignDirectory campaignDirectory) {
        this.campaignDirectory = campaignDirectory;
    }

    public void setDataAnalystDirectory(){
        this.dataAnalystDirectory = new DataAnalystDirectory(this);
    }  

    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public CampaignOrganizerDirectory getCampaignOrganizerDirectory() {
        return campaignOrganizerDirectory;
    }

    public void setCampaignOrganizerDirectory(CampaignOrganizerDirectory campaignOrganizerDirectory) {
        this.campaignOrganizerDirectory = campaignOrganizerDirectory;
    }
    
    public VolunteerCoordinatorDirectory getVolunteerCoordinatorDirectory() {
        return volunteerCoordinatorDirectory;
    }

    public void setVolunteerCoordinatorDirectory(VolunteerCoordinatorDirectory volunteerCoordinatorDirectory) {
        this.volunteerCoordinatorDirectory = volunteerCoordinatorDirectory;
    }
    
    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    public DonorDirectory getDonerDirectory(){
        return donorDirectory;
    }

    public AidCoordinatorDirectory getCoordinatorDirectory() {
        return coordinatorDirectory;
    }

    public DataAnalystDirectory getDataAnalystDirectory() {
        return dataAnalystDirectory;
    }

    public void setDataAnalystDirectory(DataAnalystDirectory dataAnalystDirectory) {
        this.dataAnalystDirectory = dataAnalystDirectory;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(ArrayList<Campaign> campaigns) {
        this.campaigns = campaigns;
    }   

    public AidReceipentDirectory getAidReceipentDirectory() {
        return aidReceipentDirectory;
    }
    public AidRequestDirectory getAidRequestDirectory() {
        return aidRequestDirectory;
    }
    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public Resource getResource() {
        return resource;
    }
    
    public void processNewDonation(double amount, Donor donor){
        donationDirectory.processDonation(amount, donor);
        Donation donation = donor.makeDonation(amount);
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    
}
