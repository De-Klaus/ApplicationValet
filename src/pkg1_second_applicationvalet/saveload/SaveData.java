/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.saveload;

import java.util.HashMap;


import pkg1_second_applicationvalet.model.currency.RateCurrency;


/**
 *
 * @author Omen
 */
public final class SaveData {
    
    private static SaveData instance;
    private HashMap<String, Double> accounts = new HashMap();
    private HashMap<String, String> transaction = new HashMap();
    
    private boolean saved = true;
    
        
    private SaveData() {
        load();
    }
    
    public void load(){
        SaveLoad.load(this);
    }
    
    public void falseFile(){
        saved = false;
    }
       
    public void save(){
        SaveLoad.save(this);
        saved = true;
    }
    
    public void clear() {   
        accounts.clear();
    }
    
    public boolean isSaved(){
        return saved;
    }
    
    public static SaveData getInstance(){
        if (instance == null) instance = new SaveData();
        return instance;
    } 

    public void setAccounts(HashMap<String, Double> accounts) {        
        this.accounts = accounts;
    }
    
    public void setAccountsAc(String currencies, double amount) {
        accounts.put(currencies, amount);
    }
    
    public HashMap<String, Double> getAccounts() {
        return accounts;   
    }
    
    public void setTransaction(String currencies, String amount) {
        transaction.put(currencies, amount);
    }
    
    public HashMap<String, String> getTransaction() {
        return transaction;   
    }

      public void updateCurrencies() throws Exception {
        new RateCurrency();
        saved = false;
    }
}
