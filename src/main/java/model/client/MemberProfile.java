/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

/**
 *
 * @author Sarthak
 */
public class MemberProfile extends PersonProfile {

    public MemberProfile(Person p) {

        super(p);

    }

    @Override
    public String getRole() {
        return "Admin";
    }
}
