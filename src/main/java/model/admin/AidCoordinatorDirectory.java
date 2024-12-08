/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;
import model.admin.AidCoordinator;


/**
 *
 * @author sahar
 */
public class AidCoordinatorDirectory {
    Organization organization;
    ArrayList<AidCoordinator> coordinatorList;

    public AidCoordinatorDirectory(Organization organization) {
        this.organization = organization;
        coordinatorList = new ArrayList();
    }
    
    public AidCoordinator newCoordinatorProfile(Person p, String name,String email, long phonenumber, String password) {

        AidCoordinator coord = new AidCoordinator(p,name,email,phonenumber,password);
        coordinatorList.add(coord);
        return coord;
    }

    public ArrayList<AidCoordinator> getCoordinatorList() {
        return coordinatorList;
    }
    
    
}
