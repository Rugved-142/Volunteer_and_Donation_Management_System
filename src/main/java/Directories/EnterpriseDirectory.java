/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import DataConfiguration.Enterprise;
import DataConfiguration.Network;
import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class EnterpriseDirectory {
    
    Network network;
    ArrayList<Enterprise> enterprises;

    public EnterpriseDirectory(Network n) {
        this.network=n;
        enterprises = new ArrayList();
    }

    public Enterprise newEnterprise(String n) {
        Enterprise enterprise = new Enterprise(n);
        enterprises.add(enterprise);
        return enterprise;

    }

    public Enterprise findEnterprise(String id) {

        for (Enterprise enterprise : enterprises) {

            if (enterprise.getName().equals(id)) {
                return enterprise;
            }
        }
        return null;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterprises;
    }
}
