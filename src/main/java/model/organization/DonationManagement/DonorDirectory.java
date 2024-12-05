/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DonationManagement;

import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author sahar
 */
public class DonorDirectory {
    Organization organization;
    ArrayList<Donor> donorList;

    public DonorDirectory(Organization organization) {
        this.organization = organization;
        donorList = new ArrayList();
    }
    
    public Donor newDonorProfile(Person p, String name,String email, String password) {

        Donor donor = new Donor(p,name,email,password);
        donorList.add(donor);
        return donor;
    }
    
}
