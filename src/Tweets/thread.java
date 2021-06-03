/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweets;

import Aggregations.AssociatedList;


public class thread  {
    private Tweet tweet;
    private AssociatedList<Tweet> Replies;
    public void reply(){}

    public thread(Tweet tweet, AssociatedList<Tweet> Replies) {
        this.tweet = tweet;
        this.Replies = Replies;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public AssociatedList<Tweet> getReplies() {
        return Replies;
    }

    public void setReplies(AssociatedList<Tweet> Replies) {
        this.Replies = Replies;
    }
    

    @Override
    public String toString() {
        return "thread: \n" + "tweet: " + tweet + ", Replies: " + Replies + '.';
    }
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof thread) && (((thread)obj).getTweet()).equals(tweet));
    }
    
}
