/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.model;

import java.util.HashMap;
import static pkg1_second_applicationvalet.model.currency.RateCurrency.getRates;
import pkg1_second_applicationvalet.saveload.SaveData;

/**
 *
 * @author Omen
 */
public class Calculation {
    
    private String valF;
    private String vaiS;
    private double kol;
    private double itog;
    
    public Calculation(){}
    
    public Calculation(String valF, String vaiS, double kol, double itog){
        this.valF = valF;
        this.vaiS = vaiS;
        this.kol = kol;  
        this.itog = itog;
    }
    
    public void calculations(String valFI, String vaiSI, double kolI) throws Exception{
        HashMap<String, Double> rates = getRates();
        
        itog = ((double) Math.round((rates.get(valFI)/rates.get(vaiSI))*kolI)*1000) / 1000;
                 
        SaveData sd = SaveData.getInstance();   
        sd.setTransaction(kolI + " " + valFI, itog + " " + vaiSI);        
    }
    
}
