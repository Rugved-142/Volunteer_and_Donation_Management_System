/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.staff;

import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author sahar
 */
public class DataAnalyst extends Person {
    private ArrayList<Report> generatedReports;
    private AnalyticsTool analyticsTool;

    public DataAnalyst(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
        this.generatedReports = new ArrayList<>();
        this.analyticsTool = new AnalyticsTool();
    }

    public Report analyzeCampaignEffectiveness(Campaign campaign) {
        // Implementation
        return new Report();
    }

    public Report analyzeResourceAllocation() {
        // Implementation
        return new Report();
    }
}