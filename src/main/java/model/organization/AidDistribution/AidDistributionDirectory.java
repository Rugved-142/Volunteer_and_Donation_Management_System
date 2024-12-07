/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidDistribution;

import AidRequest.DistributionStatus;
import AidRequest.Resource;
import DataConfiguration.Organization;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author sahar
 */
public class AidDistributionDirectory {
    private ArrayList<AidDistribution> distributionList;
    private Organization organization;
    
    public AidDistributionDirectory(Organization organization) {
        this.organization = organization;
        this.distributionList = new ArrayList<>();
    }
    
    public AidDistribution createDistribution(Resource resource) {
        AidDistribution distribution = new AidDistribution(resource);
        distribution.setId(UUID.randomUUID().toString());
        distribution.setStatus(DistributionStatus.PENDING);
        distributionList.add(distribution);
        return distribution;
    }
    
    public List<AidDistribution> getAllDistributions() {
        return distributionList;
    }
    
    public List<AidDistribution> getDistributionsByStatus(DistributionStatus status) {
        return distributionList.stream()
            .filter(d -> d.getStatus() == status)
            .collect(Collectors.toList());
    }
}
