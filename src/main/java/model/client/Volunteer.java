/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarthak deshmukh
 */
public class Volunteer extends User {
    private List<String> skills;
    private String availability;
    private List<String> assignedTasks;

    public Volunteer(String id, String name, String email, String password, 
                     List<String> skills, String availability) {
        super(id, name, email, password);
        this.skills = skills;
        this.availability = availability;
        this.assignedTasks = new ArrayList<>();
    }

    public List<String> getSkills() { return skills; }
    public String getAvailability() { return availability; }

    public void viewTasks() {
        System.out.println("Assigned Tasks: " + assignedTasks);
    }

    public void updateTaskStatus(String task, String status) {
        // Placeholder for task status update
        System.out.println("Updated task: " + task + " to status: " + status);
    }
}