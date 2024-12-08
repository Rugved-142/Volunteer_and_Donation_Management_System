/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMSFeature;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author Sarthak
 */
public class SmsSender {
    private String ACCOUNT_SID;
    private String AUTH_TOKEN; 
    
    public SmsSender(){
        Dotenv dotenv = Dotenv.load();
        this.ACCOUNT_SID = dotenv.get("TWILIO_ACCOUNT_SID");
        this.AUTH_TOKEN = dotenv.get("TWILIO_ACCOUNT_TOKEN");
    }
    
    public void sendSMS(String phone, String messageText){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
        Message message = Message.creator(
            new PhoneNumber(phone),     // The recipient phone number
            new PhoneNumber("+18883017757"), //Twilio number
            messageText                    
        ).create();
        
        System.out.println(message.getSid());
        System.out.println("Message sent to the recipient");
    }
}
