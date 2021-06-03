/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import Aggregations.AssociatedList;
import Tweets.Tweet;
import java.util.List;


public class Moment {
    

    
    private String Title;
    private String Description;
    private String Cover_image;
    AssociatedList<Tweet> Tweets;
    public void addTweet(){}

    public Moment(String Title, String Description, String Cover_image, AssociatedList<Tweet> Tweets) {
        this.Title = Title;
        this.Description = Description;
        this.Cover_image = Cover_image;
        this.Tweets = Tweets;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCover_image() {
        return Cover_image;
    }

    public void setCover_image(String Cover_image) {
        this.Cover_image = Cover_image;
    }

    public AssociatedList<Tweet> getTweets() {
        return Tweets;
    }

    public void setTweets(AssociatedList<Tweet> Tweets) {
        this.Tweets = Tweets;
    }
    
    @Override
    public String toString() {
        return "Moment: " + "Title: " + Title + ", Description: " + Description + ", Cover_image: " + Cover_image + ", Tweets: " + Tweets + '.';
    }
    
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Moment) && (((Moment)obj).getTitle()).equals(Title));
    }
    
}
