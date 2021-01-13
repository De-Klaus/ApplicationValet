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
public class ConfirmDialog {
    public static int show(MainFrame frame, String text, String title) {
        String[] options = {Text.get("YES"), Text.get("NO")};
        int result = JOptionPane.showOptionDialog(frame, Text.get(text), Text.get(title), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        return result;
    }
}
