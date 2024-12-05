/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.staff;

import java.util.ArrayList;
import model.client.Person;

/**
 *
 * @author sahar
 */
public class GovernmentRepresentative extends Person {
    private String department;
    private ArrayList<Compliance> complianceChecks;

    public GovernmentRepresentative(String name, String email, String password, String phoneNumber, String department) {
        super(name, email, password, phoneNumber);
        this.department = department;
        this.complianceChecks = new ArrayList<>();
    }

    public void ensureCompliance(Organization org) {
        // Implementation
    }

    public void coordinatePublicResources(Resources resources) {
        // Implementation
    }
}
