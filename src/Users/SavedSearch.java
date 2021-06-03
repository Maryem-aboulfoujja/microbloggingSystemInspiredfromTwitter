/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.List;


public class SavedSearch {
    private List<String> Keywords;
    private Account account;
    
    public void Notify(){}

    public SavedSearch(List<String> Keywords, Account account) {
        this.Keywords = Keywords;
        this.account = account;
    }

    public List<String> getKeywords() {
        return Keywords;
    }

    public void setKeywords(List<String> Keywords) {
        this.Keywords = Keywords;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    

    @Override
    public String toString() {
        return "SavedSearch: \n" + "Keywords:" + Keywords + ", account: " + account + '.';
    }
    
}
