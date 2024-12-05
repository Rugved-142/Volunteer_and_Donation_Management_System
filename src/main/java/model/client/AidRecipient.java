/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

import java.util.ArrayList;
import model.organization.AidReceipent.AidRequest;

/**
 *
 * @author sahar
 */
public class AidRecipient extends PersonProfile {
    private ArrayList<AidRequest> requestHistory;
    private String status;

    public AidRecipient(Person p,String name, String email, String password, String phoneNumber) {
        super(p);
        this.requestHistory = new ArrayList<>();
    }

    @Override
    public String getRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
