/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

import DataConfiguration.Organization;
import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class MemberDirectory {
    Organization organization;
    ArrayList<MemberProfile> memberList;

    public MemberDirectory(Organization organization) {

        organization = organization;
        memberList = new ArrayList();

    }

    public MemberProfile newMemberProfile(Person p) {

        MemberProfile sp = new MemberProfile(p);
        memberList.add(sp);
        return sp;
    }

    public MemberProfile findEmployee(String id) {

        for (MemberProfile sp : memberList) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null;
         }
}
