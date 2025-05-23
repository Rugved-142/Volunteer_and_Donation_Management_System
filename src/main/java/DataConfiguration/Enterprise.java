/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

/**
 *
 * @author sarthak deshmukh
 */
import Directories.OrganizationDirectory;
import Directories.OrganizationDirectory;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.organization.DonationManagement.Donor;

public class Enterprise {
    
    String name;
    OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name){
        this.name = name;
        this.organizationDirectory = new OrganizationDirectory(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    

}
