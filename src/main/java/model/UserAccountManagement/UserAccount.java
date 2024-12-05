/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccountManagement;

import model.client.PersonProfile;

/**
 *
 * @author Sarthak
 */
public class UserAccount {
    
    PersonProfile profile;
    String username;
    String password;
    
    public UserAccount (PersonProfile profile, String un, String pw){
         username = un;
         password = pw;
         this.profile = profile;

    }

    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public PersonProfile getAssociatedPersonProfile(){
            return profile;
        }    
        
}
