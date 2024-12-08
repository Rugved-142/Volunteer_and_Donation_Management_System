/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.DataAnalyst;

import model.client.Person;
import model.client.PersonProfile;

/**
 *
 * @author rugvedgundawar
 */
public class DataAnalystProfile extends PersonProfile {
    
    private Person person;
    private String name;
    private String email;
    private int phoneNumber;
    private String password;
    
    public DataAnalystProfile(Person person, String name, String email, int phoneNumber, String password) {
        super(person);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    // Check if the ID matches the Person's ID
    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getRole() {
        return "DataAnalyst";
    }
}
