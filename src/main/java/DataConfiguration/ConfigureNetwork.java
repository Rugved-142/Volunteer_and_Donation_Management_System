/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

import Directories.EnterpriseDirectory;
import Directories.OrganizationDirectory;
import com.github.javafaker.Faker;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import model.UserAccountManagement.UserAccountDirectory;
import model.client.Person;
import model.admin.AidCoordinator;
import model.admin.AidCoordinatorDirectory;
import model.organization.AidReceipent.AidReceipentDirectory;
import model.organization.AidReceipent.AidReceipentProfile;
import model.organization.CamapignManagement.Campaign;
import model.organization.CamapignManagement.CampaignDirectory;
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
        
        //Creating network
        Faker faker = new Faker();
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

        Organization organization5 = od3.newOrganization(5, "Receipient Registration");       


        //Enterprise 4 : Community Support Enterprise
        Enterprise enterprise4 = enterpriseDirectory.newEnterprise("Community Support Enterprise");

        //Initializing organizations in Enterprise 4
        OrganizationDirectory od4 = enterprise4.getOrganizationDirectory();
        Organization organization6 = od4.newOrganization(6, "Donation Management");

        //Initializing Volunteer profile accounts
        UserAccountDirectory userAccountDirectory = network.getUserAccountDirectory();
        VolunteerDirectory volunteerDirectory = organization1.getVolunteerDirectory();
        Random random = new Random();
        for(int i=0;i<24;i++){
        Person pp = new Person(String.valueOf(random.nextInt(90000) + 10000));
        VolunteerProfile vp = volunteerDirectory.newVolunteerProfile(pp, faker.name().firstName(), faker.animal().name()+"@gmail.com","MALE",random.nextInt(30) + 20,faker.date().toString(), "password");
        userAccountDirectory.newUserAccount(vp, vp.getPerson().getPersonId(), "password");
        }
        
        for(int i=0;i<24;i++){
        Person pp = new Person(String.valueOf(random.nextInt(90000) + 10000));
        VolunteerProfile vp = volunteerDirectory.newVolunteerProfile(pp, faker.name().firstName(), faker.animal().name()+"@gmail.com","FEMALE",random.nextInt(30) + 20,faker.date().toString(), "password");
        userAccountDirectory.newUserAccount(vp, vp.getPerson().getPersonId(), "password");
        }

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
        
        //Creating Campaigns
        CampaignDirectory campaignDirectory = organization3.getCampaignDirectory();
        for(int i=0;i<24;i++){
            campaignDirectory.addCampaign(new Campaign(faker.ancient().god(),faker.address().city(),"Description of the Campaign",faker.date().future(365, java.util.concurrent.TimeUnit.DAYS).toString(),faker.date().future(365, java.util.concurrent.TimeUnit.DAYS).toString()));
        }

        
        DonorDirectory donorDirectory = organization6.getDonerDirectory();
        Person pp5 = new Person("12348");
        Donor donor1 = donorDirectory.newDonorProfile(pp5, "John", "John.donor@gmail.com", 987654321, "password");
        userAccountDirectory.newUserAccount(donor1,donor1.getPerson().getPersonId() , "password");
        
        // Initializing Donor Profile Accounts
//        DonorDirectory donorDirectory = organization6.getDonerDirectory();
//        for(int i=0;i<49;i++){
//        Person pp5 = new Person(String.valueOf(random.nextInt(90000) + 10000));
//        Donor donor = donorDirectory.newDonorProfile(pp5, faker.name().firstName(), faker.animal().name()+".donor@gmail.com", (int)faker.number().randomNumber(10, true), "password");
//        userAccountDirectory.newUserAccount(donor, donor.getPerson().getPersonId(), "password");
//        }
        
        // Initializing AidCoordinator Profile Accounts
        AidCoordinatorDirectory coordDirectory = organization2.getCoordinatorDirectory();
        Person pp9 = new Person("12360");
        AidCoordinator coord1 = coordDirectory.newCoordinatorProfile(pp9, "Coord", "John.coord@gmail.com", 987654321, "password");
        userAccountDirectory.newUserAccount(coord1,coord1.getPerson().getPersonId() , "password");
        System.out.println("Aid Coordinator: " + coord1.getPerson().getPersonId());

        // Initializing Aid Recipient Profile Accounts
        AidReceipentDirectory aidReceipentDirectory = organization5.getAidReceipentDirectory(); // Organization for "Receipient Registration"

        for (int i = 0; i < 30; i++) { // Create 30 sample AidRecipient profiles
            // Generate random details
            Person person = new Person(String.valueOf(random.nextInt(90000) + 10000)); // Unique Person ID
            String name = faker.name().firstName() + " " + faker.name().lastName();    // Random full name
            String email = name.replace(" ", ".").toLowerCase() + "@aidrecipient.com"; // Email
            int phoneNumber = (int) (1000000000L + random.nextInt(900000000));         // Random 10-digit phone number
            int age = random.nextInt(40) + 18;                                        // Age between 18 and 58
            String password = "password";    

            // Create the AidRecipientProfile
            AidReceipentProfile aidReceipentProfile = aidReceipentDirectory.newAidReceipentProfile(
                person,
                name,
                email,
                age,
                phoneNumber,
                "password"
            );

            // Add the profile to UserAccountDirectory
            userAccountDirectory.newUserAccount(aidReceipentProfile, aidReceipentProfile.getPerson().getPersonId(), "password");
            System.out.println("Aid Recipient Profile Created: " + aidReceipentProfile.getPerson().getPersonId());
        }

        return network;
    }
}
