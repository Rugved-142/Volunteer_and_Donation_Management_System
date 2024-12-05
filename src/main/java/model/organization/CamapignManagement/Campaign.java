/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.CamapignManagement;

/**
 *
 * @author Sarthak
 */
public class Campaign {
    private String name;
    private String description;
    private String date;

    public Campaign(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Campaign [name=" + name + ", description=" + description + ", date=" + date + "]";
    }
}

