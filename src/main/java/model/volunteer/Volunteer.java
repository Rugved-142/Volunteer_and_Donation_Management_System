/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteer;

import model.organization.VolunteerManagement.VolunteerSchedule;
import model.organization.VolunteerManagement.VolunteerTaskStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.client.PersonProfile;

/**
 *
 * @author sarthak deshmukh
 */
class Volunteer extends PersonProfile{
    private String name;
    private String email;
    private String password;
    private ArrayList<String> skills;
    private ArrayList<String> availability;
    private HashMap<String, VolunteerTaskStatus> tasks;
    private VolunteerSchedule schedule;
    private List<String> completedTasks;
    private int totalHours;

    public Volunteer(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = new ArrayList<>();
        this.availability = new ArrayList<>();
        this.tasks = new HashMap<>();
        this.schedule = new VolunteerSchedule();
        this.completedTasks = new ArrayList<>();
        this.totalHours = 0;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void addAvailability(String availability) {
        this.availability.add(availability);
    }

    public void assignTask(String taskId, VolunteerTaskStatus status) {
        this.tasks.put(taskId, status);
    }

    public void updateTaskStatus(String taskId, VolunteerTaskStatus status) {
        this.tasks.put(taskId, status);
    }

    public void updatedProfile(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public void removeTask(String taskId){
        this.tasks.remove(taskId);
    }
    
    public VolunteerSchedule getSchedule(){
        return this.schedule;
    }
    
    public void updateSchedule(VolunteerSchedule schedule){
        this.schedule = schedule;
    }
    
    
    // Getters and setters omitted for brevity

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public ArrayList<String> getAvailability() {
        return availability;
    }

    public void setAvailability(ArrayList<String> availability) {
        this.availability = availability;
    }

    public HashMap<String, VolunteerTaskStatus> getTasks() {
        return tasks;
    }

    public void setTasks(HashMap<String, VolunteerTaskStatus> tasks) {
        this.tasks = tasks;
    }

    public List<String> getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(List<String> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }
    
    
}