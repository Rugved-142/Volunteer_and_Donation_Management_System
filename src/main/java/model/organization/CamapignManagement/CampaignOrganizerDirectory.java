/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author Sarthak
 */
public class CampaignOrganizerDirectory {

    Organization organization;
    ArrayList<CampaignOrganizerProfile> campaignOrganizers;

    public CampaignOrganizerDirectory(Organization organization) {

        this.organization = organization;
        campaignOrganizers = new ArrayList();

    }

    public CampaignOrganizerProfile newCampaignOrganizerProfile(Person p, String name, String email, String password) {

        CampaignOrganizerProfile cop = new CampaignOrganizerProfile(p, name, email, password);
        campaignOrganizers.add(cop);
        return cop;
    }

    public CampaignOrganizerProfile findVolunteerCoodinator(String id) {

        for (CampaignOrganizerProfile cop : campaignOrganizers) {

            if (cop.isMatch(id)) {
                return cop;
            }
        }
        return null; //not found after going through the whole list
    }
}
