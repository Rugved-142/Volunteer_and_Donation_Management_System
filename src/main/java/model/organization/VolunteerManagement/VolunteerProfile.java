/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.VolunteerManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.client.Person;
import model.client.PersonProfile;

/**
 *
 * @author Sarthak
 */
public class VolunteerProfile extends PersonProfile {
    private String name;
    private String email;
    private String password;
    private ArrayList<String> skills;
    private ArrayList<String> availability;
//    private HashMap<VolunteerTask> tasks;
    private ArrayList<VolunteerTask> tasks;
    private VolunteerSchedule schedule;
    private List<String> completedTasks;
    private int totalHours;
    boolean registrationRequest=false;
    
    public VolunteerProfile(Person p, String name, String email, String password) {
        super(p);
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = new ArrayList<>();
        this.availability = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.schedule = new VolunteerSchedule();
        this.completedTasks = new ArrayList<>();
        this.totalHours = 0;
    }

    public ArrayList<VolunteerTask> getTasks() {
        return tasks;
    }

    public boolean getRegistrationRequest() {
        return registrationRequest;
    }

    public void setRegistrationRequest(boolean registrationRequest) {
        this.registrationRequest = registrationRequest;
    }    

       
    public void approveRegitrationRequest(){
        setRegistrationRequest(true);
    } 
    
    public void incrementHours(){
        this.totalHours  += 4; 
    }

    

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void addAvailability(String availability) {
        this.availability.add(availability);
    }

    public void assignTask(String task) {
        this.tasks.add(new VolunteerTask(task,VolunteerTaskStatus.PENDING));
    }

    
    public void assignTasks(List<String> taskNames) {
    for (String taskName : taskNames) {
        // Create a new VolunteerTask for each task name and set the status as PENDING
        this.tasks.add(new VolunteerTask(taskName, VolunteerTaskStatus.PENDING));
        }
    }
    
//    public void updateTaskStatus(VolunteerTask task) {
//        this.tasks.contains(task.);
//    }

    public void updatedProfile(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public void removeTask(VolunteerTask task){
        this.tasks.remove(task);
    }
    
    public VolunteerSchedule getSchedule(){
        return this.schedule;
    }
    
    public void updateSchedule(VolunteerSchedule schedule){
        this.schedule = schedule;
    }
    
    
    // Getters and setters omitted for brevity

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

//    public void setTasks(HashMap<String, String> tasks) {
//        this.tasks = tasks;
//    }

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
    
    @Override
    public String toString(){
        return this.name;
    }
    
    @Override
    public String getRole(){
        return  "Volunteer";
    }
}
