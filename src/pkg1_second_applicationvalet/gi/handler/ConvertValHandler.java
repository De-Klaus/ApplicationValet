/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.diaalog.СonvertVal;
import pkg1_second_applicationvalet.settings.HandlerCode;

/**
 *
 * @author Omen
 */
public class ConvertValHandler extends Handler{
    
    private final СonvertVal dialog;
    
    
    public ConvertValHandler(MainFrame frame, СonvertVal dialog) {
        super(frame);
        this.dialog = dialog;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.ADD:
        {
            try {
                dialog.sentMassage();
                
            } catch (Exception ex) {
                Logger.getLogger(ConvertValHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case HandlerCode.CANCEL:
                dialog.closeDialog();
                break;
        }
    }
}
