/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.VolunteerManagement;

/**
 *
 * @author sahar
 */
public class VolunteerTask {
    
    private String task;
    private VolunteerTaskStatus status;
    
    public VolunteerTask(String task, VolunteerTaskStatus status){
        this.task = task;
        this.status = status;
    }
    
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public VolunteerTaskStatus getStatus() {
        return status;
    }

    public void setStatus(VolunteerTaskStatus status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.task;
    }
    
}
