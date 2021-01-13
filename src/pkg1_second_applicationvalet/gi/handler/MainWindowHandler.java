/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.diaalog.ConfirmDialog;
import pkg1_second_applicationvalet.saveload.SaveData;

/**
 *
 * @author Omen
 */
public class MainWindowHandler extends WindowAdapter{
    
    @Override
    public void windowClosing(WindowEvent we) {
        if (SaveData.getInstance().isSaved()) System.exit(0);
        else {
            int result = ConfirmDialog.show((MainFrame) we.getWindow(), "CONFIRM_EXIT_TEXT", "CONFIRM_EXIT_TITLE");
            if (result == JOptionPane.YES_OPTION) System.exit(0);
        }
    }
}
