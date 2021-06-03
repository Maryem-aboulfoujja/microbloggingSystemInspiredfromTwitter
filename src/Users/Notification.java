/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Aggregations.AssociatedList;


public class Notification {
    private AssociatedList<Account> relatedTo;
    private boolean notif;
    public void on_off(){}

    public Notification(boolean notif, AssociatedList<Account> relatedTo) {
        this.notif = notif;
        this.relatedTo = relatedTo;
    }

    public boolean isNotif() {
        return notif;
    }

    public void setNotif(boolean notif) {
        this.notif = notif;
    }

    public AssociatedList<Account> getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(AssociatedList<Account> relatedTo) {
        this.relatedTo = relatedTo;
    }
    
    

    @Override
    public String toString() {
        return "Notification: \n" + "notif: " + notif + '.';
    }
    
}
