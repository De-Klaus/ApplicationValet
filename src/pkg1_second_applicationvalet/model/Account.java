/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.model;

import pkg1_second_applicationvalet.exception.ModelException.ModelException;
import pkg1_second_applicationvalet.saveload.SaveData;

/**
 *
 * @author Omen
 */
public class Account {
    
    
    private String currencyT;
    private double amountT;  
    
    public Account(){}

    public Account(String currency, double amount) throws ModelException{
        this.currencyT = currency;
        this.amountT = amount;
    }

   public void getBalanceCurrency(String currency, double amount) throws ModelException {
        
        double amountSumm;
        
        if (amount == 0) throw new ModelException(ModelException.CODE_EMPTY);
        if (currency == null) throw new ModelException(ModelException.CURRENCY_EMPTY);
        
        SaveData sd = SaveData.getInstance();
        if(sd.getAccounts().get(currency) == null){ 
            amountSumm = amount;
            sd.setAccountsAc(currency, amountSumm);
        }
        else if(sd.getAccounts().get(currency)>0||sd.getAccounts().get(currency)<0) {
            amountSumm = sd.getAccounts().get(currency) + amount;
            sd.setAccountsAc(currency, amountSumm);
        }
   }

    @Override
    public String toString() {
        return currencyT + ", " + amountT;
    }
   
   

}
