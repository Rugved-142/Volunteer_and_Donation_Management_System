/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidReceipent;

import DataConfiguration.Organization;
import java.util.ArrayList;

/**
 *
 * @author rugvedgundawar
 */
public class AidRequestDirectory {
    
    Organization organization;
    ArrayList<AidRequest> aidRequestList;
    AidReceipentProfile aidReceipentProfile;
    
    public AidRequestDirectory(Organization organization){
        this.organization=organization;
        aidRequestList = new ArrayList();
    }
    
    public AidRequest addAidRequest(String requestorName, double amountNeeded, String reason,AidReceipentProfile aidReceipentProfile){
        AidRequest ar = new AidRequest(requestorName,amountNeeded,reason, aidReceipentProfile);
        aidRequestList.add(ar);
        return ar;
    }
}
