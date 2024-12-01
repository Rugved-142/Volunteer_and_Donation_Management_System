/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volunteermanagement;

/**
 *
 * @author sarthak deshmukh
 */
import AidRequest.AidRequest;
import Campaign.Campaign;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import models.Donor;
import models.Volunteer;

public class SampleData {
    public static List<Volunteer> generateVolunteers() {
        return Arrays.asList(
            new Volunteer("V001", "John Doe", "john@example.com", "password", 
                          Arrays.asList("Teaching", "Community Service"), "Weekends"),
            new Volunteer("V002", "Jane Smith", "jane@example.com", "password", 
                          Arrays.asList("Healthcare", "Fundraising"), "Weekdays"),
            new Volunteer("V003", "Mike Johnson", "mike@example.com", "password", 
                          Arrays.asList("Construction", "Logistics"), "Flexible")
        );
    }

    public static List<Donor> generateDonors() {
        return Arrays.asList(
            new Donor("D001", "Alice Brown", "alice@example.com", "password"),
            new Donor("D002", "Bob Wilson", "bob@example.com", "password")
        );
    }

    public static List<Campaign> generateCampaigns() {
        return Arrays.asList(
            new Campaign("C001", "Education Drive", 
                         "Providing educational resources to underprivileged children", 
                         "City Central", new Date()),
            new Campaign("C002", "Healthcare Outreach", 
                         "Free medical checkups and health awareness", 
                         "Community Center", new Date())
        );
    }

    public static List<AidRequest> generateAidRequests() {
        return Arrays.asList(
            new AidRequest("AR001", "R001", "Need educational support for children"),
            new AidRequest("AR002", "R002", "Require medical assistance")
        );
    }
}
