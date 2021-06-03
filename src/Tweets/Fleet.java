/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweets;
import Aggregations.AssociatedList;
import Users.Account;
import java.util.Date;
/**
 *
 * @author admin
 */
public class Fleet extends Tweet{
    private AssociatedList<Account> postedBy;
    private AssociatedList<Account> seenby;
    private static int numberOfFleets = 0;
    private int FleetId;
    

    public Fleet(AssociatedList<Account> postedBy, AssociatedList<Account> seenby, String text, Date date_posted) throws EmptyTweetException {
        super(text, date_posted);
        this.postedBy = postedBy;
        this.seenby = seenby;
    }

    public Fleet(String text, int likes, AssociatedList<HashTag> HashTags,AssociatedList<Tweet> Retweets, AssociatedList<Image> Images) throws EmptyTweetException {
        super(text, likes, HashTags, Retweets, Images);
        FleetId = ++numberOfFleets;
        this.seenby = null;
    }
    

    public Fleet(String Text, Date date) throws EmptyTweetException{
        super(Text, date);
    }
    
    public String reply(){
       return "XXXXXXX has replied to your fleet!";
    }
    
    @Override
    public String like(){
        return "The Fleet Was Liked! " + super.like();
    }
    
    @Override
    public String Notify(){
        return super.Notify()+ " Oops! It's a fleet notification this time!";
    }

    public static int getNumberOfFleets() {
        return numberOfFleets;
    }

    public static void setNumberOfFleets() {
        Fleet.numberOfFleets += 1;
    }

    public AssociatedList<Account> getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(AssociatedList<Account> postedBy) {
        this.postedBy = postedBy;
    }

    public AssociatedList<Account> getSeenby() {
        return seenby;
    }

    public void setSeenby(AssociatedList<Account> seenby) {
        this.seenby = seenby;
    }

    public int getFleetId() {
        return FleetId;
    }
    
    
    @Override
    public String toString() {
        return "Fleet: " + super.toString()+ "seenby: " + "No one has seen your fleet yet! " ;
    }
       
}