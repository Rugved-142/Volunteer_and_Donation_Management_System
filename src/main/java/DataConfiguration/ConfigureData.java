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
public class ConfigureData {
    public Network initialize(){
        Network network = new Network("Management Group");
        EnterpriseDirectory enterpriseDirectory = network.getEnterpriseDirectory();
        return network;
    }
}
