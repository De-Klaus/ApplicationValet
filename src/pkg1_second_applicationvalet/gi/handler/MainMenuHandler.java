/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JOptionPane;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.diaalog.ConfirmDialog;
import pkg1_second_applicationvalet.gi.diaalog.ErrorDialog;
import pkg1_second_applicationvalet.saveload.SaveData;
import pkg1_second_applicationvalet.settings.HandlerCode;
import pkg1_second_applicationvalet.settings.Settings;

/**
 *
 * @author Omen
 */
public class MainMenuHandler extends Handler{
    
    public MainMenuHandler(MainFrame frame) {
        super(frame);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.MENU_FILE_SAVE: {
                
                if (Settings.getFileSave() == null) {
                    Settings.setFileSave(new File(Settings.SAVE_FILE_EXT));
                    }
                if (Settings.getFileSave() != null) SaveData.getInstance().save();
                break;
            }
            case HandlerCode.MENU_FILE_NEW: {
                SaveData.getInstance().clear();
                break;
            }
            case HandlerCode.MENU_FILE_UPDATE_CURRENCIES: {
                try {
                    SaveData.getInstance().updateCurrencies();
                } catch (Exception ex) {
                    ErrorDialog.show(frame, "ERROR_UPDATE_CURRENCIES");
                }
                break;
            }
            case HandlerCode.MENU_FILE_EXIT: {
                if (SaveData.getInstance().isSaved()) System.exit(0);
                else {
                    int result = ConfirmDialog.show(frame, "CONFIRM_EXIT_TEXT", "CONFIRM_EXIT_TITLE");
                    if (result == JOptionPane.YES_OPTION) System.exit(0);
                }
                break;
            }
        }
        super.actionPerformed(ae);
    }
    
}

