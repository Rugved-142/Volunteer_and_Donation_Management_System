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

    public AidCoordinator(Person p,String name, String email, String password, String phoneNumber) {
        super(p);
        this.activeDistributions = new ArrayList<>();
        this.inventory = new ResourceInventory();
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

    @Override
    public String getRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
