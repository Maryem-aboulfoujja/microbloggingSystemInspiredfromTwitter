/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Aggregations.AssociatedList;
import Tweets.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.io.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CRUDTwitterPanel extends javax.swing.JPanel {

    /**
     * Creates new form CRUDTwitterPanel
     */
    public static DefaultListModel<String> model,model1;      
    private AssociatedList<HashTag> HashTags;        
    private AssociatedList<Tweet> ReTweets;    
    private AssociatedList<Image> Images;
    public static AssociatedList<Tweet> Tweets = new AssociatedList<>();          
    public static Map<String,Tweet> TweetIDmap = new HashMap<>();
    public CRUDTwitterPanel() {


        HashTags = new AssociatedList<>();        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();          
        Tweet ret=null,ret1=null,ret2=null;       


        String txt1 = "During this lockdown period, people are feeling stressful due to covid19 situation in the country.";
        String txt2 = "I got to hug my best friends for the first time since #COVID19 started. Didn’t realize how much today meant to me until I left. So thankful for everything that led up to this moment today.";
        String txt3 = "The rolling average of new #COVID19 cases is 380 cases per day";
        String new_tweet = "Moroccan researchers that are tracking the epidemiology \n of the #COVID19  virus,"
                + "have found data suggesting that the virus may \n have "
                + "appeared in the country nas early as \n January, 2020 #Morocco #Health";
        
        try {
        ret = new Tweet(txt1,""); 
        ret1 = new Tweet(txt2,""); 
        ret2 = new Tweet(txt3,"");
        }catch(EmptyTweetException e){}
        ReTweets.addElement(ret); ReTweets.addElement(ret1); ReTweets.addElement(ret2);
        Image img = new Image("/GUIIcons/Covid.jpg","",new AssociatedList<>());
        Images.addElement(img);
        Tweet tweet1 = new Tweet();
        try{
        tweet1 = new Tweet(new_tweet,new Random().nextInt(10000),GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);  
        Images = new AssociatedList<>();
                     
        String ID1 = "Tweet #" + tweet1.getTweet_ID();
        TweetIDmap.put(ID1,tweet1);
        ReTweets= new AssociatedList<>();
         txt1 = "You, Palestinians  should have stopped Hamas from bombing Israel.";
         txt2 = "Martyrs ou bourreaux ! Google : enfants soldats gaza";
         txt3 = "This breaks my heart";
         new_tweet = "Even the way children play in Gaza is an exception They realize that they \n can be martyrs The game of death that became a reality before \n their eyes in every war #GazaUnderAttack";
        try {
        ret = new Tweet(txt1,""); 
        ret1 = new Tweet(txt2,""); 
        ret2 = new Tweet(txt3,"");
        }catch(EmptyTweetException e){}
        ReTweets.addElement(ret); ReTweets.addElement(ret1); ReTweets.addElement(ret2);
        tweet1 = new Tweet();
        img = new Image("/GUIIcons/Gaza.jpg","",new AssociatedList<>());
        Images.addElement(img);
     
        try{
        tweet1 = new Tweet(new_tweet,new Random().nextInt(10000),GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);   
        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();
        ID1 = "Tweet #" + tweet1.getTweet_ID();
        TweetIDmap.put(ID1,tweet1);
        
         txt1 = "Much better than Netflix translation! This just proves they are meant to be. Cha Young will go, and V will build the bridge between them, nothing else can happen, that's it";
         txt2 = "Thanks bestieee! U know what makes me mad with netflix is at how they choose to split the long dialogue ambiguously, like they should put the word tenacious like the way u did, so we can get the idea that he is tenacious when he is in love ";
         txt3 = "it's called I'm Always by Your Side by John Park!";
         new_tweet = "just wanted to do justice to #Chacenzo’s final conversation \n by getting the nuances across since Netflix failed to do so";
        try {
        ret = new Tweet(txt1,""); 
        ret1 = new Tweet(txt2,""); 
        ret2 = new Tweet(txt3,"");
        }catch(EmptyTweetException e){}
        ReTweets.addElement(ret); ReTweets.addElement(ret1); ReTweets.addElement(ret2);
        img = new Image("/GUIIcons/NETFLIX.jpg","",new AssociatedList<>());
        Images.addElement(img);
        tweet1 = new Tweet();
        try{
        tweet1 = new Tweet(new_tweet,new Random().nextInt(10000),GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);              
        ID1 = "Tweet #" + tweet1.getTweet_ID();
        TweetIDmap.put(ID1,tweet1);
        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();
        // fleet
        new_tweet = "The Akatsuki will forever be one of the best villain groups in all of Anime";
        img = new Image("/GUIIcons/AKATSUCHI.jpg","",new AssociatedList<>());
        Images.addElement(img);
        tweet1 = new Tweet();
        try{
        tweet1 = new Fleet(new_tweet,0,GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);  
        int IDD = tweet1.getTweet_ID();
        tweet1.setNumberOfTweets(IDD-1);
        ID1 = "Fleet #" + ((Fleet)tweet1).getFleetId();
        TweetIDmap.put(ID1,tweet1);
        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();
         txt3 = "Solidarity with the Palestinian people in the face of violent settler colonial policies and apartheid system founded on land theft, violence, and the denial\n" +
                 "of basic human rights";
         new_tweet = "The international community has failed repeatedly to hold Israel accountable for its continuous violations\nof International Humanitarian and Human Rights" +
         "law, in effect continually undermining\nthe international legal system #StopImpunity #WeStandWithPalestine #WeStandWithGaza";
        try {
        ret = new Tweet(txt3,"");
        }catch(EmptyTweetException e){}
        ReTweets.addElement(ret);
        tweet1 = new Tweet();
        img = new Image("/GUIIcons/solidarity.jpg","",new AssociatedList<>());
        Images.addElement(img);
        try{
        tweet1 = new Tweet(new_tweet,new Random().nextInt(10000),GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);        
        ID1 = "Tweet #" + tweet1.getTweet_ID();
        TweetIDmap.put(ID1,tweet1);
        new_tweet = "We always talk about Pharrell but Ludacris done looked the same since I was in 3rd grade lol";
        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();
        tweet1 = new Tweet();

        try{
        tweet1 = new Fleet(new_tweet,0,GetHashTags(new_tweet),ReTweets,Images);
        } catch(EmptyTweetException e){}
        Tweets.addElement(tweet1);
        ReTweets = new AssociatedList<>();
        Images = new AssociatedList<>();
        IDD = tweet1.getTweet_ID();
        tweet1.setNumberOfTweets(IDD-1);
        ID1 = "Fleet #" + (((Fleet)tweet1).getFleetId());
        TweetIDmap.put(ID1,tweet1);
        model = new DefaultListModel<>();
        initComponents();
        String path= System.getProperty("user.dir")+ File.separator + "data" + File.separator + "twitter.ser";
        try{
            FileInputStream fis = new FileInputStream(path);
            try (ObjectInputStream in = new ObjectInputStream(fis)) {
                List <Object> p = (List<Object>) in.readObject();
                for (Object k:p ){
                if (k instanceof AssociatedList)
                    Tweets = (AssociatedList)k;
                if (k instanceof HashMap){
                    TweetIDmap = (HashMap) k;
                }
            }  
           }
        }catch(IOException | ClassNotFoundException d){
          //  System.out.println(d);
        }
        

        TweetsIDs.setModel(model); 
        ListIterator<Tweet> k = Tweets.getElements().listIterator();
        while(k.hasNext()){
            Tweet newone = k.next();
           if (newone.getClass() ==  Fleet.class){
             model.addElement("Fleet #"+((Fleet)newone).getFleetId());      
           }
           
           if (newone.getClass() ==  Tweet.class){
             model.addElement("Tweet #"+(newone).getTweet_ID());      
           }
             
           
          }
        
        Like.setEditable(false);
        Date.setEditable(false);
        seenby.setEnabled(false);

    }
 class jPanelGradient extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        Color color1 = new Color (102,204,0);
        Color color2 = new Color (20,20,0);
        GradientPaint gp = new GradientPaint (0,0,color1,1000,400,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0,width,height);
    }
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new jPanelGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TweetsIDs = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Like = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        showimage = new javax.swing.JButton();
        showretweets = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        seenby = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TweetText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Hashtags = new javax.swing.JList<>();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/twitterlogo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/auilogo.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Candara", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("F R O M     A B O U L F O U J J A ,  B E N J E L L O U N ,  E L B O U A Z Z A O U I ");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add - View Tweets");

        Addbutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Addbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/add.png"))); // NOI18N
        Addbutton.setText("Add Tweet");
        Addbutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Addbutton.setIconTextGap(10);
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        editbutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        editbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/edit.png"))); // NOI18N
        editbutton.setText("Edit Tweet");
        editbutton.setIconTextGap(10);
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/delete.png"))); // NOI18N
        jButton3.setText("Delete Tweet");
        jButton3.setIconTextGap(10);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/Back.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TweetsIDs.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                TweetsIDsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(TweetsIDs);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tweet Text (don't forget to include hashtags)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hashtags");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIIcons/heart.png"))); // NOI18N
        jLabel11.setText("Likes");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Like.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        //
        Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikeActionPerformed(evt);
            }
        });

        Date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showimage.setBackground(new java.awt.Color(51, 51, 51));
        showimage.setForeground(new java.awt.Color(255, 255, 255));
        showimage.setText("Show Image");
        showimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showimageActionPerformed(evt);
            }
        });

        showretweets.setBackground(new java.awt.Color(51, 51, 51));
        showretweets.setForeground(new java.awt.Color(255, 255, 255));
        showretweets.setText("Show Retweets");
        showretweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showretweetsActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fleet's Views");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        seenby.setBackground(new java.awt.Color(51, 51, 51));
        seenby.setForeground(new java.awt.Color(255, 255, 255));
        seenby.setText("Seen By");
        seenby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seenbyActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tweet's Data");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tweets' IDs");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        TweetText.setColumns(20);
        TweetText.setRows(5);
        jScrollPane2.setViewportView(TweetText);

        jScrollPane3.setViewportView(Hashtags);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Like)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(showretweets, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(seenby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(Like, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showimage)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(showretweets)
                                .addComponent(seenby))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    final public AssociatedList<HashTag> GetHashTags(String text){
            int flag = 0;                 
            AssociatedList <HashTag> new_hashtag = new AssociatedList<>(); 
            String tmp = "";
            for (int i = 0 ;i<text.length();i++){
                if (text.charAt(i) == ' ') {
                    flag = 0;
                    if (!tmp.isEmpty()){
                        new_hashtag.addElement(new HashTag(tmp));
                        tmp="";
                    }
                }
                else if (text.charAt(i) == '#' || flag == 1){
                    flag = 1;
                    tmp += text.charAt(i);
                }                 
            }
             if (!tmp.isEmpty()){
                        new_hashtag.addElement(new HashTag(tmp));
             }
             return new_hashtag;
        
    }
    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
         Tweet new_tweet;          
         String ID1="";
         ReTweets = new AssociatedList<>();
         Images = new AssociatedList<>();
         try{
             String text = TweetText.getText();
             if (text.length() > 280){
                JOptionPane.showMessageDialog(this.Addbutton, "Sorry, the Tweet Text Cannot Exceed 280 Characters!", "Error", JOptionPane.ERROR_MESSAGE);
                   return;
             }
          Object[] options = { "Tweet", "Fleet" }; 
          int result = JOptionPane.showOptionDialog(null, "Please, choose the type of your Post", "Type", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
         if (result == JOptionPane.NO_OPTION){

            JOptionPane.showMessageDialog(this.Addbutton, "Your fleet has been posted successfully!", "Fleet Posted Successfully", JOptionPane.INFORMATION_MESSAGE);
            new_tweet = new Fleet(text,0,GetHashTags(text),ReTweets,Images);

            int IDD = new_tweet.getTweet_ID();
            new_tweet.setNumberOfTweets(IDD-1);
            ID1 = "Fleet #" + ((Fleet)new_tweet).getFleetId();
          }
          else if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this.Addbutton, "Your tweet has been posted successfully!", "Tweet Posted Successfully", JOptionPane.INFORMATION_MESSAGE);
            new_tweet = new Tweet(text,0,GetHashTags(text),ReTweets,Images);
            ID1 = "Tweet #" + new_tweet.getTweet_ID(); 

          }
          else return;
            
         }catch(EmptyTweetException e){
             JOptionPane.showMessageDialog(this.Addbutton, "Sorry, the Tweet Text is Empty!", "Error", JOptionPane.ERROR_MESSAGE);
             return;
         }

          TweetIDmap.put(ID1,new_tweet);
          Tweets.addElement(new_tweet);
           if (new_tweet.getClass() ==  Fleet.class){
             model.addElement("Fleet #"+((Fleet)new_tweet).getFleetId());      
           }
           
           if (new_tweet.getClass() ==  Tweet.class){
             model.addElement("Tweet #"+(new_tweet).getTweet_ID());      
           }
        
           

    }//GEN-LAST:event_AddbuttonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            TwitterAppGUI.getJtab().setSelectedIndex(0);
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void TweetsIDsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_TweetsIDsValueChanged
            if (TweetsIDs.isSelectionEmpty())
                return;
            Tweet selTweet = (Tweet) TweetIDmap.get(TweetsIDs.getSelectedValue());
            TweetText.setText(selTweet.getText());
            Like.setText(selTweet.getLikes()+"");
            Date.setText(selTweet.getDate_posted()+"");            
            Like.setCaretPosition(0);
            Date.setCaretPosition(0);
            TweetText.setCaretPosition(0);
            String text = TweetText.getText();
            HashTags = GetHashTags(text);
            model1 = new DefaultListModel();
            Hashtags.setModel(model1);
            ListIterator<HashTag> i = HashTags.getElements().listIterator();
            while(i.hasNext()){
                HashTag temp = i.next();
                model1.addElement(temp.getHashtag());  
              }
               if (selTweet instanceof Fleet){
                   seenby.setEnabled(true);
               }
               else seenby.setEnabled(false);
              
            // TODO add your handling code here:
    }//GEN-LAST:event_TweetsIDsValueChanged

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
           Tweet selTweet = TweetIDmap.get(TweetsIDs.getSelectedValue());
           String new_tweet = TweetText.getText();
           if (selTweet.getText().equals(new_tweet)){
               JOptionPane.showMessageDialog(this.editbutton, "Sorry, You did not change anything in your text", "Error", JOptionPane.ERROR_MESSAGE);     
               return;
           }
           if (new_tweet.isEmpty()){
             JOptionPane.showMessageDialog(this.editbutton, "Sorry, the Tweet Text is Empty!", "Error", JOptionPane.ERROR_MESSAGE);     
             return;
           }
            if (new_tweet.length() > 280){
                JOptionPane.showMessageDialog(this.editbutton, "Sorry, the Tweet Text Cannot Exceed 280 Characters!", "Error", JOptionPane.ERROR_MESSAGE);
                   return;
             }
           selTweet.setText(new_tweet);
           ListIterator<Tweet> t = Tweets.getElements().listIterator();           
           while(t.hasNext()){
                Tweet temp = t.next();
                if (temp instanceof Tweet){
                    if(temp.getTweet_ID() == selTweet.getTweet_ID()){                    
                        temp.setText(new_tweet);
                        String ID1 = "Tweet #" + temp.getTweet_ID();
                        TweetIDmap.put(ID1,temp);
                        break;
                    } 
                }
                else {
                     if(temp.getTweet_ID() == selTweet.getTweet_ID()){                    
                        temp.setText(new_tweet);
                        String ID1 = ("Fleet #"+((Fleet)temp).getFleetId());
                        TweetIDmap.put(ID1,temp);
                        break;
                    } 
                }
             }
           
            HashTags = GetHashTags(new_tweet);
            selTweet.setHashTags(HashTags);
            model1 = new DefaultListModel();
            ListIterator<HashTag> i = HashTags.getElements().listIterator();
            while(i.hasNext()){
                HashTag temp = i.next();
                model1.addElement(temp.getHashtag());  
            }
            Hashtags.setModel(model1);
           JOptionPane.showMessageDialog(this.editbutton, "Your tweet has been edited successfully!", "Tweet edited Successfully", JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_editbuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            Tweet selTweet = TweetIDmap.get(TweetsIDs.getSelectedValue());
            Date.setText("");
            Like.setText("");
            TweetText.setText("");
            ListIterator<Tweet> t = Tweets.getElements().listIterator();           
            while(t.hasNext()){
                Tweet temp = t.next();
                if(temp.getTweet_ID() == selTweet.getTweet_ID()){   
                    Tweets.removeElement(temp);
                    break;
                } 
             }

            model = new DefaultListModel();
            ListIterator<Tweet> i = Tweets.getElements().listIterator();
            while(i.hasNext()){
                Tweet newone = i.next();
               if (newone instanceof Fleet){
                 model.addElement("Fleet #"+((Fleet)newone).getFleetId());      
               }else {
                model.addElement("Tweet #"+newone.getTweet_ID());  
              }
              }
            model1.removeAllElements();
            TweetsIDs.setModel(model);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showimageActionPerformed
        Tweet selTweet = TweetIDmap.get(TweetsIDs.getSelectedValue());
 
        if (selTweet.getImages().GetLength() == 0){
            JOptionPane.showMessageDialog(null, "Sorry, No Image was added to this post",     "No Image", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String path = ((Image)selTweet.getImages().getElementat(0)).getFile();
        ImageIcon img = (new javax.swing.ImageIcon(getClass().getResource(path)));
        JLabel label = new JLabel(img);
        JPanel panel = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel (new BorderLayout());
        panel2.add(panel,BorderLayout.EAST);
        JOptionPane.showMessageDialog(null, "",     "Tweet Image", JOptionPane.DEFAULT_OPTION, img);
    // TODO add your handling code here:
    }//GEN-LAST:event_showimageActionPerformed

    private void seenbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seenbyActionPerformed
        
        Object[] columnNames = new Object[] {"Username", "Date"};
        Object[][] rowData = new Object[][] {
            {"Dr. Asmaa Mourhir", Calendar.getInstance().getTime()}, 
        };
         
         
        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);         
        JTable table = new JTable(tableModel);
        JOptionPane.showMessageDialog(null, new JScrollPane(table),"Fleet Seen By",  
                                       JOptionPane.INFORMATION_MESSAGE);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_seenbyActionPerformed

    private void showretweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showretweetsActionPerformed
        Tweet selTweet = (Tweet) TweetIDmap.get(TweetsIDs.getSelectedValue());
        


        Object[] columnNames = new Object[] {"Retweet Text"};
        Object[][] rowData;
        List <String> RetweetsTxt = new ArrayList();

        if(selTweet.getRetweets().GetLength() > 0){   
        ListIterator<Tweet> k = selTweet.getRetweets().getElements().listIterator();           
        while(k.hasNext()){
            Tweet p = k.next();
            RetweetsTxt.add(p.getText());
        }
        }

        if (RetweetsTxt.isEmpty() || selTweet.getRetweets().GetLength() == 0  ){
            JOptionPane.showMessageDialog(null,"Oops! No retweets so far.","Oops!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        rowData = new Object[RetweetsTxt.size()][1];
        for (int i = 0 ; i<RetweetsTxt.size();i++){
            rowData[i][0] = RetweetsTxt.get(i); 
        }
        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);         
        JTable table = new JTable(tableModel);
        JOptionPane.showMessageDialog(null, new JScrollPane(table),"Retweets",  
                                       JOptionPane.INFORMATION_MESSAGE);
           
        
            // TODO add your handling code here:
    }//GEN-LAST:event_showretweetsActionPerformed

    private void LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LikeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JTextField Date;
    private javax.swing.JList<String> Hashtags;
    private javax.swing.JTextField Like;
    private javax.swing.JTextArea TweetText;
    private javax.swing.JList<String> TweetsIDs;
    private javax.swing.JButton editbutton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton seenby;
    private javax.swing.JButton showimage;
    private javax.swing.JButton showretweets;
    // End of variables declaration//GEN-END:variables
}
