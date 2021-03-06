/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.ActionEvent;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.diaalog.AddCurrency;
import pkg1_second_applicationvalet.gi.diaalog.СonvertVal;
import pkg1_second_applicationvalet.settings.HandlerCode;

/**
 *
 * @author Omen
 */
public class FunctionToolBarHandler extends Handler{
    
    public FunctionToolBarHandler(MainFrame frame) {
        super(frame);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.TOOLBAR_ACCOUNTS:
               new AddCurrency(frame).setVisible(true);
                break;
            case HandlerCode.TOOLBAR_CALCULATIONS:
                new СonvertVal(frame).setVisible(true);
                break;
        }
        super.actionPerformed(ae);
    }
}
