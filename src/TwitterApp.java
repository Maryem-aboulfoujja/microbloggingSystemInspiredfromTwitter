/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import Users.*;
import Tweets.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
;


public class TwitterApp {
      public static void main(String[] args) {
          
          
        Scanner input = new Scanner(System.in);
        Tweet _new;
        
        System.out.println("********* Welcome to Twitter *********");
        System.out.println("********* Let us create an account for you!*********");
        System.out.println("********* Please enter the following profile information*********");
        System.out.println("--> Enter your Email: ");
        String Email = input.nextLine();
        //input.nextLine();
        System.out.println("--> Write your Bio: ");
        String Description = input.nextLine();
        System.out.println("--> Enter your Phone Number : ");
        String Phone = input.nextLine();
        System.out.println("--> Enter 5 topics you are interested in : ");
        ArrayList<String> topics = new ArrayList<String>();
        for (int i = 0 ; i < 5 ; i++){
            topics.add(input.next());
        }
        topics.add(input.nextLine());
        
        Profile newProfile = new Profile(Email,Description,"DefaultAvatar ",Phone,topics);
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        while(true){
        try{
        System.out.println("--> Enter your password (Make sure to use Capital and low case letters and numbers): ");
        String password = input.nextLine();
        Account new_account = new Account(username,password,newProfile);
        System.out.println("Thank you ! Your Profile has been created successfully and you are a Twitter Member!\n");
        System.out.println("Here is your profile information: " + newProfile.toString());
        break;
        }catch(InvalidPasswordException ex){
            System.err.println(ex.getMessage());
            System.err.println(ex.suggestPassword());
        }
        }
        
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        
        boolean flag = true;
         while(true){
            try{
                if(flag){
                    System.out.println("Let's Create you first text Tweet! ");
                    System.out.println("Write your tweet text: ");
                    String text = input.nextLine();
                    _new = new Tweet(text, date);
                    System.out.println("Congratulations! Here is your first tweet: \n" + _new.toString());
                    System.out.println(_new.Notify());
                    System.out.println(_new.like());
                    flag = false; 
                }
                
                
                 System.out.println("Write your fleet text:");
                 String newFleet = input.nextLine();
                 _new = new Fleet(newFleet, date); // Upcasting
                 System.out.println(_new.toString()); //Polymorphic Call 
                 System.out.println(_new.Notify()); // Polymorphic Call
                 System.out.println(_new.like()); //Polymorphic Call
                 
                if( _new instanceof Fleet){
                    Fleet newF = (Fleet) _new; // DownCasting
                    System.out.println(newF.reply());    
                }
                 break;
                 
            }catch(EmptyTweetException ex){
                 System.err.println(ex.getMessage());
                 String[] suggestionsTweets = ex.suggestTweets();
                 for (String s : suggestionsTweets ){
                 System.err.println(s);
                 }
            }
        }
  
        System.out.println("********Good bye! Have a Great day!********");
        
        }         
}
