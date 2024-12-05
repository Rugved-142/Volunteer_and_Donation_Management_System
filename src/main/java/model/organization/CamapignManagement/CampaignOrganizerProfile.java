/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

import model.client.Person;
import model.client.PersonProfile;

/**
 *
 * @author Sarthak
 */
public class CampaignOrganizerProfile extends PersonProfile{
    
    String name;
    String email;

    public CampaignOrganizerProfile(Person p, String name, String email) {
        super(p);
        this.name = name;
        this.email = email;
    }

    @Override
    public String getRole() {
        return "Campaign Organizer";        
    }
    
}
