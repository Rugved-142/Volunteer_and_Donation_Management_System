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
    
    public ArrayList<VolunteerProfile> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<VolunteerProfile> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public VolunteerProfile newVolunteerProfile(Person p, String name,String email, String gender,int age, String DOB,String password) {

        VolunteerProfile vp = new VolunteerProfile(p,name,email,gender,age,DOB,password);
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
