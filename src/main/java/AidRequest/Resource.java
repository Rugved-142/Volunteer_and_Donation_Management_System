/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

import java.util.Date;

/**
 *
 * @author sahar
 */
public class Resource {
    private String id;
    private String name;
    private String category;
    private String unit;
    private Date expiryDate;

    public Resource(String id, String name, String category, String unit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.unit = unit;
    }

}
