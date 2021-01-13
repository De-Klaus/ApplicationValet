/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.diaalog;

import javax.swing.JOptionPane;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class ErrorDialog {
    
    public static void show(MainFrame frame, String text) {
        JOptionPane.showMessageDialog(frame, Text.get(text), Text.get("ERROR"), JOptionPane.ERROR_MESSAGE);
    }
}
