/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweets;

import Aggregations.AssociatedList;
import java.io.Serializable;



public class HashTag implements Serializable {
    
   
    private String hashtag;
    private AssociatedList<Tweet> Tweets;

    public HashTag(String hashtag, AssociatedList<Tweet> Tweets) {
        this.hashtag = hashtag;
        this.Tweets = Tweets;
    }
    public HashTag(String hashtag) {
        this.hashtag = hashtag;
    }
    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public AssociatedList<Tweet> getTweets() {
        return Tweets;
    }

    public void setTweets(AssociatedList<Tweet> Tweets) {
        this.Tweets = Tweets;
    }
    
    
    
    @Override
    public String toString() {
        return "HashTag: \n" + "hashtag: " + hashtag + ", Tweets: " + Tweets + '.';
    }
    
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof HashTag) && (((HashTag)obj).getHashtag()).equals(hashtag));
    }
}
