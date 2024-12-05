/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import DataConfiguration.Enterprise;
import DataConfiguration.Organization;
import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class OrganizationDirectory {
    
    ArrayList<Organization> organizations;
    Enterprise enterprise;
    
    public OrganizationDirectory(Enterprise enterprise) {
        this.enterprise = enterprise;
        organizations = new ArrayList();
    }

    
    public Organization newOrganization(int id, String n) {
        Organization org = new Organization(id, n);
        organizations.add(org);
        return org;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizations;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizations = organizationList;
    }
    
    public Organization findEnterprise(String id) {

        for (Organization organization : organizations) {

            if (organization.getName().equals(id)) {
                return organization;
            }
        }
        return null;
    }
}
