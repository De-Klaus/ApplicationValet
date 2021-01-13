/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.settings;



/**
 *
 * @author Omen
 */
final public class Format {
    
    public static String amount(double amount) {
        return String.format(Settings.FORMAT_AMOUNT, amount);
    }
    
       
    public static double fromAmountToNumber(String amount) throws NumberFormatException {
        amount = amount.replaceAll(",", ".");
        return Double.parseDouble(amount);
    }
    
    public static String yesNo(boolean yes) {
        if (yes) return Text.get("YES");
        return Text.get("NO");
    }
    
}
