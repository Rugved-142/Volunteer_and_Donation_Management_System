/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

import Campaign.Campaign;
import java.util.ArrayList;
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

    public Organization(int id, String name) {
        this.id = id;
        this.name = name;
        this.campaigns = campaigns;
        this.volunteerDirectory = new VolunteerDirectory(this);
    }  
    
    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
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
    
    
}
