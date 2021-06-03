/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Aggregations.AssociatedList;
import java.util.GregorianCalendar;
 

public class Message {
    private AssociatedList<Account> sentBy;
    private String text;
    private GregorianCalendar date;
    private Account sender_receiver;
    private MessageType Message_Type;

    public Message(String text, Account sender_receiver, String MessageTypeStr,AssociatedList<Account> sentBy ) {
        this.text = text;
        this.date = new GregorianCalendar();
        this.sender_receiver = sender_receiver;
        setMessage_type(MessageTypeStr);
        this.sentBy = sentBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate() {
        this.date = new GregorianCalendar();
    }

    public Account getSender_receiver() {
        return sender_receiver;
    }

    public void setSender_receiver(Account sender_receiver) {
        this.sender_receiver = sender_receiver;
    }
    public String getMessageType(){
        return Message_Type.toString();
    }
    public void setMessage_type(String MessageTypeStr){
        this.Message_Type =  MessageType.valueOf(MessageTypeStr.toUpperCase());
    }

    public AssociatedList<Account> getSentBy() {
        return sentBy;
    }

    public void setSentBy(AssociatedList<Account> sentBy) {
        this.sentBy = sentBy;
    }
    
    @Override
    public String toString() {
        return "The message: \n" + "\t text: " + text + ", date: " + date + ", sender_receiver: " + sender_receiver + ", Message Type: " + Message_Type.toString() + '.';
    }
    
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Message) && (((Message)obj).getText()).equals(text));
    }
}
   
