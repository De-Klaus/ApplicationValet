/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet;

import pkg1_second_applicationvalet.exception.ModelException.ModelException;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.settings.Settings;
import static pkg1_second_applicationvalet.settings.Text.init;

/**
 *
 * @author Omen
 */
public class ForeignCurrencyAccounts {

    /**
     * @param args the command line arguments
     * @throws pkg1_second_applicationvalet.exception.ModelException.ModelException
     */
    public static void main(String[] args) throws ModelException, Exception {
        // TODO code application logic here
        init();
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        Settings.init();
    }
}
