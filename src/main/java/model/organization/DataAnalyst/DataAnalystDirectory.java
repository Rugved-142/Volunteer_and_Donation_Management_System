/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DataAnalyst;

import DataConfiguration.Organization;
import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author rugvedgundawar
 */
public class DataAnalystDirectory {
    private ArrayList<DataAnalystProfile> dataAnalystList;
    private Organization organization;

    public DataAnalystDirectory(Organization organization) {
        this.organization = organization;
        dataAnalystList = new ArrayList<>();
    }
    // Create a new DataAnalystProfile and add it to the list
    public DataAnalystProfile newDataAnalystProfile(Person p, String name, String email, int phoneNumber, String password) {
        DataAnalystProfile dap = new DataAnalystProfile(p, name, email, phoneNumber, password);
        dataAnalystList.add(dap);
        return dap;
    }
    // Find a DataAnalystProfile by its unique ID
    public DataAnalystProfile findDataAnalyst(String id) {
        for (DataAnalystProfile dap : dataAnalystList) {
            if (dap.isMatch(id)) {
                return dap;
            }
        }
        return null; // Not found
    }

    // Get the list of all DataAnalyst profiles
    public ArrayList<DataAnalystProfile> getDataAnalystList() {
        return dataAnalystList;
    }
}
