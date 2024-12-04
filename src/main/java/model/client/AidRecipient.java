/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

import AidRequest.AidRequest;
import java.util.ArrayList;

/**
 *
 * @author sahar
 */
public class AidRecipient extends User {
    private ArrayList<AidRequest> requestHistory;
    private String status;

    public AidRecipient(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
        this.requestHistory = new ArrayList<>();
    }

}
