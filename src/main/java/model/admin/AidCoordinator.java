/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;


import AidRequest.DistributionStatus;
import AidRequest.ResourceInventory;
import java.util.ArrayList;
import model.client.Person;
import model.client.PersonProfile;
import model.organization.AidDistribution.AidDistribution;

/**
 *
 * @author sahar
 */
public class AidCoordinator extends PersonProfile {
    private ArrayList<AidDistribution> activeDistributions;
    private ResourceInventory inventory;
    private String name;
    private String email;
    private String password;
    private long phoneNumber;

    public AidCoordinator(Person p,String name, String email, long phoneNumber, String password) {
        super(p);
        this.activeDistributions = new ArrayList<>();
        this.inventory = new ResourceInventory();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public boolean distributeResources(AidDistribution distribution) {
        if (validateDistribution(distribution)) {
            activeDistributions.add(distribution);
            updateInventory(distribution);
            return true;
        }
        return false;
    }

    private boolean validateDistribution(AidDistribution distribution) {
        // Check if we have enough resources
        return inventory.hasAvailableResources(distribution.getRequiredResources());
    }
    
    private void updateInventory(AidDistribution distribution) {
        inventory.deductResources(distribution.getRequiredResources());
    }
    
    public DistributionStatus trackDistribution(String distributionId) {
        for (AidDistribution distribution : activeDistributions) {
            if (distribution.getId().equals(distributionId)) {
                return distribution.getStatus();
            }
        }
        return DistributionStatus.NOT_FOUND;
    }

    public ArrayList<AidDistribution> getActiveDistributions() {
        return activeDistributions;
    }

    public void setActiveDistributions(ArrayList<AidDistribution> activeDistributions) {
        this.activeDistributions = activeDistributions;
    }

    public ResourceInventory getInventory() {
        return inventory;
    }

    public void setInventory(ResourceInventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getRole() {
        return "Aid Coordinator";
    }
    
}
