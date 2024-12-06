/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

import Directories.EnterpriseDirectory;
import Directories.OrganizationDirectory;
import model.UserAccountManagement.UserAccountDirectory;
import model.client.Person;
import model.organization.CamapignManagement.CampaignOrganizerDirectory;
import model.organization.CamapignManagement.CampaignOrganizerProfile;

import model.organization.VolunteerManagement.VolunteerCoordinator;
import model.organization.VolunteerManagement.VolunteerCoordinatorDirectory;

import model.organization.DonationManagement.Donor;
import model.organization.DonationManagement.DonorDirectory;

import model.organization.VolunteerManagement.VolunteerDirectory;
import model.organization.VolunteerManagement.VolunteerProfile;

/**
 *
 * @author Sarthak
 */
public class ConfigureNetwork {

    public static Network initialize() {
        //Crreating network
        Network network = new Network("Management Group");

        //Initializing enterpriseDirectory
        EnterpriseDirectory enterpriseDirectory = network.getEnterpriseDirectory();

        //Enterprise 1 : Non-Profit Enterprise
        Enterprise enterprise1 = enterpriseDirectory.newEnterprise("Non-Profit Enterprise");

        //Initializing organizations in Enterprise 1
        OrganizationDirectory od1 = enterprise1.getOrganizationDirectory();
        Organization organization1 = od1.newOrganization(1, "Volunteer Management");
        Organization organization2 = od1.newOrganization(2, "Aid Distribution");

        //Enterprise 2 : Corporate Donors Enterprise
        Enterprise enterprise2 = enterpriseDirectory.newEnterprise("Corporate Donors Enterprise");

        //Initializing organizations in Enterprise 2
        OrganizationDirectory od2 = enterprise2.getOrganizationDirectory();
        Organization organization3 = od2.newOrganization(3, "Campaign Management");
        Organization organization4 = od2.newOrganization(4, "Analytics & Reporting");

        //Enterprise 3 : Public Service Enterprise
        Enterprise enterprise3 = enterpriseDirectory.newEnterprise("Public Service Enterprise");

        //Initializing organizations in Enterprise 3
        OrganizationDirectory od3 = enterprise3.getOrganizationDirectory();

        Organization organization5 = od3.newOrganization(5, "Recipient Registration");       


        //Enterprise 4 : Community Support Enterprise
        Enterprise enterprise4 = enterpriseDirectory.newEnterprise("Community Support Enterprise");

        //Initializing organizations in Enterprise 4
        OrganizationDirectory od4 = enterprise4.getOrganizationDirectory();
        Organization organization6 = od4.newOrganization(6, "Donation Management");

        //Initializing Volunteer profile accounts
        UserAccountDirectory userAccountDirectory = network.getUserAccountDirectory();
        VolunteerDirectory volunteerDirectory = organization1.getVolunteerDirectory();
        Person pp1 = new Person("12345");
        VolunteerProfile vp1 = volunteerDirectory.newVolunteerProfile(pp1, "Sarthak", "sarthak@example.com", "password");
        Person pp2 = new Person("12346");
        VolunteerProfile vp2 = volunteerDirectory.newVolunteerProfile(pp2, "Nachiket", "nachiket@example.com", "password");
        Person pp3 = new Person("12347");
        VolunteerProfile vp3 = volunteerDirectory.newVolunteerProfile(pp3, "Rugved", "rugved@example.com", "password");

        userAccountDirectory.newUserAccount(vp1, vp1.getPerson().getPersonId(), "password");
        userAccountDirectory.newUserAccount(vp2, vp1.getPerson().getPersonId(), "password");
        userAccountDirectory.newUserAccount(vp3, vp1.getPerson().getPersonId(), "password");


        //Creating volunteer coordinator profile
        VolunteerCoordinatorDirectory volunteerCoordinatorDirectory = organization1.getVolunteerCoordinatorDirectory();
        Person pp4 = new Person("12349");
        VolunteerCoordinator vc = volunteerCoordinatorDirectory.newVolunteerCoordinatorProfile(pp4, "SarthakCoordinator", "coordinator@example.com", "password");
        userAccountDirectory.newUserAccount(vc, vc.getPerson().getPersonId(), "password");
        System.out.println("VolunteerCoordinator: " + vc.getPerson().getPersonId());
        
        //Creating Camapaign Organizor profile
        CampaignOrganizerDirectory campaignOrganizerDirectory = organization3.getCampaignOrganizerDirectory();
        Person pp6 = new Person("12350");
        CampaignOrganizerProfile cop = campaignOrganizerDirectory.newCampaignOrganizerProfile(pp6, "SarthakOrganizer", "organizer@example.com", "password");
        userAccountDirectory.newUserAccount(cop, cop.getPerson().getPersonId(), "password");
        System.out.println("Campaign Organizer: " + cop.getPerson().getPersonId());

        // Initializing Donor Profile Accounts
        DonorDirectory donorDirectory = organization6.getDonerDirectory();
        Person pp5 = new Person("12348");
        Donor donor1 = donorDirectory.newDonorProfile(pp5, "John", "John.donor@gmail.com", 987654321, "password");
        userAccountDirectory.newUserAccount(donor1,donor1.getPerson().getPersonId() , "password");
        

        return network;
    }
}
