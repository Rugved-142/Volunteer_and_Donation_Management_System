/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.staff;

import Campaign.Campaign;
import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author sahar
 */
public class CampaignOrganizer extends Person {
    private ArrayList<Campaign> activeCampaigns;
    private ArrayList<Event> plannedEvents;

    public CampaignOrganizer(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
        this.activeCampaigns = new ArrayList<>();
        this.plannedEvents = new ArrayList<>();
    }

    public void createCampaign(Campaign campaign) {
        // Implementation
    }

    public void organizeEvent(Event event) {
        // Implementation
    }
}
