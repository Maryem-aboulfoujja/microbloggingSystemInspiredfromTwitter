/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Aggregations.AssociatedList;
import Features.Poll;
import Tweets.*;
import Features.*;
import java.util.regex.Pattern;


public class Account {
    private String username;
    private String password;
    private AssociatedList<Notification> Followers;
    private AssociatedList<Notification> Followings;
    private AssociatedList<Message> Sent;
    private AssociatedList<Message> Received;
    private AssociatedList<Tweet> Tweets;
    private AssociatedList<Poll> Polls;
    private Profile userProfile;
    private AssociatedList<SavedSearch> Searches;
    private AssociatedList<Moment> Moments;
    private AssociatedList<thread> Threads;
    private boolean is_authenticated;
    public boolean authenticate(){return is_authenticated;};
    public void changePass(){}
    
    private static final String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
    
    public Account(String username, String password, Profile userProfile) throws InvalidPasswordException{
        this.username = username;
        this.password = password;
        this.userProfile = userProfile;
          if (Pattern.compile(regex).matcher(password).matches()) {
            this.password = password;
        } else {
            throw new InvalidPasswordException("Invalid Password!");
        } 
    }
     public Account(String username) {
        this.username = username;
    }
    
     public Account(String username, String password, AssociatedList<Notification> Followers, AssociatedList<Notification> Followings, 
             AssociatedList<Message> Sent, AssociatedList<Message> Received, AssociatedList<Tweet> Tweets, AssociatedList<Poll> Polls, 
             Profile userProfile, AssociatedList<SavedSearch> Searches, AssociatedList<Moment> Moments, AssociatedList<thread> Threads, boolean is_authenticated) throws InvalidPasswordException{
        this(username, password, userProfile);
        this.Followers = Followers;
        this.Followings = Followings;
        this.Sent = Sent;
        this.Received = Received;
        this.Tweets = Tweets;
        this.Polls = Polls;
        this.Searches = Searches;
        this.Moments = Moments;
        this.Threads = Threads;
        this.is_authenticated = is_authenticated;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AssociatedList<Notification> getFollowers() {
        return Followers;
    }

    public void setFollowers(AssociatedList<Notification> Followers) {
        this.Followers = Followers;
    }

    public AssociatedList<Notification> getFollowings() {
        return Followings;
    }

    public void setFollowings(AssociatedList<Notification> Followings) {
        this.Followings = Followings;
    }

    public AssociatedList<Message> getSent() {
        return Sent;
    }

    public void setSent(AssociatedList<Message> Sent) {
        this.Sent = Sent;
    }

    public AssociatedList<Message> getReceived() {
        return Received;
    }

    public void setReceived(AssociatedList<Message> Received) {
        this.Received = Received;
    }

    public AssociatedList<Tweet> getTweets() {
        return Tweets;
    }

    public void setTweets(AssociatedList<Tweet> Tweets) {
        this.Tweets = Tweets;
    }

    public AssociatedList<Poll> getPolls() {
        return Polls;
    }

    public void setPolls(AssociatedList<Poll> Polls) {
        this.Polls = Polls;
    }

    public Profile getUser_profile() {
        return userProfile;
    }

    public void setUser_profile(Profile User_profile) {
        this.userProfile = User_profile;
    }

    public AssociatedList<SavedSearch> getSearches() {
        return Searches;
    }

    public void setSearches(AssociatedList<SavedSearch> Searches) {
        this.Searches = Searches;
    }

    public AssociatedList<Moment> getMoments() {
        return Moments;
    }

    public void setMoments(AssociatedList<Moment> Moments) {
        this.Moments = Moments;
    }

    public AssociatedList<thread> getThreads() {
        return Threads;
    }

    public void setThreads(AssociatedList<thread> Threads) {
        this.Threads = Threads;
    }

    public boolean isIs_authenticated() {
        return is_authenticated;
    }

    public void setIs_authenticated(boolean is_authenticated) {
        this.is_authenticated = is_authenticated;
    }
    
    

    @Override
    public String toString() {
        return "Account: " + "username: " + username + ", password: " + password + ", Followers: " + Followers + ", Followings=" + Followings + ", Sent=" + Sent + ", Received=" + Received + ", Tweets: " + Tweets + ", Polls: " + Polls + ", User profile: " + userProfile + ", Searches=" + Searches + ", Moments=" + Moments + ", Threads: " + Threads  + '.';
    }
    
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Account) && (((Account)obj).getUsername()).equals(username));
    }
    
    
    
}
