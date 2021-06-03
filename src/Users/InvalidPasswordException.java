/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author admin
 */
public class InvalidPasswordException extends Exception{
   
    public InvalidPasswordException (String msg){
        super(msg);
    }
    
    public String suggestPassword() {
        
        String suggestedPassword = "";
        
        for (int i = 0; i < 12; ++i) {
            int randomNumber = (int)(Math.random() * 100) % 26;
            if (i % 3 == 0) {
                suggestedPassword += String.valueOf((randomNumber));
            } else if (i % 2 != 0) {
                suggestedPassword += String.valueOf((char)('a' + randomNumber));
            }
            else {
                suggestedPassword += String.valueOf((char)('A' + randomNumber));
            }
        }
        
        return suggestedPassword;
    }
    
}
