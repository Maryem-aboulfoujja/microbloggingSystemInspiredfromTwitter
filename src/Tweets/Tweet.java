/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tweets;

import Aggregations.AssociatedList;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author MaryemAboulfoujja
 */
 
public class Tweet implements Serializable{
    
    private String text;
    private GregorianCalendar posted;
    private int likes;
    private AssociatedList<HashTag> HashTags;
    private AssociatedList<Tweet> Retweets;
    private int tweetID;
    private AssociatedList<Image> Images;
    private Date date_posted;
    private static int numberOfTweets = 0;
    
    
    
    public String like(){
        likes++;
        return "The number of likes is: " + likes;
    }
    public void retweet(){}
    
    
    public String Notify(){
        String NotifMessage = "You have a new notification!";
        return NotifMessage;     
    }

    public Tweet(){}
    
    public Tweet(String text, int likes, AssociatedList<HashTag> HashTags,  AssociatedList<Tweet> Retweets, AssociatedList<Image> Images) throws EmptyTweetException {
        if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet/Fleet");
         }
        this.text = text;
        this.posted = new GregorianCalendar();
        this.likes = likes;
        this.HashTags = HashTags;
        this.Retweets = Retweets;               
        this.date_posted = Calendar.getInstance().getTime();
        this.tweetID =  ++numberOfTweets;
        this.Images = Images;
       
    }
      public Tweet(String text, int likes, AssociatedList<HashTag> HashTags, AssociatedList<Image> Images) throws EmptyTweetException {
        if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet/Fleet");
         }
        this.text = text;
        this.posted = new GregorianCalendar();
        this.likes = likes;
        this.HashTags = HashTags;             
        this.date_posted = Calendar.getInstance().getTime();
        this.tweetID =  ++numberOfTweets;
        this.Images = Images;
    }
 
        public Tweet(String text, Date date_posted) throws EmptyTweetException {
               if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet/ Fleet");
               }
               this.text = text;
               this.likes = 0;
               this.date_posted = date_posted;
               this.tweetID = ++numberOfTweets;
        }

    public Tweet(String text, int likes, AssociatedList<HashTag> HashTags, AssociatedList<Image> Images, Date date_posted) {
        this.text = text;
        this.likes = likes;
        this.HashTags = HashTags;
        this.Images = Images;
        this.date_posted = date_posted;
    }
        
        public Tweet(String text) throws EmptyTweetException {
               if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet");
               }
            this.text = text;
            this.likes = 0;
            this.posted = new GregorianCalendar();        
            this.date_posted = Calendar.getInstance().getTime();
            this.tweetID =  ++numberOfTweets;
        }    
        public Tweet(String text,AssociatedList<HashTag> HashTags) throws EmptyTweetException {
            if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet");
            }
            this.text = text;
            this.likes = 0;
            this.posted = new GregorianCalendar();        
            this.date_posted = Calendar.getInstance().getTime();
            this.tweetID =  ++numberOfTweets;
            this.HashTags = HashTags;
        }      
        public Tweet(String text,String txt) throws EmptyTweetException {
               if (text.isEmpty()) {
                  throw new EmptyTweetException("You cannot create an empty Tweet");
               }
            this.text = text;
            this.likes = 0;
            this.posted = new GregorianCalendar();
        }
           
        
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GregorianCalendar getPosted() {
        return posted;
    }

    public void setPosted(GregorianCalendar posted) {
        this.posted = posted;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getTweet_ID() {
        return tweetID;
    }

    public void setTweet_ID(int tweetID) {
        this.tweetID = tweetID;
    }

    public AssociatedList<HashTag> getHashTags() {
        return HashTags;
    }

    public void setHashTags(AssociatedList<HashTag> HashTags) {
        this.HashTags = HashTags;
    }

    public AssociatedList<Tweet> getRetweets() {
        return Retweets;
    }

    public void setRetweets(AssociatedList<Tweet> Retweets) {
        this.Retweets = Retweets;
    }

    public AssociatedList<Image> getImages() {
        return Images;
    }

    public void setImages(AssociatedList<Image> Images) {
        this.Images = Images;
    }

    public Date getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(Date date_posted) {
        this.date_posted = date_posted;
    }

    public static int getNumberOfTweets() {
        return numberOfTweets;
    }

    public static void setNumberOfTweets(int numberOfTweets) {
        Tweet.numberOfTweets = numberOfTweets;
    }
    
   
       
    @Override
    public String toString() {
        return "Tweet: " + "text: " + text + ", posted: " + date_posted + ", likes:" + likes + ", Tweet ID: " + tweetID + '.';
    }
}