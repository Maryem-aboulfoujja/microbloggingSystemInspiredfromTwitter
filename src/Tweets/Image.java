/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweets;

import Aggregations.AssociatedList;
import Users.Account;
import java.io.Serializable;



public class Image implements Serializable {
    private AssociatedList<Account> tagged;
    private String file;
    private String caption;
    
    
    public void addTag(){}

    public Image(String file, String caption, AssociatedList<Account> tagged) {
        this.file = file;
        this.caption = caption;
        this.tagged = tagged;
    }

    public Image(String file) {
        this.file = file;
    }
    
    

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public AssociatedList<Account> getTagged() {
        return tagged;
    }

    public void setTagged(AssociatedList<Account> tagged) {
        this.tagged = tagged;
    }

    

    @Override
    public String toString() {
        return "Image:\n " + "file: " + file + ", caption: " + caption + "tagged: " + tagged.toString() + ".";
    }
    
     @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Image) && (((Image)obj).getFile()).equals(file));
    }
    
}
