/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import Aggregations.AssociatedList;
import Tweets.Tweet;
import java.util.List;


public class Profile {
    AssociatedList<Tweet> relatedTo;
    private String Email;
    private String Description;
    private String Profile_Picture;
    private Tweet pin;
    private String phone;
    private List<String> Topics;
    
    public void change_picture(){}

    public Profile(String Email, String Description, String Profile_Picture, Tweet pin, String phone, List<String> Topics, AssociatedList<Tweet> relatedTo) {
        this(Email, Description, Profile_Picture, phone, Topics);
        this.pin = pin;
        this.relatedTo = relatedTo;
    }
    
    public Profile(String Email, String Description, String Profile_Picture, String phone, List<String> Topics) {
        this.Email = Email;
        this.Description = Description;
        this.Profile_Picture = Profile_Picture;
        this.phone = phone;
        this.Topics = Topics;
    }
    
    public String getEmail() {
        return Email;
    }

    public String getDescription() {
        return Description;
    }

    public String getProfile_Picture() {
        return Profile_Picture;
    }

    public Tweet getPin() {
        return pin;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getTopics() {
        return Topics;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setProfile_Picture(String Profile_Picture) {
        this.Profile_Picture = Profile_Picture;
    }

    public void setPin(Tweet pin) {
        this.pin = pin;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTopics(List<String> Topics) {
        this.Topics = Topics;
    }

    public AssociatedList<Tweet> getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(AssociatedList<Tweet> relatedTo) {
        this.relatedTo = relatedTo;
    }
    

    @Override
    public String toString() {
        return "Profile: " + "Email=" + Email + ", Description:" + Description + ", Profile_Picture:" + Profile_Picture + ", phone=" + phone + ", Topics:" + Topics + '.';
    }
    
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Profile) && (((Profile)obj).getEmail()).equals(Email));
    }
        
    
    
}
