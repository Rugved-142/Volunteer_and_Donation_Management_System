/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.VolunteerManagement;
import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author Sarthak
 */
public class VolunteerDirectory {
    Organization organization;
    ArrayList<VolunteerProfile> volunteerList;

    public VolunteerDirectory(Organization organization) {

        this.organization = organization;
        volunteerList = new ArrayList();

    }

    public VolunteerProfile newVolunteerProfile(Person p, String name,String email, String password) {

        VolunteerProfile vp = new VolunteerProfile(p,name,email,password);
        volunteerList.add(vp);
        return vp;
    }

    public VolunteerProfile findVolunteer(String id) {

        for (VolunteerProfile sp : volunteerList) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
}
