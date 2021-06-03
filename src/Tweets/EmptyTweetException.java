/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweets;

/**
 *
 * @author admin
 */
public class EmptyTweetException extends Exception {
    
       
    public EmptyTweetException(String msg) {
        super(msg);
    }
    
    public String[] suggestTweets() {
        
        String suggestedMessages[] = {"Hello Everyone,", "How is it going guys?", "Nice day", "Enjoy your day"};
        return suggestedMessages;
    }
}
