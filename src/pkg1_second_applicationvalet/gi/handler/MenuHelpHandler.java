/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.ActionEvent;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.diaalog.MassageDialog;
import pkg1_second_applicationvalet.settings.HandlerCode;

/**
 *
 * @author Omen
 */
public class MenuHelpHandler extends Handler{

    public MenuHelpHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case HandlerCode.MENU_HELP_ABOUT: {
                new MassageDialog().setVisible(true);
            }
        }
        super.actionPerformed(ae);
    }
}
