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
public class VolunteerCoordinatorDirectory {

    Organization organization;
    ArrayList<VolunteerCoordinator> volunteerCoordinatorList;

    public VolunteerCoordinatorDirectory(Organization organization) {

        this.organization = organization;
        volunteerCoordinatorList = new ArrayList();

    }

    public VolunteerCoordinator newVolunteerCoordinatorProfile(Person p, String name, String email, String password) {

        VolunteerCoordinator vc = new VolunteerCoordinator(p, name, email, password);
        volunteerCoordinatorList.add(vc);
        return vc;
    }

    public VolunteerCoordinator findVolunteerCoodinator(String id) {

        for (VolunteerCoordinator vc : volunteerCoordinatorList) {

            if (vc.isMatch(id)) {
                return vc;
            }
        }
        return null; //not found after going through the whole list
    }
}
