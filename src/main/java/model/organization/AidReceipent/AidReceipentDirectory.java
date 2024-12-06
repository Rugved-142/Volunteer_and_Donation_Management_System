/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidReceipent;

import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;
import model.organization.VolunteerManagement.VolunteerProfile;

/**
 *
 * @author rugvedgundawar
 */
public class AidReceipentDirectory {
    
    ArrayList<AidReceipentProfile> aidReceipentsList;
    Organization organization;
    
    AidReceipentProfile aidReceipentProfile;
    
    public AidReceipentDirectory(Organization organization) {
    this.organization = organization;
    aidReceipentsList = new ArrayList();
    
}

    public AidReceipentProfile newAidReceipentProfile(Person p, String name,String email, int phoneNumber, int age, String password) {
        AidReceipentProfile arp = new AidReceipentProfile(p,name,email,phoneNumber, age, password);
        aidReceipentsList.add(arp);
        return arp;
    }

    public AidReceipentProfile findAidReceipent(String id) {

        for (AidReceipentProfile ap : aidReceipentsList) {

            if (ap.isMatch(id)) {
                return ap;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
