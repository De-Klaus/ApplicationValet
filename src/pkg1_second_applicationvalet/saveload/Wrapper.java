/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.saveload;

import java.util.HashMap;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Omen
 */
@XmlRootElement (name = "date")
public class Wrapper {
    
    private HashMap<String, Double> accounts;
    

    @XmlElement(name = "accounts")
    public HashMap<String, Double> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<String, Double> accounts) {
        this.accounts = accounts;
    }
       
    

   
    
    
    
}
