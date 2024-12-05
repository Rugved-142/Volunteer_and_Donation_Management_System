/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataConfiguration;

import Directories.EnterpriseDirectory;

/**
 *
 * @author Sarthak
 */
public class Network {
    
    String name;
    EnterpriseDirectory enterpriseDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public Network(String name){
        this.name=name;
        this.enterpriseDirectory=enterpriseDirectory;
    }

public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }    
    

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    private Enterprise enterprise;
    
}
